#Read a text file as an input and select the palindrome words from the text and store the palindrome words into another file (omit ‘.’ Or ‘;’ after the word).
palindrome()
{
	str=$1
	flg=0
	len=`echo $str|wc -c`
	len=`expr $len - 1`
	l=$len
	for((i=1;i<=len/2;i++))
        do
                a=`echo $str|cut -c $i`
                b=`echo $str|cut -c $l`
                if [ $a != $b ]
                then            
                    flg=1
                    break
                fi
                l=`expr $l - 1`
	  done
				if [ $flg -ne 1 ]
     		 	then
               	 echo $str>>palin.txt 
				fi
        
}
rm palin.txt
for word in $(<a.txt)
do
	echo $word>t.txt
	if grep -E '\.$|\;$' t.txt
		then
			count=`wc -c <t.txt`
			count=$(($count - 2))
	word=`cut -c 1-$count t.txt` 
	fi
	palindrome $word
done
clear
cat palin.txt
