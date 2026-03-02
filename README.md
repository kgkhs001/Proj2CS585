# Proj2CS585

# Krishna Garg
#### AI Usage
For AI Usage I had AI make the template code for the map reduce. This code is readily available on the internet. It also helped me think out ideas about how to implement the combiner but the rest of the logic was my own. 

### Task A Output
Note that I only made it dump to the stdout and not save to a file. But the save to file functionality is commented.

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
Section of output, run against my own data. See comments in the task itself for commentary on how it works. - Nathaniel Ince
```
Laura738804_0	107
Ashley90316581670	76
John57371930570991	96
Ashley015_4_868335	104
David7217406_8_99	119
David11827_32_4	89
Laura73_1598079	93
Lily3_4938	94
Lily595908303229	95
Sarah6688_1_4_52	88
Joe25433232	93
Isaac6455054	101
Victoria9884	92
Julia628620_1	103
Ashley01698197507	101
Victoria006513869	107
Andrea2_600	95
Julia3980273281	100
Cutter53689150	97
Julia9674339_2_3	92
Jake714207594	96
Julia183281046155753	100
John2_165_	108
Cutter8_57	87
Laura16_78_6	88
Jake871_742729_31	114
Brandon963_9385	89
Ashley25705_6	86
Emma702010563	102
John5_70_082335442	104
Joe893_98_36728	94
Sarah71177613545_	96
Isaac9925539466	101
Julia04806_31801	102
Aaron98_93756	97
Nick5_0_99	95
Sarah69941_530_6	68
Laura648502096152071	110
Nick3848610	101
Victoria350_2446_868	103
Sarah4934327483324	95
Emma9828_55725877319	116
John52925226_	101
Julia_9594421717_2	97
John206893633163	89
Isaac60784_4100__12	99
John582_5544_760001	104
Laura988458	103
Lily63159_3116	107
Emily637506	102
Jake25_7046114447	104
Sarah80204780989	87
```

### Task E Output
Section of output, run against my own data. See the comments in task itself for commentary - Nathaniel Ince
```
199900	57	99
199902	53	95
199904	60	110
199906	50	88
199908	67	115
199910	54	93
199912	59	104
199914	53	98
199916	50	91
199918	60	107
199920	63	105
199922	58	101
199924	56	100
199926	60	107
199928	65	115
199930	57	100
199932	57	98
199934	43	76
199936	43	74
199938	51	91
199940	50	92
199942	53	96
199944	48	88
199946	54	98
199948	48	85
199950	64	117
199952	48	88
199954	59	105
199956	59	108
199958	52	97
199960	55	101
199962	62	115
199964	43	79
199966	64	119
199968	52	97
199970	40	72
199972	58	105
199974	66	124
199976	53	97
199978	50	90
199980	61	112
199982	54	100
199984	51	85
199986	50	89
199988	31	57
199990	48	87
199992	61	111
199994	55	94
199996	61	112
199998	61	108
200000	61	110

```
### Task F Output (Ryker)

```
root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 1# hdfs dfs -cat ./task_f_output/part-r-00000
5	XMGTalVNdekPuj
6	EUcCXUDQlks
9	WcnuOcgLMMsFwPDV
10	kSDwWeTPlxQQuC
12	zWtyeYOVslGK
13	rVnRagadBoKM
16	aQCdtefdAkyuTssM
17	AKwsIbHuyiVCnAoSX
18	OUdWwhwAkivvXqj
19	RGxmbPExcIFxUiVmjqpL
22	EhLQVdglGJ
24	wuliIdCGOWVUKvJCp
25	ruraJmwrsSQTr
27	ZGkSLOWWOjvyY
29	YqmPGFcmENYTNq
33	upoDLWQbBzOkAOtGKv
34	JFQZPOFcJm
37	MTXkKyCRBUWaUcprBy
38	lRhbnYIYvvGfg
40	ItVgYfWTEKQiGbMvpXj
41	xmYMZfTjBka
43	ZkVTHtUOVOrmJBFY
47	qPHGgosDTLXoPKkPHoV
52	AUBXncAhPKuDlSwKumnn
53	iraLafXLwtoAa
54	wCSzzyIeGzmVfwBxOZe
65	NtRLxmNKWlytmWITO
66	hzTXUzSniFDWF
68	MWNJhnPDphWbFNJjzW
71	FhLmMZauNqgQeA
77	xdrRrJBmQQ
79	LNQWQuOXhTnN
80	DJhRJXjaqW
86	jVdvZVjqOfipR
88	clQrnnceRqxwr
89	tIlicYzxfZ
90	GGAjUmIBeeIsVGZoJ
92	FbxupthnoAlYXgNRaXF
94	FwcGgqsCVK
97	QWfpvqxmZnCqmfuHIPD
102	qrAAWxPpsdIdG
103	UUYWYGsrJUqm
105	jUQsnVSOsECtzMQtxUI
107	jNNqCZXEANDqZZpuxSY
108	AxoNGdXVmIL
109	lzOYWcXhNyQyaQxm
110	NTJKLAvYvPLscGRSAs
111	bBwPBojtDbNZBFZJVwL
113	KDZvRQvnyGiTNiWatBu
114	DQQXXqoXrPVie
115	TXBTYCHXecWo
117	XNTTZTTCpAAeimn
118	DgpeYpYSPcEZe
121	qjOKJhlQNWEebVpcN
122	VHoMHvDYLbeafLyl
124	MsZwtHqfzagmmrv
127	kjdqzjWzSQcxIYbPGMOp
130	rPyNEjQpQosauehC
132	UEBSvfBEXJhSFdIf
133	DJgvyETVYN
134	VYrTqYWWKCsopjSaWJso
...
```

