clear
echo "Enter a number"
read y
x=$y
sum=0
while [ $x -ne 0 ]
do
  rem=$(($x % 10))
  sum=$(($rem + $sum)) \* 10
  x=$(($x / 10))
done
if [ $y -eq $sum ]; then
  echo "Pallindrome Number"
else
  echo "Not Pallindrome Number"
fi
