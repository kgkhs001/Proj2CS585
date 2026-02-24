# Proj2CS585

# Krishna Garg
#### AI Usage
For AI Usage I had AI make the template code for the map reduce. This code is readily available on the internet.

### Task A Output
Note that I only made it dump to the stdout and not save to a file

```
2026-02-17 17:50:00,219 [main] INFO  org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.MapReduceLauncher - Success!
2026-02-17 17:50:00,239 [main] WARN  org.apache.pig.data.SchemaTupleBackend - SchemaTupleBackend has already been initialized
2026-02-17 17:50:00,271 [main] INFO  org.apache.hadoop.mapreduce.lib.input.FileInputFormat - Total input paths to process : 1
2026-02-17 17:50:00,271 [main] INFO  org.apache.pig.backend.hadoop.executionengine.util.MapRedUtil - Total input paths to process : 1
(Chess,7176)
(Baking,7055)
(Hiking,7243)
(Cooking,7163)
(Cycling,7092)
(Dancing,7121)
(Fishing,6953)
(Origami,7237)
(Pottery,6971)
(Reading,7083)
(Running,7088)
(Surfing,7085)
(Writing,7132)
(Knitting,7187)
(Painting,7313)
(Swimming,7171)
(Astronomy,7322)
(Gardening,7216)
(Sculpting,7120)
(Traveling,7191)
(Calligraphy,7140)
(Photography,7110)
(Woodworking,7185)
(Martial Arts,7007)
(Video Gaming,7233)
(Bird Watching,7134)
(Rock Climbing,7239)
(Playing Guitar,7033)
2026-02-17 17:50:00,439 [main] INFO  org.apache.pig.Main - Pig script completed in 11 seconds and 896 milliseconds (11896 ms)
```


### Task B Output

```
2026-02-18 17:10:10,589 [main] WARN  org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.MapReduceLauncher - Encountered Warning FIELD_DISCARDED_TYPE_CONVERSION_FAILED 200000 time(s).
2026-02-18 17:10:10,589 [main] INFO  org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.MapReduceLauncher - Success!
2026-02-18 17:10:10,594 [main] WARN  org.apache.pig.data.SchemaTupleBackend - SchemaTupleBackend has already been initialized
2026-02-18 17:10:10,608 [main] INFO  org.apache.hadoop.mapreduce.lib.input.FileInputFormat - Total input paths to process : 1
2026-02-18 17:10:10,608 [main] INFO  org.apache.pig.backend.hadoop.executionengine.util.MapRedUtil - Total input paths to process : 1
(94244,CZSxjyZnXUAIplz,Software Engineer)
(65812,JbSZqlkVNCHytlOaOosL,HR Manager)
(130926,RkqqsccbdpnOO,Sales Manager)
(5931,RhHSeeyMebuN,Data Scientist)
(12403,FKvKQNXftQAbN,Legal Manager)
(186424,kTZLWYeMQWgBtNPgXwb,Operations Manager)
(10305,BLUmJwynTmuIBN,HR Manager)
(127476,YJMpuJSQbd,Marketing Manager)
(68461,kGYddijCtjvvuUD,HR Manager)
(15455,GsqbOTDFCbelgrSc,IT Manager)
2026-02-18 17:10:10,709 [main] INFO  org.apache.pig.Main - Pig script completed in 40 seconds and 988 milliseconds (40988 ms)
```

