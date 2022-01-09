if [ $# -eq 0 ]; then
	echo "No arguments specified"
	exit
fi
for i in $*
do
	if [ -f $i ]; then
		echo "$i is  a file"
		echo "Lines: $(cat $i | wc -l)"
		echo "Words: $(cat $i | wc -w)"
		echo "Chars: $(cat $i | wc -c)"

		if [ ! -w $i ]; then
			chmod "g+w" $i
			chmod "o+w" $i
		elif [ ! -x $i ]; then
			chmod "g+x" $i
			chmod "o+x" $i
		else
			ls -l $i | cut -d ' ' -f1
		fi
	else
		echo "$i is a directory"
    echo "Files under $i: "
    a=`dir $i `
    echo $a
	fi
done
#bash file_dir.sh test hello.txt.
