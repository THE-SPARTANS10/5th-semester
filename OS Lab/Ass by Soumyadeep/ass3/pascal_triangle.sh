echo "Enter number of rows : "
read rows
coef=1
for((i=0;i<rows;i++))
do
  for((space=1;space<=rows-i; space++))
  do
    echo -n "  "
  done
  for((j=0;j<=i;j++))
  do
    if [ $j -eq 0 -o $i -eq 0 ]
    then
        coef=1;
    else
        coef=$((coef*(i-j+1)/j))
    fi
    echo -n $coef "   "
  done
  echo
done