### Task C Output
```
2026-02-18 17:23:42,672 [main] INFO  org.apache.pig.backend.hadoop.executionengine.util.MapRedUtil - Total input paths to process : 1
(7,yRRppJaJOB,Marketing Manager,36,Reading)
(18,OUdWwhwAkivvXqj,Data Scientist,6,Reading)
(61,yWIaZCDxmHEb,IT Manager,8,Reading)
(82,SHhSpFOJmkMBKHxgU,Data Scientist,39,Reading)
(145,uupvLjtZPRDkzNn,Legal Manager,46,Reading)
(163,QpvHBPtEitgTkSC,IT Manager,3,Reading)
(199,BZTJEeIKGJFOFyXWVjqr,Sales Manager,7,Reading)
(202,sYTIzMaRNfLPxIOO,HR Manager,45,Reading)
(223,tMyDiUJXXuFNNCowHlJ,HR Manager,46,Reading)
(232,UVzdcPmrpQwvOcylztKN,Software Engineer,8,Reading)
(248,gCnxigIVnDnl,Product Manager,29,Reading)
(261,zASjPzIqdDFmDVODfCna,IT Manager,40,Reading)
(285,sKcGQCVTFhlG,IT Manager,16,Reading)
(300,jGRDVrtUWqFmLlbPorcM,Operations Manager,34,Reading)
(314,sEGcaIEVekJBWgzI,Data Scientist,14,Reading)
(324,CWPXMZpuHT,Software Engineer,11,Reading)
(416,uRcAmjwEXQUnnzsujS,Sales Manager,31,Reading)
(425,lpenhxgpJrOiVrozqD,Finance Manager,34,Reading)
(441,YsWsozaPALNWRh,Software Engineer,19,Reading)
(569,mdkzKNeYirrWnDp,Product Manager,19,Reading)
(586,RBciWYfusfI,Finance Manager,6,Reading)
(601,ildJqCrlbbngILizRV,Operations Manager,23,Reading)
(646,IHfMDNcEDnR,Software Engineer,38,Reading)
(647,WJtCSOCgtpcl,Data Scientist,30,Reading)
(654,gmcWeZwGDxevBOSpKLm,HR Manager,36,Reading)
(658,MrScVpCpnQezFhpRE,Data Scientist,46,Reading)
(685,EvKsyNfedPdmr,Sales Manager,27,Reading)
(712,LEwmrlYUYvhlgQSaGQMP,Operations Manager,41,Reading)
(723,GOybUEZHLGeGNbj,Product Manager,12,Reading)
(756,ODqIzkIDMIyGuAYM,Operations Manager,8,Reading)
(768,BXUNmZawJjJDCiETHPyR,HR Manager,46,Reading)
(784,wxIgBOYSVntwvEbFpgL,Software Engineer,6,Reading)
(816,vAReGfrAZWN,Finance Manager,32,Reading)
(882,ZDPpzdwnCa,Product Manager,2,Reading)
(936,ABACPmipsPFs,Sales Manager,2,Reading)
(948,YfJIPEemrWG,Software Engineer,34,Reading)
(997,IIwDHirWVVuZNj,Sales Manager,31,Reading)
(1004,AyqUqjsUoF,HR Manager,19,Reading)
(1022,lBrXLysVwOdXVpl,Product Manager,31,Reading)
(1035,rWnHidTRkNvWl,IT Manager,38,Reading)
(1116,eNowlpfUFDzHM,HR Manager,17,Reading)
(1163,RACJLrLuacWq,Data Scientist,36,Reading)
(1171,SpNVGnSKTlCKYbaov,Marketing Manager,12,Reading)
(1184,BwirpjSDwNvfPURQ,Product Manager,7,Reading)
(1199,VUzmpDgCDetI,HR Manager,43,Reading)
(1257,isyzbdhKWBra,Data Scientist,34,Reading)
(1307,sClxAXsWTssk,Product Manager,6,Reading)
(1329,gYPWkjiImNZTVR,Legal Manager,50,Reading)
(1345,AnOOrkULbRZUeTXYQCgB,Finance Manager,2,Reading)
(1381,xDKAtZsesFjmgS,Sales Manager,31,Reading)
(1402,DboVipvXkM,Product Manager,33,Reading)
(1550,qFtJwJuHlmhlLCEhor,Product Manager,18,Reading)
(1555,cxHXSejQpvPleQRov,HR Manager,40,Reading)
(1566,aFmzgGFLCEXp,Sales Manager,47,Reading)
(1629,uLhzLpvwMYmTQHV,Marketing Manager,18,Reading)
(1634,ngzPcVDrXmZPkEX,Software Engineer,47,Reading)
(1667,XfmpXRwPRokTRLBbns,Operations Manager,38,Reading)
(1690,tUTZUqIjxmevsETA,Data Scientist,13,Reading)
(1705,QdXmRTXZFBMflT,Marketing Manager,25,Reading)
(1727,uOkfWXiYpUKMkR,IT Manager,42,Reading)
(1733,YCufSDhVeKNeRBWRcQaM,Finance Manager,7,Reading)
(1734,DxulQlsyPTsMam,Operations Manager,35,Reading)
(1749,SpzMCBLIYJldmr,Product Manager,44,Reading)
(1782,qUfNWKYZkjTEnzzvuDK,IT)
...
```

