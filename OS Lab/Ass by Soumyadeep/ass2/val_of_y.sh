echo -n "Enter the value of x: "
read x 
echo -n "Enter the value of n: "
read n

if [ $n -eq 1 ]
then
	echo "Value of Y is $((1+$(($x**2))))"
elif [ $n -eq 2 ]
then
	echo "Value of Y is $((1+$(($x/n))))"
elif [ $n -eq 3 ]
then
	echo "Value of Y is $((1+$((2*$x))))"
elif [ $n -gt 3 -o $n -lt 1 ]
then
	echo "Value of Y is $((1+$((n*$x))))"
fi
