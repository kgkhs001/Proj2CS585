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
Section of output, run against my own data. See the task itself for commentary - Nathaniel Ince
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
Section of output, run against my own data. See the task itself for commentary - Nathaniel Ince
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
See the folder for my explanation of how it works. 

# Ryker Germain

## Run the PIG Scripts

```
pig task_#.pig
```