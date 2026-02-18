/*
 * Task B: Identify the top 10 most popular pages based on the highest number of accesses in the ActivityLog.
 */

pages = LOAD './Proj1/circleNetPage.csv' using PigStorage(',') AS (id:int, nickname:chararray, jobtitle:chararray, regioncode:int, hobby:chararray);
activity = LOAD './Proj1/activityLog.csv' using PigStorage(',') AS (actionId:int, byWho:int, whatPage:int, actionType:chararray, actionTime:int);

group_activity = GROUP activity BY whatPage;
page_counts = FOREACH group_activity GENERATE group AS page_id, COUNT(activity) AS total_accesses;
sorted_pages = ORDER page_counts BY total_accesses DESC;
top10 = LIMIT sorted_pages 10;

joined = JOIN top10 by page_id, pages by id USING 'replicated';

final = FOREACH joined GENERATE pages::id, pages::nickname, pages::jobtitle;

DUMP final;