### Task G Output (Ryker)

```
1	gdNcivbmUmWqw
2	zpxYpfsSyYCDfK
3	gyLDezrITBdBpoE
4	OhjELhYLHyveq
5	XMGTalVNdekPuj
6	EUcCXUDQlks
7	yRRppJaJOB
8	BFqEbXKaaRDjZNVSR
9	WcnuOcgLMMsFwPDV
10	kSDwWeTPlxQQuC
11	nYsSAktpIUKXNEePsVEt
12	zWtyeYOVslGK
13	rVnRagadBoKM
14	ThnVVDdZbfipx
15	MHjxsXjloAgeJ
16	aQCdtefdAkyuTssM
17	AKwsIbHuyiVCnAoSX
18	OUdWwhwAkivvXqj
19	RGxmbPExcIFxUiVmjqpL
20	sXXRaePyOdWU
21	WdrrGVpOwHE
22	EhLQVdglGJ
23	rlNlftrmLcb
24	wuliIdCGOWVUKvJCp
25	ruraJmwrsSQTr
26	peehRkSaBoCDmOynYD
27	ZGkSLOWWOjvyY
28	WWfkusxowUHSQME
29	YqmPGFcmENYTNq
30	cYMYAtXrtmY
31	dVommmseHvNk
32	gnWcRvGtmQUOSvaX
33	upoDLWQbBzOkAOtGKv
34	JFQZPOFcJm
35	nWwGMekJdNXVCJAUL
36	IkDlBesYeTaXdeDZIG
37	MTXkKyCRBUWaUcprBy
38	lRhbnYIYvvGfg
39	GRVjKjizssxHZZjJ
40	ItVgYfWTEKQiGbMvpXj
41	xmYMZfTjBka
42	cZIxnHnFwUJePPKwPhI
43	ZkVTHtUOVOrmJBFY
44	hnjpLOHhoXYDofCHWina
45	LMhqSsqEhbkvDTDu
46	XFoaKWPixj
47	qPHGgosDTLXoPKkPHoV
48	xQUCdpsOri
49	VhqVMKBujTGJkuGb
50	aPufcGjAydvBzvtdk
51	TLZHEeJvGfaz
52	AUBXncAhPKuDlSwKumnn
53	iraLafXLwtoAa
54	wCSzzyIeGzmVfwBxOZe
55	ZsggpsfyWGOyNo
56	PrxsQoJsSYde
57	znQefysLwcpcx
58	JLgGjnOEhXljPcXuPMri
59	UtdzXdpiblT
60	OhTstwHHBZaoAWWykHn
61	yWIaZCDxmHEb
62	MeNDpmiFFtJb
63	GsvKUAlbvDiDknd
64	jDEfaEvpaltacBZqt
65	NtRLxmNKWlytmWITO
66	hzTXUzSniFDWF
67	rYuwSUvywfuqk
68	MWNJhnPDphWbFNJjzW
69	OORfyEZCSwXqs
70	OfXzQxDpKiLl
71	FhLmMZauNqgQeA
72	ssNOlhGdHPQBy
73	IhZItigQsy
74	QLlQOnEXZTUfUrHc
75	pTqonrMuohCHMu
76	NObSWfsqKnMKzIavbF
77	xdrRrJBmQQ
78	PhyTodxEnjNAipxwaH
79	LNQWQuOXhTnN
80	DJhRJXjaqW
81	eDDZgLSqGgsjQnyhQlkh
82	SHhSpFOJmkMBKHxgU
83	ojgAKdCSKlBqLE
84	mKuNYYxXwFYoWXJMvF
85	jpoWRCecpI
86	jVdvZVjqOfipR
87	yreKialHednBQXD
88	clQrnnceRqxwr
89	tIlicYzxfZ
90	GGAjUmIBeeIsVGZoJ
91	pXZokoaroInn
92	FbxupthnoAlYXgNRaXF
93	hSdAtTpqplgemfnfUxC
94	FwcGgqsCVK
95	WPqfYqDglqKRtPpme
96	iTndLHFTgJUZch
97	QWfpvqxmZnCqmfuHIPD
98	WSnUWzbEHzaWMgcOn
99	fTkZNuQqipNkcAIjNyO
100	ROybokFsQCLhf
101	uvzJfboKJnCLoDRILp
102	qrAAWxPpsdIdG
103	UUYWYGsrJUqm
104	CMCdUSSKQKeuBCRRn
105	jUQsnVSOsECtzMQtxUI
106	wfSCpcUejsGP
107	jNNqCZXEANDqZZpuxSY
108	AxoNGdXVmIL
109	lzOYWcXhNyQyaQxm
110	NTJKLAvYvPLscGRSAs
111	bBwPBojtDbNZBFZJVwL
112	RciFqOxCmMcO
113	KDZvRQvnyGiTNiWatBu
114	DQQXXqoXrPVie
115	TXBTYCHXecWo
116	zgFwWSLykJtRnM
117	XNTTZTTCpAAeimn
118	DgpeYpYSPcEZe
119	xwDtLkQPiUtS
120	itGCydThJHNda
121	qjOKJhlQNWEebVpcN
122	VHoMHvDYLbeafLyl
123	qjWQLLdtTSOGVR
124	MsZwtHqfzagmmrv
125	JGEJGeWEFzUgbxpIW
126	yMRDpMkXiu
127	kjdqzjWzSQcxIYbPGMOp
128	kgnhrwVftNMnQrKcuY
129	ilLsFiXkpBilHa
130	rPyNEjQpQosauehC
131	zqsntzGuxaZTcQw
132	UEBSvfBEXJhSFdIf
133	DJgvyETVYN
134	VYrTqYWWKCsopjSaWJso
135	wCKmsLXjFQsTNEwUOC
136	ccafTuckrmTizankuQT
137	jkKdlxUeRYIs
138	hknDKLhgQCsmn
139	zBrWjpFWORH
140	DVhJpNakPtAL
141	yBbUozJwFZShFWdvOrK
142	ooZdDZPPXyIS
143	pTVpiegWvjeNqZKUg
144	TTxMdRxCuebdSn
145	uupvLjtZPRDkzNn
146	IKkGBXjrZyxCNmR
147	LCIasWBTTLlRD
148	SCZKuxpKlyIPACyAU
149	iSbNKejjjPPKTLQY
150	IANaANGsFkVkVASl
151	MuoSlPUIgZLLAhgUcUh
152	wQMogXVLcM
153	aHvTpCTPGWpcQ
154	sCoACmqSEfIWbSPgRKiN
...
```
### Task H Output (Ryker)


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
*   *Analysis:* Early-termination avoids 50-100 completely redundant MapReduce jobs, proving that implementing state-checking natively improves runtime efficiency by eliminating unnecessary static assignments.

