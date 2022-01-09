clear
rm Weather.txt
file1=input_weather.txt
echo "DAY-|-TEMP-|-WTR" >> Weather.txt
echo "~~~~|~~~~~~|~~~~" >> Weather.txt
if [ -f $file1 ]
then
  exec<$file1
  while read line
  do
    set `echo $line`
    echo -n $1 "| " $2 " | " >> Weather.txt
    if [ $2 -lt 15 ]
    then 
      echo Very Cold >> Weather.txt
    elif [ $2 -lt 25 ]
    then 
      echo Cold >> Weather.txt
    elif [ $2 -lt 35 ]
    then 
      echo Hot >> Weather.txt
    else 
      echo Very Hot >> Weather.txt
    fi
  done
fi
cat Weather.txt
