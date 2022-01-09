#Write a shell script to determine the Grade of students as per WBUT rule. Students name, roll no and marks are taken from an input file and output will store as student name, roll no, marks and grade format in a file.
clear
rm Grade_Card_list.txt
file1=marks.txt
echo "Roll |    Name   | Marks | Grade" >> Grade_Card_list.txt
echo "~~~~-|-~~~~~~~~~-|-~~~~~-|-~~~~~" >> Grade_Card_list.txt
if [ -f $file1 ]
then
  exec<$file1
  while read line
  do
    set `echo $line`
    echo -n " " $1 " - "$2 "-  " $3 " -  " >> Grade_Card_list.txt
    op=`expr $3 / 10`
    if [ $3 -gt -1 ]; then
      if [ $3 -gt -1 ] && [ $3 -le 50 ]; then
        echo -e 'F' >> out1
      else
        case $op in
          5) echo -e 'C' >> Grade_Card_list.txt ;;
          6) echo -e 'B' >> Grade_Card_list.txt;;
          7) echo -e 'A' >> Grade_Card_list.txt ;;
          8) echo -e 'E' >> Grade_Card_list.txt ;;
          9) echo -e 'O' >> Grade_Card_list.txt ;;
          *) echo -e 'O' >> Grade_Card_list.txt ;;
        esac
      fi
    fi
  done
fi
cat Grade_Card_list.txt
echo