**Relative Performance (Combiner vs No Combiner):**
*   *Experiment/Analysis:* By using the Combiner in Algorithm (d), the execution of MapReduce jobs is significantly faster. Because the Combiner pre-aggregates points into a single sum vector plus a count per Mapper, the amount of data written to disk, shuffled across the network, and processed by the Reducer is exponentially smaller compared to (c) which sends every single row of data independently. This decreases both memory load and network bottlenecking.

**Varying K (Number of Clusters):**
*   *Analysis:* By running the model with a tiny K (e.g. K=2), we expect the algorithm to converge slightly faster, but the clustering boundaries will be very broad and generalize the data heavily. With a larger K (e.g. K=10), computation time per Map task increases slightly (because distance must be checked against 10 centroids instead of 2 or 5). Furthermore with more centroids, the system is prone to taking more overall iterations to formally converge as cluster boundaries are tighter and points shift assignments more frequently.


```
This is what happened when there were 5 clusters. TLDR: when the early termination algorithm was run with a value for 100, it only ran 43 times.

hadoop jar task2-2-1.0-SNAPSHOT.jar ds503.task2.c_early_term.KMeansEarlyTermination ./Proj2/tuples.csv /output/kmeans_early ./Proj2/tuples_2.csv 100

root@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# hdfs dfs -ls /output/kmeans*       
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:41 /output/kmeans_early-0/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 19:41 /output/kmeans_early-0/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:41 /output/kmeans_early-1/_SUCCESS
-rw-r--r--   1 root supergroup        373 2026-02-24 19:41 /output/kmeans_early-1/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-10/_SUCCESS
-rw-r--r--   1 root supergroup        373 2026-02-24 19:42 /output/kmeans_early-10/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-11/_SUCCESS
-rw-r--r--   1 root supergroup        374 2026-02-24 19:42 /output/kmeans_early-11/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-12/_SUCCESS
-rw-r--r--   1 root supergroup        367 2026-02-24 19:42 /output/kmeans_early-12/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-13/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 19:42 /output/kmeans_early-13/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-14/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 19:42 /output/kmeans_early-14/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-15/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 19:42 /output/kmeans_early-15/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-16/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 19:42 /output/kmeans_early-16/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-17/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 19:42 /output/kmeans_early-17/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-18/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 19:42 /output/kmeans_early-18/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-19/_SUCCESS
-rw-r--r--   1 root supergroup        357 2026-02-24 19:42 /output/kmeans_early-19/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:41 /output/kmeans_early-2/_SUCCESS
-rw-r--r--   1 root supergroup        369 2026-02-24 19:41 /output/kmeans_early-2/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-20/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 19:42 /output/kmeans_early-20/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-21/_SUCCESS
-rw-r--r--   1 root supergroup        369 2026-02-24 19:42 /output/kmeans_early-21/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-22/_SUCCESS
-rw-r--r--   1 root supergroup        365 2026-02-24 19:42 /output/kmeans_early-22/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-23/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 19:42 /output/kmeans_early-23/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-24/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 19:42 /output/kmeans_early-24/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-25/_SUCCESS
-rw-r--r--   1 root supergroup        369 2026-02-24 19:42 /output/kmeans_early-25/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-26/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 19:42 /output/kmeans_early-26/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-27/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 19:42 /output/kmeans_early-27/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-28/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 19:42 /output/kmeans_early-28/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-29/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 19:42 /output/kmeans_early-29/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:41 /output/kmeans_early-3/_SUCCESS
-rw-r--r--   1 root supergroup        373 2026-02-24 19:41 /output/kmeans_early-3/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-30/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 19:42 /output/kmeans_early-30/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-31/_SUCCESS
-rw-r--r--   1 root supergroup        373 2026-02-24 19:42 /output/kmeans_early-31/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-32/_SUCCESS
-rw-r--r--   1 root supergroup        357 2026-02-24 19:42 /output/kmeans_early-32/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-33/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 19:42 /output/kmeans_early-33/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-34/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 19:42 /output/kmeans_early-34/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-35/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 19:42 /output/kmeans_early-35/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-36/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 19:42 /output/kmeans_early-36/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-37/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 19:42 /output/kmeans_early-37/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-38/_SUCCESS
-rw-r--r--   1 root supergroup        369 2026-02-24 19:42 /output/kmeans_early-38/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-39/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 19:42 /output/kmeans_early-39/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:41 /output/kmeans_early-4/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 19:41 /output/kmeans_early-4/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-40/_SUCCESS
-rw-r--r--   1 root supergroup        369 2026-02-24 19:42 /output/kmeans_early-40/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-41/_SUCCESS
-rw-r--r--   1 root supergroup        356 2026-02-24 19:42 /output/kmeans_early-41/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:42 /output/kmeans_early-42/_SUCCESS
-rw-r--r--   1 root supergroup        356 2026-02-24 19:42 /output/kmeans_early-42/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:41 /output/kmeans_early-5/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 19:41 /output/kmeans_early-5/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:41 /output/kmeans_early-6/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 19:41 /output/kmeans_early-6/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:41 /output/kmeans_early-7/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 19:41 /output/kmeans_early-7/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:41 /output/kmeans_early-8/_SUCCESS
-rw-r--r--   1 root supergroup        362 2026-02-24 19:41 /output/kmeans_early-8/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 19:41 /output/kmeans_early-9/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 19:41 /output/kmeans_early-9/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-0/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:22 /output/kmeans_output_variations-0/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-1/_SUCCESS
-rw-r--r--   1 root supergroup        373 2026-02-24 07:22 /output/kmeans_output_variations-1/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-10/_SUCCESS
-rw-r--r--   1 root supergroup        373 2026-02-24 07:22 /output/kmeans_output_variations-10/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-11/_SUCCESS
-rw-r--r--   1 root supergroup        374 2026-02-24 07:22 /output/kmeans_output_variations-11/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-12/_SUCCESS
-rw-r--r--   1 root supergroup        367 2026-02-24 07:22 /output/kmeans_output_variations-12/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-13/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:22 /output/kmeans_output_variations-13/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-14/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 07:22 /output/kmeans_output_variations-14/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-15/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:22 /output/kmeans_output_variations-15/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-16/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 07:22 /output/kmeans_output_variations-16/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-17/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 07:22 /output/kmeans_output_variations-17/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-18/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 07:22 /output/kmeans_output_variations-18/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-19/_SUCCESS
-rw-r--r--   1 root supergroup        357 2026-02-24 07:23 /output/kmeans_output_variations-19/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-2/_SUCCESS
-rw-r--r--   1 root supergroup        369 2026-02-24 07:22 /output/kmeans_output_variations-2/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-20/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:23 /output/kmeans_output_variations-20/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-21/_SUCCESS
-rw-r--r--   1 root supergroup        369 2026-02-24 07:23 /output/kmeans_output_variations-21/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-22/_SUCCESS
-rw-r--r--   1 root supergroup        365 2026-02-24 07:23 /output/kmeans_output_variations-22/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-23/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:23 /output/kmeans_output_variations-23/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-24/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 07:23 /output/kmeans_output_variations-24/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-25/_SUCCESS
-rw-r--r--   1 root supergroup        369 2026-02-24 07:23 /output/kmeans_output_variations-25/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-26/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 07:23 /output/kmeans_output_variations-26/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-27/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 07:23 /output/kmeans_output_variations-27/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-28/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 07:23 /output/kmeans_output_variations-28/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-29/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 07:23 /output/kmeans_output_variations-29/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-3/_SUCCESS
-rw-r--r--   1 root supergroup        373 2026-02-24 07:22 /output/kmeans_output_variations-3/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-30/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 07:23 /output/kmeans_output_variations-30/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-31/_SUCCESS
-rw-r--r--   1 root supergroup        373 2026-02-24 07:23 /output/kmeans_output_variations-31/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-32/_SUCCESS
-rw-r--r--   1 root supergroup        357 2026-02-24 07:23 /output/kmeans_output_variations-32/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-33/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:23 /output/kmeans_output_variations-33/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-34/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 07:23 /output/kmeans_output_variations-34/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-35/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 07:23 /output/kmeans_output_variations-35/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-36/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 07:23 /output/kmeans_output_variations-36/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-37/_SUCCESS
-rw-r--r--   1 root supergroup        371 2026-02-24 07:23 /output/kmeans_output_variations-37/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-38/_SUCCESS
-rw-r--r--   1 root supergroup        369 2026-02-24 07:23 /output/kmeans_output_variations-38/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-39/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:23 /output/kmeans_output_variations-39/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-4/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 07:22 /output/kmeans_output_variations-4/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-40/_SUCCESS
-rw-r--r--   1 root supergroup        369 2026-02-24 07:23 /output/kmeans_output_variations-40/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-41/_SUCCESS
-rw-r--r--   1 root supergroup        356 2026-02-24 07:23 /output/kmeans_output_variations-41/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-42/_SUCCESS
-rw-r--r--   1 root supergroup        356 2026-02-24 07:23 /output/kmeans_output_variations-42/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-5/_SUCCESS
-rw-r--r--   1 root supergroup        368 2026-02-24 07:22 /output/kmeans_output_variations-5/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-6/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:22 /output/kmeans_output_variations-6/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-7/_SUCCESS
-rw-r--r--   1 root supergroup        370 2026-02-24 07:22 /output/kmeans_output_variations-7/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-8/_SUCCESS
-rw-r--r--   1 root supergroup        362 2026-02-24 07:22 /output/kmeans_output_variations-8/part-r-00000
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:22 /output/kmeans_output_variations-9/_SUCCESS
-rw-r--r--   1 root supergroup        372 2026-02-24 07:22 /output/kmeans_output_variations-9/part-r-00000
Found 1 items
-rw-r--r--   1 root supergroup        404 2026-02-24 07:23 /output/kmeans_output_variations-variation1/results.txt
Found 2 items
-rw-r--r--   1 root supergroup          0 2026-02-24 07:23 /output/kmeans_output_variations-variation2/_SUCCESS
-rw-r--r--   1 root supergroup     516034 2026-02-24 07:23 /output/kmeans_output_variations-variation2/part-m-00000


Then for the second run we had 10 clusters (2x more than the last run) and ran the same command:
hadoop jar task2-2-1.0-SNAPSHOT.jar ds503.task2.c_early_term.KMeansEarlyTermination ./Proj2/tuples.csv /output/kmeans_early ./Proj2/tuples_2.csv 100

This time it ran all iterations of the program, since there are more clusters. 

^Croot@810b433b1ffe:/home/ds503/shared_folder/Proj2/Task 2/2.2/target# hdfs dfs -ls /output/
Found 100 items
drwxr-xr-x   - root supergroup          0 2026-02-24 20:01 /output/kmeans_early-0
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-1
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-10
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-11
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-12
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-13
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-14
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-15
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-16
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-17
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-18
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-19
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-2
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-20
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-21
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-22
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-23
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-24
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-25
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-26
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-27
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-28
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-29
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-3
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-30
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-31
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-32
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-33
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-34
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-35
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-36
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-37
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-38
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-39
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-4
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-40
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-41
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-42
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-43
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-44
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-45
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-46
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-47
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-48
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-49
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-5
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-50
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-51
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-52
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-53
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-54
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-55
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-56
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-57
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-58
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-59
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-6
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-60
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-61
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-62
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-63
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-64
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-65
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-66
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-67
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-68
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-69
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-7
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-70
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-71
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-72
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-73
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-74
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-75
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-76
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-77
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-78
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-79
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-8
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-80
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-81
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-82
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-83
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-84
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-85
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-86
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-87
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-88
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-89
drwxr-xr-x   - root supergroup          0 2026-02-24 20:02 /output/kmeans_early-9
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-90
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-91
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-92
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-93
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-94
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-95
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-96
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-97
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-98
drwxr-xr-x   - root supergroup          0 2026-02-24 20:03 /output/kmeans_early-99
```

