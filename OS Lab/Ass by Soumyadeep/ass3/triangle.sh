tput clear
cols=`tput cols`
start=$((cols/2))
echo "How many rows do you want"
read rows
echo "What character do you want to use"
read char

tput clear
for((i=;i<rows;i++))
do 
cols=$((start-i))
tput cup $i $cols

for((j=0;j<=i;j++))
do
if [ $i -eq $((rows-1)) ]
then
printf "$char "

elif [ $j -eq 0 ]
then
	printf "$char "
else

	if [ $j -eq $i ]
	then
		printf "$char "
	else
	printf "  "
	fi 
fi

done
done
echo""
tput cup $(tput lines) 0 
