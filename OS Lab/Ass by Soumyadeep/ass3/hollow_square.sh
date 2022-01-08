echo "Enter the size of the rectangle "
read size
clear
for (( i=1; i <= size; i++ )); do
for (( j=1; j <= size; j++ )); do
if [ "$i" == 1 ] || [ "$i" == "$size" ] || [ "$j" == 1 ] || [ "$j" == "$size" ]
then
	tput cup $i $j
	echo "*"
fi
done 
done