### Task D Output

### Task E Output

### Task F Output

### Task G Output

### Task H Output


## Task 2 - Data Gen
### 2.1
The code for this is under Task 2/data_gen.py
The generated data has been uploaded into the hdfs environment using 

```
hdfs dfs -put input_file_location output_file_location
```

### 2.2
The original
```
1943,392780,5,4
6997,850552,8,2
2997,331311,6,2
8685,254990,9,3
3743,360014,6,0
```

a - Single Iteration
```
How to run:
hdfs dfs -rm -r -f /output/kmeans_single
hadoop jar /tmp/task2-2.jar ds503.task2.a_single.SingleIterationKMeans /input/tuples.csv /output/kmeans_single /input/tuples_2.csv
```

Calculated Centroids after one iteration
```
5020.043805612594,500456.58042436687,4.507871321013004,2.030800821355236	
5124.419871794872,320291.3717948718,4.480769230769231,2.0673076923076925	
4920.458128078818,361281.842364532,4.472906403940887,2.0098522167487687	
4960.019541206457,810332.9745114698,4.498300764655905,1.9847068819031435	
5092.917365269461,159019.0131736527,4.3964071856287426,2.0281437125748503
```

b - Multi Iteration (Passed in 5) -> notice I look at the fourth file because 0 is part of the indeces

```
root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# hdfs dfs -cat /output/kmeans_multi-4/part-r-00000

4970.646464646465,618980.215007215,4.471861471861472,1.9992784992784993	
4960.504522613065,421778.2351758794,4.499497487437186,2.067336683417085	
4989.228280407429,866038.4140203715,4.518274415817855,1.974835230677052	
5071.770363101079,106459.70853778213,4.43179587831207,2.0853778213935232	
5148.055853920516,264282.7948442535,4.3941997851772285,1.9656283566058002
```

c - Converging Iteration (Passed in 100) -> The program only ran 42 times since that is where conversion happened. 

```
root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# hadoop jar task2-2-1.0-SNAPSHOT.jar ds503.task2.c_early_term.KMeansEarlyTermination ./Proj2/tuples.csv /output/kmeans_early ./Proj2/tuples_2.csv 100
...
root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# hdfs dfs -ls /output
Found 43 items
drwxr-xr-x   - root supergroup          0 2026-02-23 23:52 /output/kmeans_early-0
drwxr-xr-x   - root supergroup          0 2026-02-23 23:52 /output/kmeans_early-1
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-10
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-11
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-12
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-13
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-14
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-15
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-16
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-17
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-18
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-19
drwxr-xr-x   - root supergroup          0 2026-02-23 23:52 /output/kmeans_early-2
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-20
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-21
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-22
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-23
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-24
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-25
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-26
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-27
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-28
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-29
drwxr-xr-x   - root supergroup          0 2026-02-23 23:52 /output/kmeans_early-3
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-30
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-31
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-32
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-33
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-34
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-35
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-36
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-37
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-38
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-39
drwxr-xr-x   - root supergroup          0 2026-02-23 23:52 /output/kmeans_early-4
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-40
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-41
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-42
drwxr-xr-x   - root supergroup          0 2026-02-23 23:52 /output/kmeans_early-5
drwxr-xr-x   - root supergroup          0 2026-02-23 23:52 /output/kmeans_early-6
drwxr-xr-x   - root supergroup          0 2026-02-23 23:52 /output/kmeans_early-7
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-8
drwxr-xr-x   - root supergroup          0 2026-02-23 23:53 /output/kmeans_early-9
```

d - Optimized KMeans

