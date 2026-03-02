* arg 1 - path to list of points
* arg 2 - path to list of centers
* arg 3 - path to a "temp" directory - currently creates just one secondary output of a count of how many points are in each cluster. temp folder doesn't have to be empty. 
* arg 4 - output directory, needs to be empty, you know how it is with mapreduce

EX: `hadoop jar ~/shared_folder/silhouette.jar  /home/ds503/shared_folder/input_km/points.csv  /home/ds503/shared_folder/centroids.csv /home/ds503/shared_folder/temp/ /home/ds503/shared_folder/output/`

My compilation method is to add artifact using IntelliJ project structure settings and then use the build menu. 

Here's how it works:

Note that the averaging and counting jobs have combiners. The others... do not. 

1.) Job 1 - centroids to centroids file: For the calculations of the b values, we will need a file showing which centroid is closest to each centroid.
The closest centroids mapper has the centroids in its cash and sends out a key value pair of its input with each centroid. The reducer will find the closest centroid
to the input key. In this case the input is just the centroids. 

Between each job, we send the output file to temp. We delete most of temp at the end.

2.) Job 2 - points to centroids file: Many operations will need which points are in which clusters, meaning which centroid are they closest to. 
So we basically do job 1 except on the input points. 

Extra job: Cluster point counter - Made because I personally wanted to see the cluster sizes. It's just a count job on the points to closest centroids file.

3.) Getting the a values: First, we have a job for just emiting all pairs of points in the same cluster. The pairmapper will be used for part b as well using a very specific trick, which I will explain in the next part. For now, the input is the points with closest centroid, the cache is the centroids, and then for each point we emit both the key of centroid and point with a tag of "first" and key of centroid and point with a tag of "second"

The reducer takes all points per key and pairs up all values tagged as first with all points tagged as second as long as they aren't equal.

To get the a values, we run ABmapper on the pairs which makes the first vector the key and the distance between them the value. Then to get the a values it's just an averaging reducer. 

4.) Getting the b values. Here's the trick here. We point the centroids with their closest centroids in the cache. Then for each point p with its closest centroid c, we check c against each line l of that file. 
If the line l describing a centroid and the centroid closest to it STARTS with c, we emit a value of the line l as key and p tagged as a first value.
If the line l ENDS with c, we emit key of l with value of p tagged as second. When these are reduced as pairs, this will get us the distances that 
we need for calculating b values. b values are calculated exactly the same way as a values as just an averaging job after converting vector, vector pairs to vector, distance pairs.

The clever (or at least I think it's clever, it probably could just be done as its own thing though) part that makes the pairmapper work for both of these jobs is that since we are just checking if the string starts or ends with c, 
the operation works for a if we just put the list of centroids in the cache. 

5.) Joining. We join the a values file, b values file, and points with closest centroids file by the point value. The mapper emits point as key, and the value in the other column tagged with what file it's from as value.
Then the reducer can compute the s value for each point and keep the centroid in a column

6.) Final job is a grouping by centroids and averaging of s values. It's not complicated.

I would say performance has been really good considering how many jobs went into this. I might have missed a combiner or another trick, 
but for the most part I do not see how I could do this in fewer. For instance, jobs 5 and 6 can't really be combined as we are combining and joining on different keys.