# Nathaniel Ince

I contributed Silhouette
See the folder for my explanation of how it works. (silhouette_doc.md in E-silhouette)

I experimented on my own data with my own k-means program, so the centroids will not look quite alike. And since we are using a new dataset, rather than 
enriching the previous results we will take off our own exploration and see if we can get structured clusters.

Here's what happens if you make 1000 centroids and run silhouette before running k-means a.
```
100008.0,492107.0,791956.0,67077.0	0.00381878353889874
101486.0,315551.0,710093.0,243239.0	NaN
101537.0,424765.0,198033.0,919297.0	0.22582627852826948
103009.0,892015.0,424903.0,451690.0	-0.1383929039544215
104132.0,884790.0,474558.0,380733.0	Infinity
105834.0,283173.0,816421.0,168669.0	0.02327624821454672
106994.0,345170.0,812661.0,941509.0	0.23581189958089713
107984.0,824034.0,884996.0,273234.0	0.060249334673563096
108130.0,961261.0,407021.0,43925.0	0.23640090174950715
108780.0,664042.0,103784.0,296691.0	-0.07159420965791892
108973.0,842618.0,927218.0,177198.0	0.7649511130873289
110171.0,219115.0,232317.0,795740.0	NaN
113657.0,646331.0,293644.0,928520.0	-0.26811715425150046
114158.0,942376.0,577778.0,597615.0	Infinity
114958.0,915930.0,430610.0,348699.0	-0.004964792163537618
117367.0,356273.0,659418.0,589319.0	-0.013616397380311646
117552.0,828377.0,976844.0,269694.0	0.6272681713134434
119111.0,558006.0,270786.0,655841.0	-0.08702105255810652
119131.0,621992.0,366616.0,709374.0	Infinity
121365.0,702323.0,720271.0,160130.0	0.06020818388104482
123522.0,36296.0,232806.0,779545.0	0.011882287296135066
126366.0,933141.0,302864.0,48185.0	Infinity
128845.0,316577.0,744586.0,107635.0	0.2528048272122852
```
This was a confusing result as I have check the calculations of my program many times, but:
1.) Negative numbers are legitimate results fomr the calculation
2.) Infinity largely comes from the average being over (n-1), and we have many single point clusters here
3.) NaN's are probably from zero point clusters.

