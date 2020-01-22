#Write lines consisting of the sequentially corresponding lines from each FILE
# -d, = delimiter =[LISTA]
# -s, --serial uses the characters indicated in LISTA instead of tabulators
# We work with 3 files number, state, capital. You can create the files
#
#     number         state               capital
#	1	Arunachal Pradesh	Itanagar
#	2	Assam			Dispur
#	3	Andhra Pradesh		Hyderabad
#	4	Bihar			Patna
#	5	Chhattisgrah		Raipur


#command
paste number state capital
#output
1	Arunachal Pradesh	Itanagar
2	Assam	Dispur
3	Andhra Pradesh	Hyderabad
4	Bihar	Patna
5	Chhattisgrah	Raipur

#command
paste -d ";" number state capital
#output
1;Arunachal Pradesh;Itanagar
2;Assam;Dispur
3;Andhra Pradesh;Hyderabad
4;Bihar;Patna
5;Chhattisgrah;Raipur

#command
paste -d "|," number state capital
#output
1|Arunachal Pradesh,Itanagar
2|Assam,Dispur
3|Andhra Pradesh,Hyderabad
4|Bihar,Patna
5|Chhattisgrah,Raipur

#command
paste -d "|,-" number state capital number
#output
1|Arunachal Pradesh,Itanagar-1
2|Assam,Dispur-2
3|Andhra Pradesh,Hyderabad-3
4|Bihar,Patna-4
5|Chhattisgrah,Raipur-5

#command
paste -s number state capital
#output
1	2	3	4	5
Arunachal Pradesh	Assam	Andhra Pradesh	Bihar	Chhattisgrah
Itanagar	Dispur	Hyderabad	Patna	Raipur

#command
paste -s -d ":" number state capital
#output
1:2:3:4:5
Arunachal Pradesh:Assam:Andhra Pradesh:Bihar:Chhattisgrah
Itanagar:Dispur:Hyderabad:Patna:Raipur

#command
cut -d " " -f 1 state | paste number -
#output
1	Arunachal
2	Assam
3	Andhra
4	Bihar
5	Chhattisgrah

#command
paste -d "\t" number state
#output
1	Arunachal Pradesh
2	Assam
3	Andhra Pradesh
4	Bihar
5	Chhattisgrah

