package ds503.task2.d_optimized;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FileSystem;
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

public class KMeansOptimizedCombiner extends Configured implements Tool {

    // Mapper outputs (centroid_id, point_coordinates)
    // BUT we want Combiner to locally aggregate points for the same centroid_id
    // This reduces network traffic: (centroid_id, sum_coordinates, count)

    public static class KMeansCombiner extends Reducer<IntWritable, Text, IntWritable, Text> {
        public void reduce(IntWritable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
            // Aggregate local sums and counts
            double sumW = 0, sumX = 0, sumY = 0, sumZ = 0;
            int count = 0;
            
            for (Text val : values) {
                // Parse either a point or a partial sum
                // Add to total
                count++;
            }
            
            // Emit partial aggregates: (centroid_id, "sumW,sumX,sumY,sumZ,count")
            context.write(key, new Text(sumW + "," + sumX + "," + sumY + "," + sumZ + "," + count));
        }
    }

    public static class KMeansReducer extends Reducer<IntWritable, Text, Text, Text> {
        public void reduce(IntWritable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
            // Collect ALL partial sums and counts from combiners
            // Compute final global average
            // Format output as new centroid
        }
    }
    
    // Mapper must output same types as Combiner input/output: IntWritable, Text

    public int run(String[] args) throws Exception {
        Configuration conf = getConf();
        
        Job job = Job.getInstance(conf, "KMeans Optimized Combiner");
        job.setJarByClass(KMeansOptimizedCombiner.class);
        
        // Set Mapper Class (reuse or custom)
        // job.setMapperClass(KMeansMapper.class);

        // Set Combiner Class
        job.setCombinerClass(KMeansCombiner.class);
        
        // Set Reducer Class
        job.setReducerClass(KMeansReducer.class);

        // ... Input/Output Path Config ...
        
        // This is likely part of the multi-iteration loop as well
        
        return job.waitForCompletion(true) ? 0 : 1;
    }

    public static void main(String[] args) throws Exception {
        int res = ToolRunner.run(new Configuration(), new KMeansOptimizedCombiner(), args);
        System.exit(res);
    }
}