When we run k-means part a to do a single iteration clustering against 1000 points, we get:
```
124858.77777777777,57936.0,821289.4444444444,401139.44444444444	0.006484455336616603
173440.3733153639,696035.3517520216,580478.1118598384,488403.44339622644	0.0015198621393429663
272633.14285714284,47815.71428571428,822287.857142857,120381.21428571428	-0.0016278123275744202
510839.23260869563,605569.1652173913,89265.98260869566,695205.2434782609	0.0019121902704003484
55500.320512820515,623213.7692307692,520945.5726495727,676069.5000000001	5.629911984274448E-5
571762.5767195767,231447.71534391536,558301.5142857144,637171.264021164	0.009963143769832894
587895.681498829,649231.4590163934,549751.868852459,66300.84543325526	0.025779737549567805
624138.0886864812,652485.7435282838,530110.8902205178,444801.6538830297	0.015859160484499073
66553.51388888889,199500.875,813137.5277777778,482197.0555555555	0.002201256717204422
743062.9090909091,688828.2727272727,36897.045454545456,205441.0	0.025051816398451804
751630.0,62948.1875,473834.25,46410.8125	0.0038358899284623516
96980.17857142857,447360.5357142857,773244.0,59216.142857142855	0.023760096194931506
```

Most of the centers from part one don't stay around. Numbers are looking better.

