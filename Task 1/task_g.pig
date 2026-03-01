/*
 * Task G: Find "outdated" pages where the owner has not had any activity in the log for the last 90 days.
 */

-- Load Data
Pages = LOAD './Proj1/circleNetPage.csv' using PigStorage(',') AS (id:int, nickname:chararray, jobtitle:chararray, regioncode:int, hobby:chararray);
Activity = LOAD './Proj1/activityLog.csv' using PigStorage(',') AS (actionId:int, byWho:int, whatPage:int, actionType:chararray, actionTime:int);

-- Identify Active Owners in the last 90 days
RecentActivity = FILTER Activity BY actionTime >= (1000000 - 2160);
RecentOwners = FOREACH RecentActivity GENERATE byWho;
DistinctRecentOwners = DISTINCT RecentOwners;

-- Co-group all Pages with Recent Owners
Cogrouped = COGROUP Pages BY id, DistinctRecentOwners BY byWho;

-- Extract Pages that have NO recent activity (DistinctRecentOwners is empty)
OutdatedGroup = FILTER Cogrouped BY IsEmpty(DistinctRecentOwners);
Final = FOREACH OutdatedGroup GENERATE FLATTEN(Pages.id) AS id, FLATTEN(Pages.nickname) AS nickname;
STORE Final INTO 'task_g_output';