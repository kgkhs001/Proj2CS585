//Krishna Garg
package ds503.task2.a_single;

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
import java.util.PriorityQueue;

public class SingleIterationKMeans extends Configured implements Tool {
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
            context.write(new Text(smallestPoint.retString()), value);
            }
        }
    }

    // Reducer Class
    public static class KMeansReducer extends Reducer<Text, Text, Text, Text> {
        
        public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
            Integer count = 0;
            double w = 0;
            double x = 0;
            double y = 0;
            double z = 0;

            for(Text i : values){
                String[] valueString = i.toString().split(",");
                w += Double.parseDouble(valueString[0]);
                x += Double.parseDouble(valueString[1]);
                y += Double.parseDouble(valueString[2]);
                z += Double.parseDouble(valueString[3]);
                count++;
            }
            Point newPoint = new Point(String.valueOf(w/count), String.valueOf(x/count), String.valueOf(y/count), String.valueOf(z/count));
            context.write(new Text(newPoint.retString()), new Text(""));
        }

    }

    public int run(String[] args) throws Exception {
        Configuration conf = getConf();
        
        if (args.length != 3) {
            System.err.println("Usage: SingleIterationKMeans <input> <output> <centroid>");
            System.exit(2);
        }
        
        conf.set("centroid.path", args[2]);

        Job job = Job.getInstance(conf, "Single Iteration KMeans");
        job.setJarByClass(SingleIterationKMeans.class);

        job.setMapperClass(KMeansMapper.class);
        job.setReducerClass(KMeansReducer.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);

        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        return job.waitForCompletion(true) ? 0 : 1;
    }

    public static void main(String[] args) throws Exception {
        int res = ToolRunner.run(new Configuration(), new SingleIterationKMeans(), args);
        System.exit(res);
    }
}



/*
How to run:
hdfs dfs -rm -r -f /output/kmeans_single
hadoop jar /tmp/task2-2.jar ds503.task2.a_single.SingleIterationKMeans /input/tuples.csv /output/kmeans_single /input/tuples_2.csv
*/