We repeat with 2000 centroids. 

```
122153.25,454323.88095238095,801157.8095238095,120354.2738095238	0.01697369512793054
127125.109375,68483.109375,775813.0625,608014.5	0.02579477331620977
172388.88235294117,716678.0,709006.8823529412,37415.0	0.007496894163697466
194107.0,784740.1111111111,31529.777777777777,631230.8888888889	0.024226621826281224
206524.0,163813.15789473683,786276.0,148617.52631578947	0.005963617220040552
237857.50357426528,705453.3764892771,602768.0778395552,511520.1064336775	0.0362757438030315
277506.3333333333,43530.33333333333,852315.0,173744.0	0.0032825042995928157
455222.55769230775,216272.38461538462,816680.25,66751.69230769231	0.0015872976007193377
53175.0,25451.0,78889.0,789802.0	1.5005656770952503E-4
56435.0,831100.4705882353,612088.1764705882,86852.0	-0.0038885694292425123
603678.3115038115,359555.80388080387,568354.2723492724,604707.0679140679	-0.0028903907681577822
624152.7272727273,894342.1818181819,26022.18181818182,602646.0909090909	0.012040545719374669
626240.0,40688.333333333336,759936.2,78407.53333333333	0.042086868223545314
631719.3022452504,670699.5975820379,551969.7340241796,102879.03972366148	0.011267384360193686
654821.4993849939,689478.4809348093,176569.28044280445,501534.7749077491	0.05265758752036319
656715.8297872341,62385.51063829787,71542.14893617021,636721.6808510638	0.01808785514814764
87372.81147540984,673117.868852459,161567.69672131148,725005.5491803279	0.012925653649260268
897490.0,33786.0,94540.0,29256.0	0.0262280921680099
91485.0,142767.0,32619.0,608158.0	0.026959237292615262
```

