/*
 * Task D: Compute the "popularity factor" (number of followers) for every owner; owners with no followers must return zero.

 `pig -param input_circ=hdfs://localhost:9000/home/ds503/shared_folder/input/circlenetpage.csv -param input_follow=hdfs://localhost:9000/home/ds503/shared_folder/input/follows.csv -param out=hdfs://localhost:9000/home/ds503/shared_folder/output_pig/taskd_out task.pig`

 Did not time this, seems slower.

 To make this, I simply translated my approach from mapreduce to sql, then wrote as a pig script. Basically:
  * We want to group by id in the follows dataframe.
  * We want to aggregate a count of distinct follower ids as our follower count.
  * We want to join this with the circlenet dataframe to get the nickname.

 Complaints: The particular format that grouping and joining required was somewhat tricky to me. You end up needing a lot of variables to build this stage by stage and refer to the right one each time. Again, seems slower than just making a mapreduce in this case.
 Praise: It's a simple format to use, easier than sql for the most part actually, and though it's slower than mapreduce it's not bad.

 */

Circ = LOAD '$input_circ' USING PigStorage(',') AS (ID:int, NickName: chararray, JobTitle: chararray, RegionCode: int, FavoriteHobby: chararray);
Foll00 = LOAD '$input_follow' USING PigStorage(',') AS (ColRel: int, ID1: int, ID2: int, DateOfRelation: int, Desc: chararray);

Foll01 = GROUP Foll00 BY ID2;

Foll02 = FOREACH Foll01 {
	Foll_count = DISTINCT Foll00.ID1;
	GENERATE group as ID, COUNT(Foll_count) as FC;
};
Final00 = JOIN Circ BY ID, Foll02 BY ID;
Final01 = FOREACH Final00 GENERATE NickName, FC;

store Final01 into '$out';