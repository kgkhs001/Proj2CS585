package ds503.task2.a_single;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import java.io.IOException;

public class SingleIterationKMeans extends Configured implements Tool {

    // Mapper Class
    public static class KMeansMapper extends Mapper<Object, Text, IntWritable, Text> {
        
        public void setup(Context context) throws IOException, InterruptedException {
            // TODO: Read initial centroids from configuration or distributed cache (for just 1 iteration)
        }

        public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
            // TODO: 
            // 1. Parse the input data point (4D tuple)
            // 2. Calculate distance to each centroid
            // 3. Find the nearest centroid
            // 4. Emit key=centroidId, value=point(or partial sum info)
        }
    }

    // Reducer Class
    public static class KMeansReducer extends Reducer<IntWritable, Text, Text, Text> {
        
        public void reduce(IntWritable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
            // TODO: 
            // 1. Iterate through all points assigned to this centroid
            // 2. Sum up creating new coordinates
            // 3. Calculate new average (new centroid)
            // 4. Emit new centroid
        }
    }

    // Driver Code
    public int run(String[] args) throws Exception {
        Configuration conf = getConf();
        Job job = Job.getInstance(conf, "Single Iteration KMeans");
        job.setJarByClass(SingleIterationKMeans.class);

        job.setMapperClass(KMeansMapper.class);
        job.setReducerClass(KMeansReducer.class);

        job.setOutputKeyClass(IntWritable.class);
        job.setOutputValueClass(Text.class);

        // TODO: Handle input/output paths from args
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        return job.waitForCompletion(true) ? 0 : 1;
    }

    public static void main(String[] args) throws Exception {
        int res = ToolRunner.run(new Configuration(), new SingleIterationKMeans(), args);
        System.exit(res);
    }
}
