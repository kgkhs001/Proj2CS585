/*
 * Task H: Identify people who follow someone in their same RegionCode but are not followed back by that person.
 * This does not work as it takes up too much memory so it will blow up your docker container.
 */

-- Load Data
Pages = LOAD './Proj1/circleNetPage.csv' using PigStorage(',') AS (id:int, nickname:chararray, jobtitle:chararray, regioncode:int, hobby:chararray);
Follows = LOAD './Proj1/follows.csv' USING PigStorage(',') AS (colRel:int, id1:int, id2:int, date:int, desc:chararray);

-- Prepare explicitly named pages projections to avoid ambiguity
P1 = FOREACH Pages GENERATE id AS p1_id, nickname AS p1_name, regioncode AS p1_reg;
P2 = FOREACH Pages GENERATE id AS p2_id, regioncode AS p2_reg;

F_With_Reg1 = JOIN Follows BY id1, P1 BY p1_id;
F_With_Reg2 = JOIN F_With_Reg1 BY Follows::id2, P2 BY p2_id;

SameRegionRaw = FILTER F_With_Reg2 BY P1::p1_reg == P2::p2_reg;
SameRegion = FOREACH SameRegionRaw GENERATE Follows::id1 AS follower_id, Follows::id2 AS followee_id, P1::p1_name AS follower_name;

FollowsRev = FOREACH Follows GENERATE id2 AS rev_id2, id1 AS rev_id1;

FollowBackCoGroup = COGROUP SameRegion BY (follower_id, followee_id), FollowsRev BY (rev_id2, rev_id1);

UnrequitedGroups = FILTER FollowBackCoGroup BY IsEmpty(FollowsRev);

FinalRaw = FOREACH UnrequitedGroups GENERATE FLATTEN(SameRegion.follower_id) AS id, FLATTEN(SameRegion.follower_name) AS nickname;
Final = DISTINCT FinalRaw;
STORE Final INTO 'task_h_output';