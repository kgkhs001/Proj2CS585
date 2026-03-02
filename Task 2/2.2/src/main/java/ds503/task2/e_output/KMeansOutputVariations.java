//Krishna Garg
package ds503.task2.e_output_variation;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.hadoop.fs.FileSystem;
import java.lang.Math;

public class KMeansOutputVariations extends Configured implements Tool {
    public static class Point {
        double w, x, y, z;
        
        public Point(String w, String x, String y, String z){
            this.w = Double.parseDouble(w);
            this.x = Double.parseDouble(x);
            this.y = Double.parseDouble(y);
            this.z = Double.parseDouble(z);
        }

        public Double findDistance(Point other){
            double wDist = Math.pow((this.w - other.w), 2);
            double xDist = Math.pow((this.x - other.x), 2);
            double yDist = Math.pow((this.y - other.y), 2);
            double zDist = Math.pow((this.z - other.z), 2);
            return Math.sqrt(wDist + xDist + yDist + zDist);
        }
        
        public String retString(){
            return this.w + "," + this.x + "," + this.y + "," + this.z;
        }
    }

    public static class KMeansMapper extends Mapper<LongWritable, Text, Text, Text> {
        List<Point> Centroids = new ArrayList<>();
        
        public void setup(Context context) throws IOException, InterruptedException {
             Configuration conf = context.getConfiguration();
             try{
                 Path path = new Path(conf.get("centroid.path"));
                 FileSystem fs = FileSystem.get(conf);
                 BufferedReader br = new BufferedReader(new InputStreamReader(fs.open(path)));
                 String line;
                 while ((line = br.readLine()) != null) {
                     String[] values = line.split(",");
                     Centroids.add(new Point(values[0], values[1], values[2], values[3]));
                 }
                 br.close();
             } catch(Exception e){
                 e.printStackTrace();
                 throw new RuntimeException("Error reading centroid file: " + conf.get("centroid.path"), e);
             }
        }

        public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
            String[] fileValues = value.toString().split(",");
            Point point = new Point(fileValues[0], fileValues[1], fileValues[2], fileValues[3]);
            Double smallest = Double.MAX_VALUE;
            Point smallestPoint = null;
            
