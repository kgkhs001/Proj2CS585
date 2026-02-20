package ds503.task2.b_multi;

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

public class MultiIterationKMeans extends Configured implements Tool {

    // Identical Mapper to Single Iteration?
    public static class KMeansMapper extends Mapper<Object, Text, IntWritable, Text> {
        // Needs to reload centroids each iteration
    }

    // Identical Reducer to Single Iteration?
    public static class KMeansReducer extends Reducer<IntWritable, Text, Text, Text> {
        // Outputs new centroids for the NEXT iteration
    }

    public int run(String[] args) throws Exception {
        Configuration conf = getConf();
        
        // TODO: Parse arguments: inputPath, outputBasePath, R (iterations)
        String inputPath = args[0];
        String outputBasePath = args[1];
        int iterations = Integer.parseInt(args[2]);

        String centroidPath = ""; // Path to initial centroid file

        for (int i = 0; i < iterations; i++) {
            Job job = Job.getInstance(conf, "Multi Iteration KMeans Round " + i);
            job.setJarByClass(MultiIterationKMeans.class);
            
            // Set mapper/reducer
            // Add centroidPath to DistributedCache for Mapper to read
            
            // Input path is always the data file path
            FileInputFormat.addInputPath(job, new Path(inputPath));
            
            // Output path changes per iteration (e.g., output/iter_0, output/iter_1)
            String currentOutputPath = outputBasePath + "/iter_" + i;
            FileOutputFormat.setOutputPath(job, new Path(currentOutputPath));
            
            job.waitForCompletion(true);
            
            // Update centroidPath to point to the output of THIS job (for the next iteration)
            centroidPath = currentOutputPath + "/part-r-00000"; 
            
            // Clean up output format so it can be read as input?
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        int res = ToolRunner.run(new Configuration(), new MultiIterationKMeans(), args);
        System.exit(res);
    }
}
