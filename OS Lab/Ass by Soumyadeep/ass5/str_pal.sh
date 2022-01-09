ispalin(){
  word=$1
  flag=0
  len=`echo $word|wc -c`
  len=`expr $len - 1`
  l=$len
  for((i=1;i<=len/2;i++)); do
    beg=`echo $word|cut -c $i`
    end=`echo $word|cut -c $l`
    if [ $beg != $end ]; then
      flag=1
      break
    fi
    l=`expr $l - 1`
  done
  if [ $flag -ne 1 ]; then
  echo $word >> $palwords
  fi
}

rm palwords.txt
f=afile.txt
palwords=palwords.txt
if [ -f $f ]; then
  exec<$f
  
  for w in $(<$f); do
    echo $w > temp.txt
    if grep -q '\.$|\;$' temp.txt; then
      count=`wc -c < temp.txt`
      count=$((count-2))
      w=`cut -c 1-$count temp.txt`
    fi
    ispalin $w
  done
  rm temp.txt
  echo file ready in palwords.txt
else  echo error in opening file.
fi
