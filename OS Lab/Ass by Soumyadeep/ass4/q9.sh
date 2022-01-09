echo -n "Enter month in 2-digit - "
read mm
echo -n "Enter year in 4-digit - "
read yy
echo
if [ $mm -le 0 ] || [ $mm -gt 12 ]; then
  echo "Invalid Month Input"
  exit
else
  echo "$mm is a Valid Month"
fi

case $mm in
  01 | 03 | 05 | 07 | 08 | 10 | 12) days=31;;
  02) days=28;;
  04 | 06 | 09 | 11) days=30;;
  *) exit;;
esac

if [ $mm -eq 2 ]; then
  if [ `expr $yy % 400` -eq 0 ] && [ `expr $yy % 100` -eq 0 ] || [ `expr $yy % 4` -eq 0 ]; then
    echo "$yy is a LEAP YEAR"
    days=29
  else
    echo "$yy is not a LEAP YEAR !!"
  fi
fi
echo "$yy is a Valid Year"

if [ $dd -le 0 ] || [ $dd -gt $days ]; then
  echo "Invalid Day Input"
  exit
else
  echo "$dd is a Valid Day"
fi

echo "Input Valid Date is $dd / $mm / $yy"
