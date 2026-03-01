/*
 * Task H: Identify people who follow someone in their same RegionCode but are not followed back by that person.
 */

-- Load Data
Pages = LOAD './Proj1/circleNetPage.csv' using PigStorage(',') AS (id:int, nickname:chararray, jobtitle:chararray, regioncode:int, hobby:chararray);
Follows = LOAD './Proj1/follows.csv' USING PigStorage(',') AS (colRel:int, id1:int, id2:int, date:int, desc:chararray);

-- Setup "Distributed Cache" (Map-Side Join)
F_with_R1 = JOIN Follows BY id1, Pages BY id USING 'replicated';
F_with_R2 = JOIN F_with_R1 BY id2, Pages BY id USING 'replicated';

-- Filter for Same Region
SameRegion = FILTER F_with_R2 BY Pages::region == Pages::region;

-- Clean up columns: follower, followed, nickname
ActiveFollows = FOREACH SameRegion GENERATE
    F_with_R1::Follows::id1 AS userA,
    F_with_R1::Follows::id2 AS userB,
    F_with_R1::Pages::nick AS nickA;

-- Symmetry Check
Grouped = COGROUP ActiveFollows BY userA, ActiveFollows BY userB;

-- Identify "Unrequited"
Unrequited = FOREACH Grouped {
    Targets = FILTER ActiveFollows BY NOT(userB IN ActiveFollows.userA);
    GENERATE group AS userID, Targets.nickA AS nickname, Targets.userB AS followedID;
}

-- Flatten and Store
Final = FOREACH Unrequited GENERATE userID, nickname, followedID;
STORE Final INTO 'task_h_output';