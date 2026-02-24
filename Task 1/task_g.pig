/*
 * Task G: Find "outdated" pages where the owner has not had any activity in the log for the last 90 days.
 */

-- Load Data
Pages = LOAD './Proj1/circleNetPage.csv' using PigStorage(',') AS (id:int, nickname:chararray, jobtitle:chararray, regioncode:int, hobby:chararray);
Activity = LOAD './Proj1/activityLog.csv' using PigStorage(',') AS (actionId:int, byWho:int, whatPage:int, actionType:chararray, actionTime:int);

-- Find the most recent activity for every person
GroupedActivity = GROUP Activity BY byWho;
LatestActivity = FOREACH GroupedActivity GENERATE group AS ownerId, MAX(Activity.time) AS lastTime;

-- Identify "Outdated"
OutdatedIDs = FILTER LatestActivity BY lastTime < (1000000 - 2160);

-- Join to get Nicknames
OutdatedNames = JOIN OutdatedIDs BY ownerId, Pages BY ownerId;
Final = FOREACH OutdatedNames GENERATE Pages::ownerId, Pages::nickname;
STORE Final INTO 'task_g_output';