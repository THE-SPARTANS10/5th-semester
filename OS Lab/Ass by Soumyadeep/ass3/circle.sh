clear
echo "Enter the RADIUS of Circle -- "
read r
tput clear #Origin taken is TOP LEFT CORNER of console.So, +ive X-Axis, -ive Y-Axis..Implemented in LINE-11,12
for((i=1;i<=360;i+=5))
do
  a=`echo "scale=3;3.14/180*$i"|bc|awk '{print cos($1)}'` #Radian calculation 3.14/180*$i  awk coverts fractional degree to integer value
  x=`echo "scale=3;$r*$a"|bc|awk '{print int($1)}'`
  b=`echo "scale=3;3.14/180*$i"|bc|awk '{print sin($1)}'`
  y=`echo "scale=3;$r*$b"|bc|awk '{print int($1)}'`
  p=`expr 40 + $x` #Apprx center X-Axis is 80 units
  q=`expr 12 - $y` #Apprx center X-Axis is 25 units
  tput cup $q $p
  echo "*"
done
tput cup $(tput lines) 0 #Moves the pointer to the bottom line
