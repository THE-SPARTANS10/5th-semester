clear
while [ 1 ]
do
  echo
  read -p"-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
  a) Contents of the file
  b) List of users who currently logged in
  c) Present working directory & files under current directory
  d) List of files
  e) Process of users
  f) Today’s date
  g) Display the calendar of any year
  h) Exit

Enter your option: " x
echo "
"
case $x in
  a) echo "The content of the file is:"
     cat menudriven.sh;;
  b) echo "The list of users are: $(whoami)";;
  c) echo -n "The present working directory is: $(pwd)
     The files in it are: $(ls)";;
  d) echo "The files in it are: $(ls)";;
  e) echo "The processes are: $(pstree)";;
  f) echo "Today's date is $(date)";;
  g) echo "Calender: "
     y=`date +%Y`
     cal $y;;
  *) echo "Ok Bye !!" 
     exit
esac
done
