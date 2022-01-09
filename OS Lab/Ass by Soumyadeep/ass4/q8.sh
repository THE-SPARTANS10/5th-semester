clear
echo -n "May I know your name: "
read name
echo "Date of Birth(dd/mm/yyyy)"
read dob
IFS="/"  #Seperator
set $dob  #Arranges in Conventional Form
d=$1
m=$2
y=$3
echo "Test $d $m $y"
d1=`date +%d`
m1=`date +%m`
y1=`date +%Y` #Y represents 4-digit , y represents 2-digit
echo "Today is $d1/$m1/$y1"
dd=`expr $d1 - $d`  #Difference in Present and Birth date
mm=`expr $m1 - $m`  #Difference in Present and Birth month
yy=`expr $y1 - $y`  #Difference in Present and Birth year
if [ $dd -lt 0 ]; then  #Date Negative
  mm=`expr $mm - 1`
  dd=`expr $dd + 30`  #Adjusted Date
  if [ $mm -lt 0 ]; then
    yy=`expr $yy - 1`
    mm=`expr $mm + 12` #Adjusted month
  fi
fi
echo "Hey $name your age is $yy year, $mm months , $dd days "
