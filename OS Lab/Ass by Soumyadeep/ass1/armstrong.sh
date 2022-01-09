clear
echo "Enter a number"
read y
x=$y
z=$y
while [ $x -ne 0 ] #Digit Counting
do
  count=`expr $count + 1`
  x=`expr $x / 10`
done
echo "$count is the number of integers"
sum=0 #Armstrong Calculation
for (( i=1 ; i<=$count ; i++ ))
do
  a=`expr $z % 10`
  mul=1 #sum=`expr $sum + $[$a**$count]` line 16 to 20
  for (( j=1 ; j<=$count ; j++ ))
  do
    mul=`expr $mul \* $a`
  done
  sum=`expr $sum + $mul`
  z=`expr $z / 10`
done
if [ $y -eq $sum ]; then #Armstrong Check
  echo "Armstrong Number"
else
  echo "Not Armstrong Number"
fi