```
...
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-10/_SUCCESS
-rw-r--r--   1 root supergroup        373 2026-02-24 07:18 /output/kmeans_optimized-10/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-11/_SUCCESS
-rw-r--r--   1 root supergroup        374 2026-02-24 07:18 /output/kmeans_optimized-11/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-12/_SUCCESS
-rw-r--r--   1 root supergroup        367 2026-02-24 07:18 /output/kmeans_optimized-12/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-13/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:18 /output/kmeans_optimized-13/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-14/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 07:18 /output/kmeans_optimized-14/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-15/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:18 /output/kmeans_optimized-15/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-16/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 07:18 /output/kmeans_optimized-16/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-17/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 07:18 /output/kmeans_optimized-17/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-18/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 07:18 /output/kmeans_optimized-18/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-19/_SUCCESS
-rw-r--r--   1 root supergroup        357 2026-02-24 07:18 /output/kmeans_optimized-19/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-2/_SUCCESS
-rw-r--r--   1 root supergroup        369 2026-02-24 07:18 /output/kmeans_optimized-2/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-3/_SUCCESS
-rw-r--r--   1 root supergroup        373 2026-02-24 07:18 /output/kmeans_optimized-3/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-4/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 07:18 /output/kmeans_optimized-4/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-5/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 07:18 /output/kmeans_optimized-5/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-6/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:18 /output/kmeans_optimized-6/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-7/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:18 /output/kmeans_optimized-7/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-8/_SUCCESS
-rw-r--r--   1 root supergroup        362 2026-02-24 07:18 /output/kmeans_optimized-8/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:18 /output/kmeans_optimized-9/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 07:18 /output/kmeans_optimized-9/part-r-00000
root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# 
root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# hadoop fs -cat /output/kmeans_optimized-4/part-r-00000

root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# hadoop fs -cat /output/kmeans_optimized-19/part-r-00000
4961.882919005613,688611.6142742583,4.504410585404972,1.9775461106655974	
4953.76875957121,895337.5321592649,4.519908116385912,2.0	
5022.464850615114,494532.51054481545,4.449033391915641,2.0298769771528997	
5057.320590790617,117052.82102519549,4.422241529105126,2.0747176368375326	
5111.729706390328,303979.67702936096,4.447322970639033,1.9887737478411054	
root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# 
```

e - Output Variation
Variation 1:
This first one was done with 20 iterations so it did not converge.
```
root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# hadoop fs -cat /output/kmeans_output_variations-variation1/results.txt
Convergence Reached: NO
Final Cluster Centers:
4961.882919005613,688611.6142742583,4.504410585404972,1.9775461106655974	
4953.76875957121,895337.5321592649,4.519908116385912,2.0	
5022.464850615114,494532.51054481545,4.449033391915641,2.0298769771528997	
5057.320590790617,117052.82102519549,4.422241529105126,2.0747176368375326	
5111.729706390328,303979.67702936096,4.447322970639033,1.9887737478411054
```


This was done with 100 iterations so this is the output. It did converge
```
root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# hadoop fs -cat /output/kmeans_output_variations-variation1/results.txt
Convergence Reached: YES
Final Cluster Centers:
4941.160066006601,705848.0610561057,4.46039603960396,1.9686468646864685	
4980.214638157895,902646.1957236842,4.527138157894737,1.997532894736842	
5003.9084628670125,513879.55958549224,4.528497409326425,2.038860103626943	
5040.448844884489,121905.39191419142,4.4051155115511555,2.0618811881188117	
5128.816139767055,317467.7795341098,4.433444259567388,2.0	
root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# 
```

Variation 2:
```
root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# hadoop fs -cat /output/kmeans_output_variations-variation2/part-m-* | head -n 20
5683,387672,6,1	5128.816139767055,317467.7795341098,4.433444259567388,2.0
4191,333612,0,0	5128.816139767055,317467.7795341098,4.433444259567388,2.0
7775,669709,5,3	4941.160066006601,705848.0610561057,4.46039603960396,1.9686468646864685
5959,753401,7,3	4941.160066006601,705848.0610561057,4.46039603960396,1.9686468646864685
8987,713811,3,1	4941.160066006601,705848.0610561057,4.46039603960396,1.9686468646864685
4739,564374,9,1	5003.9084628670125,513879.55958549224,4.528497409326425,2.038860103626943
7375,920122,0,2	4980.214638157895,902646.1957236842,4.527138157894737,1.997532894736842
463,995659,2,1	4980.214638157895,902646.1957236842,4.527138157894737,1.997532894736842
9612,777197,2,0	4941.160066006601,705848.0610561057,4.46039603960396,1.9686468646864685
456,35729,2,1	5040.448844884489,121905.39191419142,4.4051155115511555,2.0618811881188117
7023,262812,7,2	5128.816139767055,317467.7795341098,4.433444259567388,2.0
9845,177030,2,1	5040.448844884489,121905.39191419142,4.4051155115511555,2.0618811881188117
3584,154108,7,3	5040.448844884489,121905.39191419142,4.4051155115511555,2.0618811881188117
4308,562151,7,3	5003.9084628670125,513879.55958549224,4.528497409326425,2.038860103626943
3522,995244,5,2	4980.214638157895,902646.1957236842,4.527138157894737,1.997532894736842
4513,364043,8,0	5128.816139767055,317467.7795341098,4.433444259567388,2.0
0,478412,8,0	5003.9084628670125,513879.55958549224,4.528497409326425,2.038860103626943
8835,253116,8,1	5128.816139767055,317467.7795341098,4.433444259567388,2.0
7490,515711,5,0	5003.9084628670125,513879.55958549224,4.528497409326425,2.038860103626943
7658,965182,0,1	4980.214638157895,902646.1957236842,4.527138157894737,1.997532894736842
cat: Unable to write to output stream.
root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# 
```