            for (Point i : Centroids){
                Double dist = point.findDistance(i);
                if(dist < smallest){
                    smallest = dist;
                    smallestPoint = i;
                }
            }
            if (smallestPoint != null) {
                context.write(new Text(smallestPoint.retString()), new Text(value.toString() + ",1"));
            }
        }
    }
    public static class KMeansCombiner extends Reducer<Text, Text, Text, Text> {
        public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
            int count = 0;
            double w = 0, x = 0, y = 0, z = 0;

            for(Text i : values){
                String[] valueString = i.toString().split(",");
                w += Double.parseDouble(valueString[0]);
                x += Double.parseDouble(valueString[1]);
                y += Double.parseDouble(valueString[2]);
                z += Double.parseDouble(valueString[3]);
                count += Integer.parseInt(valueString[4]); 
            }
            
            context.write(key, new Text(w + "," + x + "," + y + "," + z + "," + count));
        }
    }

    public static class KMeansReducer extends Reducer<Text, Text, Text, Text> {
        public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
            String[] keyVals = key.toString().split(",");
            Point oldPoint = new Point(keyVals[0], keyVals[1], keyVals[2], keyVals[3]);
            
            int count = 0;
            double w = 0, x = 0, y = 0, z = 0;

            for(Text i : values){
                String[] valueString = i.toString().split(",");
                w += Double.parseDouble(valueString[0]);
                x += Double.parseDouble(valueString[1]);
                y += Double.parseDouble(valueString[2]);
                z += Double.parseDouble(valueString[3]);
                count += Integer.parseInt(valueString[4]);
            }
            
            Point newPoint = new Point(String.valueOf(w/count), String.valueOf(x/count), String.valueOf(y/count), String.valueOf(z/count));
            
            double distance = oldPoint.findDistance(newPoint);
            if (distance > 0.1){
                context.getCounter("KMEANS", "CENTROIDS_MOVED").increment(1);
            }
            context.write(new Text(newPoint.retString()), new Text(""));
        }
    }

    public static class FinalAssignmentMapper extends Mapper<LongWritable, Text, Text, Text> {
        List<Point> Centroids = new ArrayList<>();
        
        public void setup(Context context) throws IOException, InterruptedException {
             Configuration conf = context.getConfiguration();
             try{
                 Path path = new Path(conf.get("centroid.path"));
                 FileSystem fs = FileSystem.get(conf);
                 BufferedReader br = new BufferedReader(new InputStreamReader(fs.open(path)));
                 String line;
                 while ((line = br.readLine()) != null) {
                     String[] values = line.split(",");
                     Centroids.add(new Point(values[0], values[1], values[2], values[3]));
                 }
                 br.close();
             } catch(Exception e){
                 e.printStackTrace();
                 throw new RuntimeException("Error reading centroid file: " + conf.get("centroid.path"), e);
             }
        }

        public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
            String[] fileValues = value.toString().split(",");
            Point point = new Point(fileValues[0], fileValues[1], fileValues[2], fileValues[3]);
            Double smallest = Double.MAX_VALUE;
            Point smallestPoint = null;
            
            for (Point i : Centroids){
                Double dist = point.findDistance(i);
                if(dist < smallest){
                    smallest = dist;
                    smallestPoint = i;
                }
            }
            if (smallestPoint != null) {
                context.write(new Text(value.toString()), new Text(smallestPoint.retString()));
            }
        }
    }

    public int run(String[] args) throws Exception {
        if (args.length != 4) {
            System.err.println("Usage: KMeansOutputVariations <input> <output_base> <centroid> <num_iterations>");
            System.exit(2);
        }

        Path input = new Path(args[0]);
        String outputBase = args[1];
        String centroids = args[2];
        int runTimes = Integer.parseInt(args[3]);

        boolean converged = false;

        for (int i = 0; i < runTimes; i++) {
            Configuration conf = getConf();
            conf.set("centroid.path", centroids);

            Job job = Job.getInstance(conf, "Optimized KMeans - Iteration " + i);
            job.setJarByClass(KMeansOutputVariations.class);

            job.setMapperClass(KMeansMapper.class);
            job.setCombinerClass(KMeansCombiner.class);
            job.setReducerClass(KMeansReducer.class);

            job.setOutputKeyClass(Text.class);
            job.setOutputValueClass(Text.class);

            FileInputFormat.addInputPath(job, input);
            FileOutputFormat.setOutputPath(job, new Path(outputBase + "-" + i));

            boolean success = job.waitForCompletion(true);
            if (!success) {
                return 1;
            }

            long movedCentroids = job.getCounters().findCounter("KMEANS", "CENTROIDS_MOVED").getValue();
            if (movedCentroids == 0) {
                System.out.println("Convergence reached after " + (i + 1) + " iterations!");
                converged = true;
                break;
            }

            centroids = outputBase + "-" + i + "/part-r-00000";
        }

        Configuration finalConf = getConf();
        FileSystem fs = FileSystem.get(finalConf);
        Path finalCentroidPath = new Path(centroids);
        BufferedReader br = new BufferedReader(new InputStreamReader(fs.open(finalCentroidPath)));
        
        Path variation1Output = new Path(outputBase + "-variation1/results.txt");
        org.apache.hadoop.fs.FSDataOutputStream outputStream = fs.create(variation1Output);
        
        if (converged) {
            outputStream.writeBytes("Convergence Reached: YES\n");
        } else {
            outputStream.writeBytes("Convergence Reached: NO\n");
        }
        
        outputStream.writeBytes("Final Cluster Centers:\n");

        String line;
        while ((line = br.readLine()) != null) {
            outputStream.writeBytes(line + "\n");
        }
        
        br.close();
        outputStream.close();

        finalConf.set("centroid.path", centroids);
        Job variation2Job = Job.getInstance(finalConf, "KMeans Variation 2 - Assignment");
        variation2Job.setJarByClass(KMeansOutputVariations.class);
        
        variation2Job.setMapperClass(FinalAssignmentMapper.class);
        variation2Job.setNumReduceTasks(0);
        
        variation2Job.setOutputKeyClass(Text.class);
        variation2Job.setOutputValueClass(Text.class);
        
        FileInputFormat.addInputPath(variation2Job, input);
        FileOutputFormat.setOutputPath(variation2Job, new Path(outputBase + "-variation2"));

        return variation2Job.waitForCompletion(true) ? 0 : 1;
    }

    public static void main(String[] args) throws Exception {
        int res = ToolRunner.run(new Configuration(), new KMeansOutputVariations(), args);
        System.exit(res);
    }
}