Now let's try 2000 centroids, 10 iterations for part b. Here's part of the output:

```
105308.0,163643.0,806331.857142857,231625.42857142855	0.03027718799170069
114226.5,35022.0,800980.5,368641.5	0.03558499199207617
145506.13414634147,150189.1219512195,498645.31707317074,782773.8658536585	0.07954423267271171
152405.91089108912,517983.801980198,126420.89108910892,804130.9306930694	0.02506937128543082
190825.52702702704,660509.320945946,584239.914695946,600912.2018581082	0.015860188944979026
210888.71666666667,77412.01666666666,771110.7,757059.6833333333	0.10637274956641031
244698.15789473683,112077.7894736842,126442.42105263157,866591.5263157894	-0.007049472930177221
25738.0,32168.0,240688.0,840468.0	0.017678162396898147
267936.0,172441.0,725189.25,257665.0	-0.024904569633277696
300398.2,22325.4,202305.2,785516.8	-0.11554438832622611
323020.575,92504.55,853762.175,385148.075	-0.07925754324683623
346116.5365853659,361695.34146341466,153314.26829268294,845213.243902439	0.02195003425501832
385504.9917355372,453441.7355371901,536901.1239669422,818241.0495867769	-0.005158573452942771
413638.7916666666,204640.875,327902.8333333333,841503.4583333333	0.03781928882328672
42680.0,88556.8,655381.8,647087.4	0.0110146810362952
438674.5,184446.0,41415.0,707827.5	0.007766538399682442
475877.93501805054,366386.8844765343,739129.3610108304,712658.7581227437	0.010415801600909016
508439.8,93319.0,73980.12,812427.36	0.009251513879609085
530497.0,306964.0,29142.0,838861.0	0.07670633805198386
551240.2857142857,339877.8571428571,160581.7857142857,845153.2857142857	0.029325339281639076
574735.6321510298,604881.3369565217,618418.3375286041,224612.25228832953	0.03002571656139643
606634.1136363636,584846.0568181819,400520.375,799984.4659090909	-0.020772112232072572
608979.3333333334,763240.4761904762,555619.4761904762,700556.1238095239	-0.004429597562028917
611393.067357513,113093.34715025907,676705.6787564767,737648.139896373	0.05020936800733405
630116.4060150377,700938.8150375941,170069.23458646616,629049.0781954888	0.027186745709850812
63389.625,106404.0625,857897.5625,402249.75	0.03402012429551722
636679.5,184573.0,27397.5,55980.5	0.05238128584010645
638380.25,797656.25,895022.6666666666,690038.0833333333	0.03355718443367537
644508.5,210921.5,32103.0,116547.0	-0.024088813777830606
676550.059602649,263902.70198675495,728554.1456953642,649557.2185430464	0.08983298751694291
677916.1666666666,359537.8333333333,288005.6666666666,903101.0	-0.027370139471122473
```

There's more centroids because I took steps in the multi-iteration to make sure we don't lose the number of centroids between steps. Numbers still seem somewhat low.

Lets try 1000 centers, 10 iterations

