# !/bin/bash
#Basic
x=20
y=11
#arithmatic
echo $((x%y))
#conditional
: '
if [ $x = $y -o 10 -eq 11 ]
then
c=$(($x*$y))
echo "$c"
else
echo "lol"
fi
'
#while loop  | until loop is same as while but its run when condition is false
: '
while [ $x -le 10 ]
do
	echo "$x "
	x=$((x+1))
done
'
#for loop
: '
for i in {1..20} 
do
echo $i
done
'
#for loop but skipping like galloping local {start, end , increament}
: '
for i in {1..20..2} 
do
echo $i
done
'
#for loop same as others languages
: '
for((i=0;i<=10;i++))
do
echo $i
done
'
#upper case
: '
read x 
echo ${x^^}
'
#lower case
: '
read x 
echo ${x^}
'


