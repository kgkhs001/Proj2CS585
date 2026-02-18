/*
 * Task C: Filter and report all users whose hobby matches your own.
 */

users = LOAD './Proj1/circleNetPage.csv' using PigStorage(',') AS (id:int, nickname:chararray, jobtitle:chararray, regioncode:int, hobby:chararray);
final = FILTER users BY hobby == 'Reading';

DUMP final;