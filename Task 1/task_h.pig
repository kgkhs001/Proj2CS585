/*
 * Task H: Identify people who follow someone in their same RegionCode
 *         but are not followed back by that person.
 *
 * Strategy: Filter for same-region follows FIRST (reduces dataset),
 *           then use COGROUP for memory-efficient anti-join.
 */

-- Memory tuning for constrained environment
SET default_parallel 30;
SET mapreduce.task.io.sort.mb 50;
SET pig.cachedbag.memusage 0.1;

-- Clean output directory if it exists
rmf task_h_output;

-- Load Data
Pages = LOAD './Proj1/circleNetPage.csv' USING PigStorage(',') AS (id:int, nickname:chararray, jobtitle:chararray, regioncode:int, hobby:chararray);
Follows = LOAD './Proj1/follows.csv' USING PigStorage(',') AS (colRel:int, id1:int, id2:int, date:int, desc:chararray);

-- Minimize columns early
P = FOREACH Pages GENERATE id, nickname, regioncode;
F = FOREACH Follows GENERATE id1, id2;

-- Step 1: Attach follower's region and nickname
J1 = JOIN F BY id1, P BY id;
WithFollowerInfo = FOREACH J1 GENERATE
    F::id1 AS follower,
    F::id2 AS followed,
    P::regioncode AS follower_rc,
    P::nickname AS follower_nick;

-- Step 2: Attach followed person's region
J2 = JOIN WithFollowerInfo BY followed, P BY id;
WithBothInfo = FOREACH J2 GENERATE
    WithFollowerInfo::follower AS follower,
    WithFollowerInfo::followed AS followed,
    WithFollowerInfo::follower_rc AS follower_rc,
    WithFollowerInfo::follower_nick AS follower_nick,
    P::regioncode AS followed_rc;

-- Step 3: Filter same region EARLY (drastically reduces data before anti-join)
SameRegion = FILTER WithBothInfo BY follower_rc == followed_rc;
SRPairs = FOREACH SameRegion GENERATE follower, followed, follower_nick;

-- Step 4: Anti-join via COGROUP (no cross-product, memory efficient)
-- Check if the REVERSE relationship (followed -> follower) exists in F
ReverseCheck = FOREACH SRPairs GENERATE followed AS check_from, follower AS check_to, follower_nick;
CG = COGROUP ReverseCheck BY (check_from, check_to), F BY (id1, id2);
NoReciprocal = FILTER CG BY IsEmpty(F);
Unrequited = FOREACH NoReciprocal GENERATE FLATTEN(ReverseCheck) AS (check_from:int, check_to:int, follower_nick:chararray);

-- Final output: userID (follower), nickname, followedID
Final = FOREACH Unrequited GENERATE check_to AS userID, follower_nick AS nickname, check_from AS followedID;
STORE Final INTO 'task_h_output';