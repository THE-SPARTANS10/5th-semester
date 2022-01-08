#f(x,n)=1+x2/2!+x4/4!+….+x2*n/(2*n)!
fact()
{ 
  y=$1
  pro=1
  for(( i=1 ; i<=$y ; i++ ))
   do
    pro=`expr $pro \* $i`
   done
  echo $pro 
}

series()
{ 
 x=$1
 n=$2
 sum=1
 for (( i=1 ; i<$n ; i++ ))
  do
   par=`expr 2 \* $i `
   fin=`fact $par`
   sum=`echo "scale = 3; ( $sum + ( $x ^ $par / $fin ) )" | bc`
   
  done
 echo $sum
}

echo "Enter the value of x and n:"
echo -n "x: "
read x
echo -n "n: "
read n
z=`series $x $n`
echo "Sum is= $z "

