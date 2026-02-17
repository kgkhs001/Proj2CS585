/*
 * Task A: Report the frequency of each favorite hobby on the platform.
 */
data = LOAD './Proj1/circleNetPage.csv' using PigStorage(',') AS (id:int, nickname:chararray, jobtitle:chararray, regioncode:int, hobby:chararray);
grouped = GROUP data BY hobby;
hobbyCounts = FOREACH grouped GENERATE group AS HobbyNames, COUNT(data) AS frequency;
