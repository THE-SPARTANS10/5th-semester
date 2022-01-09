echo "Enter Array Size"
read n
echo "Enter Elements"
for (( z=0 ; z<$n ; z++ ))
do
  read a[z]
done
echo -n "Original Array is : "
echo -e "${a[@]}\t"
for (( i=0 ; i<$n ; i++ ))
do
  for (( j=0 ; j<`expr $n - $i - 1` ; j++ ))
  do
    if [ ${a[j]} -gt ${a[j+1]} ]; then
      temp=${a[j]}
      a[j]=${a[j+1]}
      a[j+1]=$temp
    fi
  done
done
echo -n "Sorted Array is : "
for (( z=0 ; z<$n ; z++ ))
do
  echo -n "${a[z]} "
done
echo