``` 
46647.0,25009.0,21134.0,944176.0	0.013111235443056438
213817.0,87003.0,930408.0,96305.0	0.017553564574091456
252025.0,610800.0,34592.0,29991.0	0.012061112746431193
279219.2,34561.0,796667.8,385234.2	0.01975877825650504
302901.60867834394,573029.6102707007,598306.7925955415,611943.909633758	-0.008046134824553651
324212.5,34345.75,842839.5,120206.75	-4.4657122477181194E-4
336896.80000000005,50971.8,32905.0,687888.8	0.04030693717808422
353662.82352941175,34788.0,525928.1764705882,873244.1176470588	0.006247256429261853
361396.5641025641,141017.0683760684,812237.5042735044,489121.5555555556	0.021962084567613754
421636.0,980001.0,95813.0,48224.0	0.026231693019761342
453253.7737226277,636196.2895377129,743687.4841849149,115365.56447688564	0.029358258128439126
502595.325,119521.175,814911.65,85737.55	0.09166103437286571
558477.0,47029.75,232558.5625,804185.375	0.029629611658158667
559265.5555555555,74729.57407407407,813463.1666666666,516469.8518518518	0.06735309945028128
582124.4215686275,807550.1078431372,375734.3333333333,114458.48039215687	0.04177958120110721
607675.2857142857,189458.94285714286,443193.4285714286,824244.2285714286	0.01541488281159068
651665.387755102,123222.63265306121,645798.163265306,789921.5714285714	0.02805908303387888
693965.5942599887,542144.1525042206,255379.30669667982,549639.382667417	-5.94835148234379E-4
729870.8431372549,626860.568627451,717192.068627451,441407.26470588235	0.020843616078787763
745019.1333333333,461175.3333333333,263411.5333333333,43393.4	-0.003091980419266245
745417.792,225060.02133333334,716225.9946666666,333351.7866666667	0.03767683661698853
760627.3333333333,29506.666666666664,358054.0,281608.3333333333	0.01688765186965802
789582.3513513514,70273.56756756757,634477.945945946,102916.13513513515	0.004297101131452692
789729.9375,557819.0795454546,635387.7102272727,175109.25	0.08048087645063122
791678.4411764706,156974.5294117647,329857.70588235295,104596.35294117648	0.009788513185444459
820523.9361702127,65815.4255319149,556119.8723404255,613230.8510638297	0.034175069735144954

```


Numbers are still not looking good, as bigger s indicative of better cluster structure. This is starting to get concerning. 

So here's what we'll do for part c. We'll work with 500 centroids, set this for 100 iterations, but exit at threshold 100 (points are pretty far from each other).

Here's a segment of what we get.

```
132615.5,964817.6666666666,210216.3333333333,387567.1666666666	0.38600173774237106
133321.66666666666,918319.8333333333,735725.8333333333,74807.0	-0.08039345889944031
133815.0,459544.9375,842096.0625,353601.5	0.22394516906425813
140542.0,733383.7000000001,158152.5,933166.6000000001	0.17718330226071188
141524.96296296295,660718.9629629629,549352.7407407407,369180.0	0.4000818158585013
142114.0909090909,866350.0,931985.5454545455,180653.45454545456	0.04993770034835765
142866.66666666666,397189.0,68774.0,639297.3333333333	-0.03624039935844782
146918.0,400836.1666666666,93836.83333333333,219882.66666666666	-0.015417617337772955
150338.66666666666,369387.6666666666,957889.0,453025.6666666666	0.008050737946080003
155687.94117647057,236117.17647058822,97411.29411764706,930223.1764705882	0.16113309031201692
155930.2,350128.30000000005,727586.2000000001,486798.0	Infinity
156858.625,285950.5,567148.5,235089.0	0.2849546981374252
158965.89285714284,648262.4642857142,859048.9285714285,572654.5	0.10024350199451149
160798.53333333333,911930.7333333333,68077.0,836411.8666666667	0.04040207443677796
```

My program also outputs counts of points in each cluster, and there's a bunch of single point clusters. It's concerning we are still getting pretty low numbers,
but it's looking better. Let's try threshold 1.0 and look at an except

```
306281.7,857450.7000000001,234910.2,764573.1000000001	0.20095400587120762
307589.5,431853.3333333333,276163.3333333333,492905.5	0.23989187723350497
310036.70588235295,914629.9411764706,80578.94117647059,902895.9411764706	0.10869742373032076
313880.75,692003.625,203690.625,233605.375	0.0945714990119813
315756.75,238934.25,238775.8125,580140.0625	0.035855923654458756
316361.88235294115,191826.5294117647,382040.23529411765,131873.5294117647	0.9888383002578455
320192.07692307694,694358.0,652951.076923077,934422.8461538462	Infinity
326431.71428571426,537183.0,228053.5,631831.8571428572	0.24948886728180214
332872.80000000005,357738.80000000005,594526.6,634724.0	-0.42978811218696317
```
Still not great but looking better. 

As part d and e's changes don't affect what kinds of centroids we get, I will not experiment with them. 


# Ryker Germain

## Run the PIG Scripts

```
pig task_#.pig
```