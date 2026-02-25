package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FileUtil;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.yarn.webapp.hamlet2.Hamlet;
import org.example.utils.Vector;

import java.io.*;
import java.net.URI;
import java.nio.file.Files;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class silhouette {
    private final static String CENTROIDS_FORMATTED = "centroids_formatted";
    private final static String CENTROIDS_CLOSEST_CENTROIDS = "centroids_closest_centroids";
    private final static String POINTS_CLOSEST_CENTROIDS = "points_closest_centroids";
    private final static String COUNT_CENTROIDS = "count_centroids";
    private final static String A_PAIRS = "A_pairs";
    private final static String B_PAIRS = "B_pairs";
    private final static String A_VALUES = "A_values";
    private final static String B_VALUES = "B_values";
    private final static String JOINFILE = "joinfile";


    public static class closestCentMapper
            extends Mapper<Object, Text, Text, Text> {
        private List<String> vlist = new ArrayList<>();
        private Text tWrite1 = new Text();
        private Text tWrite2 = new Text();

        @Override
        protected void setup(Context context) throws IOException {
            /*
            Takes in centroids as a cache file
             */
            URI[] cacheFiles = context.getCacheFiles();
            if (cacheFiles != null) {
                for (URI fileUri : cacheFiles) {
                    Path path = new Path(fileUri.getPath());
                    FileSystem fs = FileSystem.get(context.getConfiguration());
                    BufferedReader reader = new BufferedReader(new InputStreamReader(fs.open(path)));
                    String line;
                    while ((line = reader.readLine()) != null ){
                        //double format is going to be our universal format.
                        //and this job creates all the files we need for everything else
                        vlist.add(new Vector(line).toString());
                    }
                }
            }


        }

        public void map(Object key, Text value, Context context)
                throws IOException, InterruptedException {


            tWrite1.set(new Vector(value.toString()).toString());
            for (String v:vlist){
                tWrite2.set(v);
                //output point + centroid
                context.write(tWrite1, tWrite2);
            }
        }
    }

    public static class closestCentReducer
            extends Reducer<Text,Text,Text,Text> {
        private Text resultValue = new Text();

        public void reduce(Text key, Iterable<Text> values,
                           Context context
        ) throws IOException, InterruptedException {
            double min_d = Double.POSITIVE_INFINITY;
            Vector v1 = new Vector(key.toString());
            for (Text val: values) {
                double d = v1.dist(new Vector(val.toString()));
                if (d < min_d) {
                    resultValue = val;
                    min_d = d;
                }
            }
            //output point + centroid
            context.write(key, resultValue);
        }
    }

    public static class countMapper
            extends Mapper<Object, Text, Text, IntWritable> {
        private Text tWrite1 = new Text();
        private final IntWritable one = new IntWritable(1);


        public void map(Object key, Text value, Context context)
                throws IOException, InterruptedException {
            String[] s = value.toString().split("\t");
            tWrite1.set(s[1]); //centroid
            context.write(tWrite1, one);
        }
    }

    public static class countReducer
            extends Reducer<Text,IntWritable,Text,IntWritable> {
        private IntWritable resultValue = new IntWritable();

        public void reduce(Text key, Iterable<IntWritable> values,
                           Context context
        ) throws IOException, InterruptedException {
            resultValue.set(0);
            for (IntWritable val: values) {
                resultValue.set(resultValue.get() + val.get());
            }
            //centroid + points in cluster
            context.write(key, resultValue);
        }
    }

    public static int closestCentJobRun(Path inputPath, Path centroidPath, Path outputPath, Configuration conf) throws Exception {
        Job job = Job.getInstance(conf, "silhouette");
        FileSystem fs = FileSystem.get(conf);
        if (fs.exists(outputPath)) {
            fs.delete(outputPath, true);
        }
        job.addCacheFile(centroidPath.toUri());
        job.setJarByClass(silhouette.class);
        job.setMapperClass(silhouette.closestCentMapper.class);
        job.setCombinerClass(silhouette.closestCentReducer.class);
        job.setReducerClass(silhouette.closestCentReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        FileInputFormat.addInputPath(job, inputPath);
        FileOutputFormat.setOutputPath(job, outputPath);
        return job.waitForCompletion(true) ? 0 : 1;
    }

    public static int countJobRun(Path inputPath, Path outputPath, Configuration conf) throws Exception {
        Job job = Job.getInstance(conf, "silhouette");
        FileSystem fs = FileSystem.get(conf);
        if (fs.exists(outputPath)) {
            fs.delete(outputPath, true);
        }
        job.setJarByClass(silhouette.class);
        job.setMapperClass(silhouette.countMapper.class);
        job.setCombinerClass(silhouette.countReducer.class);
        job.setReducerClass(silhouette.countReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat.addInputPath(job, inputPath);
        FileOutputFormat.setOutputPath(job, outputPath);
        return job.waitForCompletion(true) ? 0 : 1;
    }


    public static class pairMapper
            extends Mapper<Object, Text, Text, Text> {
        private List<String> cList = new ArrayList<>();
        private Text tWrite1 = new Text();
        private Text tWrite2 = new Text();

        @Override
        protected void setup(Context context) throws IOException {
            /*
            in order to have fewer classes, you can either pass in the list of centroids to create an "identity map", or the
            centroids mapped to their closest centroids to make a map with centroid keys and closest centroid values.

            we don't actually make a MAP. We simply check a string with startswith and endswith to prevent issues when map
            is not a bijection, So a single point string will be an identity map.

            This process allows us to make pairs of points where first of pair belongs to a key centroid and second belongs
            to a value centroid, allowing us to use this for computing a and b values
             */
            URI[] cacheFiles = context.getCacheFiles();
            if (cacheFiles != null) {
                for (URI fileUri : cacheFiles) {
                    Path path = new Path(fileUri.getPath());
                    FileSystem fs = FileSystem.get(context.getConfiguration());
                    BufferedReader reader = new BufferedReader(new InputStreamReader(fs.open(path)));
                    String line;
                    while ((line = reader.readLine()) != null ){
                        cList.add(line);
                    }
                }
            }
        }

        public void map(Object key, Text value, Context context)
                throws IOException, InterruptedException {

            String[] s = value.toString().split("\t");
            String point = s[0];
            String center = s[1];
            for (String c_pair: cList){
                if (c_pair.startsWith(center)){
                    tWrite1.set(c_pair);
                    tWrite2.set("1_"+point);
                    context.write(tWrite1,tWrite2);
                }
                if (c_pair.endsWith(center)){
                    tWrite1.set(c_pair);
                    tWrite2.set("2_"+point);
                    context.write(tWrite1,tWrite2);
                }
            }


        }
    }


    public static class pairReducer
            extends Reducer<Text,Text,Text,Text> {
        private Text tWrite1 = new Text();
        private Text tWrite2 = new Text();

        public void reduce(Text key, Iterable<Text> values,
                           Context context
        ) throws IOException, InterruptedException {
            List<String> p1_l = new ArrayList<>();
            List<String> p2_l = new ArrayList<>();
            for (Text val: values){
                if (val.toString().startsWith("1_")){
                    p1_l.add(val.toString().substring(2));
                } else {
                    p2_l.add(val.toString().substring(2));
                }
            }
            for (String p1:p1_l){
                for(String p2:p2_l){
                    tWrite1.set(p1);
                    tWrite2.set(p2);
                    context.write(tWrite1,tWrite2);
                }
            }
        }
    }


    public static int pairJobRun(Path inputPath, Path cachePath, Path outputPath, Configuration conf) throws Exception {
        Job job = Job.getInstance(conf, "silhouette");
        FileSystem fs = FileSystem.get(conf);
        if (fs.exists(outputPath)) {
            fs.delete(outputPath, true);
        }
        job.addCacheFile(cachePath.toUri());
        job.setJarByClass(silhouette.class);
        job.setMapperClass(silhouette.pairMapper.class);
        job.setReducerClass(silhouette.pairReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        FileInputFormat.addInputPath(job, inputPath);
        FileOutputFormat.setOutputPath(job, outputPath);
        return job.waitForCompletion(true) ? 0 : 1;
    }

    /*
    Avg ab: pairs to either A file or B file, depending on what was input file.
     */

    public static class avgABMapper
            extends Mapper<Object, Text, Text, Text> {
        private Text tWrite1 = new Text();
        private Text tWrite2 = new Text();

        public void map(Object key, Text value, Context context)
                throws IOException, InterruptedException {

            String[] s = value.toString().split("\t");
            Vector v1 = new Vector(s[0]);
            Vector v2 = new Vector(s[1]);

            tWrite1.set(v1.toString());
            tWrite2.set(v1.dist(v2) + "_1");

            context.write(tWrite1, tWrite2);
        }
    }

    public static class avgABCombiner
            extends Reducer<Text,Text,Text,Text> {
        private Text tWrite = new Text();

        public void reduce(Text key, Iterable<Text> values,
                           Context context
        ) throws IOException, InterruptedException {
            double d = 0;
            int c = 0;
            for (Text val: values){
                String[] s = val.toString().split("_");
                d += Double.valueOf(s[0]);
                c += Integer.valueOf(s[1]);
            }
            tWrite.set(d + "_" + c);
            context.write(key, tWrite);
        }
    }


    public static class avgABReducer
            extends Reducer<Text,Text,Text,Text> {
        private Text tWrite = new Text();
        private long valid = 0;

        @Override
        protected void setup(Reducer.Context context) throws IOException, InterruptedException {
            valid = context.getConfiguration().getLong("reducer.valid", 0);
        }

        public void reduce(Text key, Iterable<Text> values,
                           Context context
        ) throws IOException, InterruptedException {

            double d = 0;
            int c = 0;
            for (Text val: values){
                String[] s = val.toString().split("_");
                d += Double.valueOf(s[0]);
                c += Integer.valueOf(s[1]);
            }
            if (c>=1) {
                tWrite.set(d / (c - valid) + "");
            } else {
                tWrite.set(0.0+"");
            }
            context.write(key, tWrite);
        }
    }

    public static int ABJobRun(Path inputPath, Path outputPath, Configuration conf) throws Exception {
        Job job = Job.getInstance(conf, "silhouette");
        FileSystem fs = FileSystem.get(conf);
        if (fs.exists(outputPath)) {
            fs.delete(outputPath, true);
        }
        conf.setLong("reducer.valid",1);
        job.setJarByClass(silhouette.class);
        job.setMapperClass(silhouette.avgABMapper.class);
        job.setCombinerClass(silhouette.avgABCombiner.class);
        job.setReducerClass(silhouette.avgABReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        FileInputFormat.addInputPath(job, inputPath);
        FileOutputFormat.setOutputPath(job, outputPath);
        return job.waitForCompletion(true) ? 0 : 1;
    }

    /*
    takes in A, B, Center in input
    Combines all for final job
     */


    public static class joinABMapper
            extends Mapper<Object, Text, Text, Text> {
        String a_file = "";
        String b_file = "";
        String center_file = "";
        private Text tWrite1 = new Text();
        private Text tWrite2 = new Text();

        @Override
        protected void setup(Mapper.Context context) throws IOException, InterruptedException {
            a_file = context.getConfiguration().getStrings("a_file")[0];
            b_file = context.getConfiguration().getStrings("b_file")[0];
            center_file = context.getConfiguration().getStrings("center_file")[0];
        }
        public void map(Object key, Text value, Context context)
                throws IOException, InterruptedException {
            String filePathString = ((FileSplit) context.getInputSplit()).getPath().getName().toString();
            String[] s = value.toString().split("\t");

            tWrite1.set(s[0]);
            if (filePathString.equals(a_file)) {
                tWrite2.set("A"+s[1]);
            } else if (filePathString.equals(b_file))  {
                tWrite2.set("B"+s[1]);
            } else {
                tWrite2.set("C"+s[1]);
            }

            context.write(tWrite1, tWrite2);
        }
    }

    public static class joinABReducer
            extends Reducer<Text,Text,Text,Text> {
        private Text tWrite = new Text();

        public void reduce(Text key, Iterable<Text> values,
                           Context context
        ) throws IOException, InterruptedException {
            double a = 0;
            double b = 0;
            String Center = "";
            for (Text val: values){
                if (val.toString().startsWith("A")) {
                    a = Double.valueOf(val.toString().substring(1));
                } else if (val.toString().startsWith("B")) {
                    b = Double.valueOf(val.toString().substring(1));
                } else {
                    Center = val.toString().substring(1);
                }
            }
            if (a < b) {
                tWrite.set((1 - a/b) + "\t" + Center);
            } else if (b < a) {
                tWrite.set((b/a - 1) + "\t" + Center);
            } else {
                tWrite.set(0.0 + "\t" + Center);
            }
            context.write(key, tWrite);
        }
    }

    public static int joinJobRun(Path a_path, Path b_path, Path center_path, Path outputPath, Configuration conf) throws Exception {
        Job job = Job.getInstance(conf, "silhouette");
        FileSystem fs = FileSystem.get(conf);
        if (fs.exists(outputPath)) {
            fs.delete(outputPath, true);
        }
        job.setJarByClass(silhouette.class);
        job.setMapperClass(silhouette.joinABMapper.class);
        job.setReducerClass(silhouette.joinABReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        FileInputFormat.addInputPath(job, a_path);
        FileInputFormat.addInputPath(job, b_path);
        FileInputFormat.addInputPath(job, center_path);
        FileOutputFormat.setOutputPath(job, outputPath);
        return job.waitForCompletion(true) ? 0 : 1;
    }

    public static class finalMapper
            extends Mapper<Object, Text, Text, Text> {
        private Text tWrite1 = new Text();
        private Text tWrite2 = new Text();

        public void map(Object key, Text value, Context context)
                throws IOException, InterruptedException {
                String[] s = value.toString().split("\t");
                tWrite1.set(s[2]);
                tWrite2.set(s[1]+"_"+1);
                context.write(tWrite1, tWrite2);
        }
    }

    public static int finalJobRun(Path inputPath, Path outputPath, Configuration conf) throws Exception {
        Job job = Job.getInstance(conf, "silhouette");
        FileSystem fs = FileSystem.get(conf);
        if (fs.exists(outputPath)) {
            fs.delete(outputPath, true);
        }

        conf.setLong("reducer.valid",0);
        job.setJarByClass(silhouette.class);
        job.setMapperClass(silhouette.finalMapper.class);
        job.setCombinerClass(silhouette.avgABCombiner.class);
        job.setReducerClass(silhouette.avgABReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        FileInputFormat.addInputPath(job, inputPath);
        FileOutputFormat.setOutputPath(job, outputPath);
        return job.waitForCompletion(true) ? 0 : 1;
    }


    public static void centroidMapper(Path centroidPath, Path centroidFormatPath, Configuration conf) throws IOException{
        FileSystem fs = FileSystem.get(conf);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fs.open(centroidPath)));

        String line;
        List<String> centroidList = new ArrayList<>();
        while ((line = reader.readLine()) != null ){
            Vector v = new Vector(line);
            centroidList.add(v.toString());
        }

        FSDataOutputStream out = fs.create(centroidFormatPath, true);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
        for (String c: centroidList){
            bw.write(c + "\n");
            bw.flush();
        }
        bw.close();
        reader.close();
    }

    public static void main(String[] args) throws Exception{
        Path inputPath = new Path(args[0]);
        Path centroidPath = new Path(args[1]);
        Path tempPath = new Path(args[2]);
        Path outputPath = new Path(args[3]);
        Path outputFile = new Path(outputPath + "/" + "part-r-00000");
        Configuration conf = new Configuration();
        String runString = Instant.now().toString();

        Path centroidFormatPath = new Path(tempPath + "/" + CENTROIDS_FORMATTED);
        centroidMapper(centroidPath, centroidFormatPath, conf);

        System.out.println("----- job 1 - out to centroid to centroid file");
        closestCentJobRun(centroidFormatPath, centroidFormatPath, outputPath, conf);
        Path closestCentroidPath = new Path(tempPath + "/" + CENTROIDS_CLOSEST_CENTROIDS);
        FileSystem srcFS = FileSystem.get(conf);
        FileSystem dstFS = FileSystem.get(conf);
        boolean deleteSource = true;
        boolean overwrite = true;
        FileUtil.copy(srcFS, outputFile, dstFS, closestCentroidPath, deleteSource, overwrite, conf);

        System.out.println("----- job 2 - out to point to centroid file");
        closestCentJobRun(inputPath, centroidFormatPath, outputPath, conf);
        Path pointsCentroidPath = new Path(tempPath + "/" + POINTS_CLOSEST_CENTROIDS);
        FileUtil.copy(srcFS, outputFile, dstFS, pointsCentroidPath, deleteSource, overwrite, conf);

        System.out.println("----- job extra - counting points");
        countJobRun(pointsCentroidPath, outputPath, conf);
        Path countCentroidPath = new Path(tempPath + "/" + COUNT_CENTROIDS);
        FileUtil.copy(srcFS, outputFile, dstFS, countCentroidPath, deleteSource, overwrite, conf);

        System.out.println("----- job 3 + 3A - put centroid in the cache to get pairs, get A values");
        pairJobRun(pointsCentroidPath, centroidFormatPath, outputPath, conf);
        Path Apairs = new Path(tempPath + "/" + A_PAIRS);
        FileUtil.copy(srcFS, outputFile, dstFS, Apairs, deleteSource, overwrite, conf);
        ABJobRun(Apairs, outputPath, conf);
        Path Avalues = new Path(tempPath + "/" + A_VALUES);
        FileUtil.copy(srcFS, outputFile, dstFS, Avalues, deleteSource, overwrite, conf);
        srcFS.delete(Apairs);

        System.out.println("----- job 4 + 4A - put centroid in the cache to get pairs, get B values");
        pairJobRun(pointsCentroidPath, closestCentroidPath, outputPath, conf);
        Path Bpairs = new Path(tempPath + "/" + B_PAIRS);
        FileUtil.copy(srcFS, outputFile, dstFS, Bpairs, deleteSource, overwrite, conf);
        ABJobRun(Bpairs, outputPath, conf);
        Path Bvalues = new Path(tempPath + "/" + B_VALUES);
        FileUtil.copy(srcFS, outputFile, dstFS, Bvalues, deleteSource, overwrite, conf);
        srcFS.delete(Bpairs);

        System.out.println("----- job 5 - combine the a values, b values, and centroids");
        conf.setStrings("a_file", A_VALUES);
        conf.setStrings("b_file", B_VALUES);
        conf.setStrings("center_file", POINTS_CLOSEST_CENTROIDS);
        joinJobRun(Avalues, Bvalues, pointsCentroidPath, outputPath, conf);
        Path joinFile = new Path(tempPath + "/" + JOINFILE);
        FileUtil.copy(srcFS, outputFile, dstFS, joinFile, deleteSource, overwrite, conf);
        //cleanup - remove if files are desires
        srcFS.delete(Avalues);
        srcFS.delete(Bvalues);
        srcFS.delete(centroidFormatPath);
        srcFS.delete(pointsCentroidPath);
        srcFS.delete(closestCentroidPath);


        System.out.println("----- final job -----");
        finalJobRun(joinFile, outputPath, conf);

    }

}
