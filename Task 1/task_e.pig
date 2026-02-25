/*
 * Task E: For each user, determine the total number of accesses made and the count of distinct pages they interacted with.
 `pig -param input_act=hdfs://localhost:9000/home/ds503/shared_folder/input/activitylog.csv -param out=hdfs://localhost:9000/home/ds503/shared_folder/output_pig/taske_out taske.pig`

Did not time this, seems slower.

To make this, I simply translated my approach from mapreduce to sql, then wrote as a pig script. Basically:
 * We want to group by id in the activitylog dataframe.
 * We want to aggregate a count of distinct activity user ids as a count.
 * We want to aggregate a count of all activity user ids as a count.

Complaints: The particular format that grouping and joining required was somewhat tricky to me. You end up needing a lot of variables to build this stage by stage and refer to the right one each time. Again, seems slower than just making a mapreduce in this case.
Praise: It's a simple format to use, easier than sql for the most part actually, and though it's slower than mapreduce it's not bad.

 */
