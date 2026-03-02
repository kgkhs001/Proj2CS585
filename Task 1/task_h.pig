/*
 * Task H: Identify people who follow someone in their same RegionCode but are not followed back by that person.
 */

-- Load Data
Pages = LOAD './Proj1/circleNetPage.csv' using PigStorage(',') AS (id:int, nickname:chararray, jobtitle:chararray, regioncode:int, hobby:chararray);
Follows = LOAD './Proj1/follows.csv' USING PigStorage(',') AS (colRel:int, id1:int, id2:int, date:int, desc:chararray);

-- Reducer Limit
SET default_parallel 30;

-- Clean output directory if it exists
rmf task_h_output;

-- Pre-process data
P = FOREACH Pages GENERATE id, nickname, regioncode;
F1 = FOREACH Follows GENERATE id1, id2;
F2 = FOREACH Follows GENERATE id1, id2;

-- Find Unrequited Follows using LEFT OUTER JOIN
-- F1 contains A->B. F2 contains B->A.
JoinedFollows = JOIN F1 BY (id1, id2) LEFT OUTER, F2 BY (id2, id1);
Unrequited = FILTER JoinedFollows BY F2::id1 IS NULL;
UnreqList = FOREACH Unrequited GENERATE F1::id1 AS follower, F1::id2 AS followed;

-- Join with Pages to get Follower's RegionCode and Nickname
Out1 = JOIN UnreqList BY follower, P BY id;
FollowerData = FOREACH Out1 GENERATE 
    UnreqList::follower AS follower, 
    UnreqList::followed AS followed, 
    P::nickname AS follower_nick, 
    P::regioncode AS follower_rc;

-- Join with Pages to get Followed's RegionCode
Out2 = JOIN FollowerData BY followed, P BY id;
FollowedData = FOREACH Out2 GENERATE 
    FollowerData::follower AS follower, 
    FollowerData::followed AS followed, 
    FollowerData::follower_nick AS follower_nick, 
    FollowerData::follower_rc AS follower_rc, 
    P::regioncode AS followed_rc;

-- Filter by Same Region
SameRegion = FILTER FollowedData BY follower_rc == followed_rc;

-- Flatten and Store
Final = FOREACH SameRegion GENERATE follower AS userID, follower_nick AS nickname, followed AS followedID;
STORE Final INTO 'task_h_output';