f - Explanation and Experiments
### 1. Explanations
a - This is the base k means algorithms using the map reduce methods it only runs the algorithm once. What it does is iterate through each point and compare the distance of that data point to the centroids. It then assigns the key value pair as <Centroid, data point>. This key value pair is, at this point, sent to shuffle and sort where it is then sent to the reducer. The reducer receives input formatted as such, <Centroid, List[Data points]>. The reducer then averages out the w,x,y,z values for all the points in the list and then assigns that newly calculated average point as the centroid. 

b - This does exactly what a does but instead of running just once, it runs as many times as the user specifies in the terminal input. So if you input 5 into the terminal then the Map Reduce KMeans will run 5 times. It is the exact same algorithm the only major code changes are to the run function. Since we are now writing to different files each time the program loops, you have to get the new centroids from the newly outputted file. These new centroids are now passed in as input on the next iteration. The final output can be seen at file /output/...-(input -1)/part-r-0000.

c - This is a build off of part b but instead of going through every iteration no matter what, it stops and doesn't proceed with the next iteration if the newly formualted centorids are within 0.1 of the previous centroids. This is then outputted to the final file as in the previous algorithm.

d - This is the same as the previous algorithms but it includes a combiner which functions as a pre processor to the reducer. Instead of passing in a list of points with the centroid as the key what we pass in after the combiner is <Centroid, {sum of the w,x,y,z points with the count appended}>

e - This formats the file output to just the final centroid and tells if the final output was reached due to convergence or not. Then for the second variation, it runs a map only job that assigns each data point to their respective cluster. 


### 2. Conducting Experiments & Performance Analysis

**Varying R (Max Iterations):**
*   *Experiment:* Run Algorithm (b) Fixed-Iteration with R=100. Run Algorithm (c) Early-Termination with R=100.
*   *Finding:* As seen in the Task (c) output in the README, Early Termination detected convergence after 42 iterations and successfully halted, whereas (b) would have blindly kept running.
*   *Analysis:* Early-termination avoids 58 completely redundant MapReduce jobs, proving that implementing state-checking (via Hadoop Counters) natively improves runtime efficiency by eliminating unnecessary static assignments.

**Relative Performance (Combiner vs No Combiner):**
*   *Experiment/Analysis:* By using the Combiner in Algorithm (d), the execution of MapReduce jobs is significantly faster. Because the Combiner pre-aggregates points into a single sum vector plus a count per Mapper, the amount of data written to disk, shuffled across the network, and processed by the Reducer is exponentially smaller compared to (c) which sends every single row of data independently. This decreases both memory load and network bottlenecking.

**Varying K (Number of Clusters):**
*   *Analysis:* By running the model with a tiny K (e.g. $K=2$), we expect the algorithm to converge slightly faster, but the clustering boundaries will be very broad and generalize the data heavily. With a larger K (e.g. $K=10$), computation time per Map task increases slightly (because distance must be checked against 10 centroids instead of 2 or 5). Furthermore with more centroids, the system is prone to taking more overall iterations to formally converge as cluster boundaries are tighter and points shift assignments more frequently.


# Nathaniel Ince

# Ryker Germain

## Run the PIG Scripts

```
pig task_#.pig
```