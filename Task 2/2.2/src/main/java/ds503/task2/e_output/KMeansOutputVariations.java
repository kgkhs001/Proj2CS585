package ds503.task2.e_output;

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

public class KMeansOutputVariations extends Configured implements Tool {

    // Mapper outputs (centroid_id, point_coordinates)
    
    // (i) Reducer for only cluster centers + convergence indication
    // Same as (c) or (d) final step, checking convergence flag
    
    // (ii) Reducer for final clustered points + cluster centers
    public static class AssignmentReducer extends Reducer<IntWritable, Text, Text, Text> {
        
        // This runs AFTER the algorithm has converged (using the final centroids)
        public void setup(Context context) throws IOException, InterruptedException {
            // Read FINAL centroids
        }

        public void reduce(IntWritable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
            // key is the Centroid ID (cluster ID)
            // values are the Points assigned to this cluster
            
            // For output variation (ii): 
            // construct "ClusterID, CentroidCoordinates" as key? Or just ClusterID
            
            Point centroid = centroids.get(key.get()); // pseudo code

            for (Text val : values) {
                // emit: (Point, Centroid)
                context.write(new Text(val.toString()), new Text(centroid.toString()));
            }
        }
    }
    
    public int run(String[] args) throws Exception {
        // Step 1: Run the iterative KMeans (optimized/early term) until convergence
        // Step 2: Running a FINAL job just for assignment if necessary?
        // OR modifying the last iteration's reducer to output what is needed?
        
        // Usually easier to run one final pass with IdentityMapper (or standard KMeansMapper)
        // and a special reducer that formats the output as requested in (ii)
        
        Configuration conf = getConf();
        Job job = Job.getInstance(conf, "KMeans Final Assignment");
        job.setJarByClass(KMeansOutputVariations.class);
        
        // Mapper: Assigns point to nearest FINAL centroid
        // Reducer: Formats output: Point <tab> Centroid
        
        return job.waitForCompletion(true) ? 0 : 1;
    }

    public static void main(String[] args) throws Exception {
        int res = ToolRunner.run(new Configuration(), new KMeansOutputVariations(), args);
        System.exit(res);
    }
}
