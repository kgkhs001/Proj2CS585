/*
 * Task H: Identify people who follow someone in their same RegionCode but are not followed back by that person.
 */

-- Load Data
Pages = LOAD './Proj1/circleNetPage.csv' using PigStorage(',') AS (id:int, nickname:chararray, jobtitle:chararray, regioncode:int, hobby:chararray);
Follows = LOAD './Proj1/follows.csv' USING PigStorage(',') AS (relId:int, id1:int, id2:int, date:int, desc:chararray);

-- Join Follows with Pages twice to get RegionCode for both ID1 and ID2
F_With_Reg1 = JOIN Follows BY id1, Pages BY id;
F_With_Reg2 = JOIN F_With_Reg1 BY id2, Pages BY id;

-- Filter for same region
SameRegion = FILTER F_With_Reg2 BY Pages::region == Pages::region; -- Note: Pig handles disambiguation

-- Use a LEFT OUTER JOIN to find those NOT followed back
-- We join Follows (A follows B) with Follows (B follows A)
FollowBack = JOIN SameRegion LEFT OUTER BY (id2, id1), Follows BY (id1, id2);
Unrequited = FILTER FollowBack BY Follows::id1 IS NULL;

-- Final projection
Final = FOREACH Unrequited GENERATE SameRegion::id1, SameRegion::nick;
STORE Final INTO 'task_h_output';