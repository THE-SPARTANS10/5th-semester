echo "Enter Three sides of triangle "
echo -n "Side1: "
read a
echo -n "Side2: "
read b
echo -n "Side3: "
read c

s=`echo "($a + $b + $c) /2"|bc -l`
x=`echo "$s * ($s - $a)*($s -$b)*($s-$c)"|bc -l`
x1=`echo "$x>0"|bc`

if [ $x1 -gt 0 ]
then
	echo "Triangle formation is possible"
	ar=`echo "scale=0; sqrt($x)"|bc -l`
	echo "Area is $ar"
else
	echo "Triangle formation is not possible"
fi

