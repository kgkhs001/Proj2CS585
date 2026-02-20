package ds503.task2.c_early_term;

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

public class KMeansEarlyTermination extends Configured implements Tool {

    // Same Mapper Logic usually but checks convergence? 
    // Usually convergence is checked by comparing old centroids vs new centroids after job completion
    
    // Reducer writes new centroids and possibly a counter for movement
    public static class KMeansReducer extends Reducer<IntWritable, Text, Text, Text> {
        
        enum Counter {
            CONVERGED
        }

        public void reduce(IntWritable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
            // Compute new centroid
            
            // Compare new centroid with old centroid (read from setup)
            // If distance < threshold: increment CONVERGED counter? Or global counter?
            // Actually, might need to aggregate total movement and check in driver
        }
    }

    public int run(String[] args) throws Exception {
        Configuration conf = getConf();
        
        // Loop structure similar to (b), but check for convergence
        boolean converged = false;
        int maxIterations = 20; // safe upper bound
        int iteration = 0;
        
        double threshold = 0.001; // example threshold

        while (!converged && iteration < maxIterations) {
            Job job = Job.getInstance(conf);
            job.setJobName("KMeans Early Termination Iteration " + iteration);
            job.setJarByClass(KMeansEarlyTermination.class);

            // ... set mapper, reducer ...

            job.waitForCompletion(true);

            // TODO: Check if converged
            // 1. Read the new centroids from HDFS output
            // 2. Read the old centroids from the DistributedCache file
            // 3. Compute total distance moved
            // 4. if (movement < threshold) converged = true;

            iteration++;
            
            // If not converged, update centroid path for next iteration
        }
        
        return 0;
    }

    public static void main(String[] args) throws Exception {
        int res = ToolRunner.run(new Configuration(), new KMeansEarlyTermination(), args);
        System.exit(res);
    }
}
