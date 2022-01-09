flag=0
for i in `dir`
do
  if [ -f $i ]
  then
      #Command to get size of a file (NOT DIRECTORY)
      size=$(wc -c <"$i")
      
      if [ $flag -eq 0 ]; then
          max_size=$size
          min_size=$size
          max_file=$i
          min_file=$i
          flag=1
      else
          if [ $size -gt $max_size ]; then
              max_size=$size
              max_file=$i
          fi

          if [ $size -lt $min_size ]; then
              min_size=$size
              min_file=$i
          fi
       fi   
  fi
done

echo "The largest file is" $max_file "with size" $max_size
echo "The smallest file is" $min_file "with size" $min_size