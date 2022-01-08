GCD()
{
a=$1
b=$2
	if [ $b -eq 0 ]
	then
		return $a
	else
		return $(GCD $b $(($a % $b)))
	fi
}

LCM()
{
a=$1
b=$2
GCD $a $b
gcd=$?
temp=$(($a / $gcd))
echo "$(($temp * $b))"
}


echo -n "Enter two integer: "
read n1 n2

a=$n1
b=$n2

GCD $a $b
c=$?
echo -n "gcd of $n1 and $n2 is: $c "
echo
ans=$?
echo -n "lcm of $n1 and $n2 is: $(LCM $n1 $n2) "
echo
#SP
