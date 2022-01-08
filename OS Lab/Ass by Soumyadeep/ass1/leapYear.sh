echo "Enter the year:"
read y
if [ $(($y%400)) -eq 0 ]
then
	echo "it is a leap year"
else
	if [ $(($y%4)) -eq 0 ] && [ $(($y%100)) -ne 0 ]
	then
		echo "it is a leap year"
	else
		echo "not a leap year"
	fi
fi 
#SP
