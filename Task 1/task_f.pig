/*
 * Task F: Identify page owners who have more followers than the average number of followers across the entire network.
 */

-- Load Data
Pages = LOAD './Proj1/circleNetPage.csv' using PigStorage(',') AS (id:int, nickname:chararray, jobtitle:chararray, regioncode:int, hobby:chararray);
Follows = LOAD './Proj1/follows.csv' USING PigStorage(',') AS (colRel:int, id1:int, id2:int, date:int, desc:chararray);

-- Count followers for each followed ID
FollowerCounts = GROUP Follows BY followedId;
Counts = FOREACH FollowerCounts GENERATE group AS ownerId, COUNT(Follows) AS numFollowers;

-- Calculate Global Average
AllGroups = GROUP Counts ALL;
AvgStats = FOREACH AllGroups GENERATE AVG(Counts.numFollowers) AS globalAvg;

-- Filter owners who exceed the average
FilteredOwners = FILTER Counts BY numFollowers > AvgStats.globalAvg;

-- Join back to get names
Result = JOIN FilteredOwners BY ownerId, Pages BY ownerId;
Final = FOREACH Result GENERATE Pages::ownerId, Pages::nickname;
STORE Final INTO 'task_f_output';
