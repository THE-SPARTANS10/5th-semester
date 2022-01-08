echo -n "Enter Mark of Student -> "
read m
op=`expr $m / 10`
if [ $m -gt -1 ]; then
  if [ $m -gt -1 ] && [ $m -le 50 ]; then
    echo "Grade F for $m marks"
  elif [ $m -gt 101 ]; then
    echo "Out of Bounds"
  else
    case $op in
      5) echo "Grade C for $m marks" ;;
      6) echo "Grade B for $m marks" ;;
      7) echo "Grade A for $m marks" ;;
      8) echo "Grade E for $m marks" ;;
      9) echo "Grade O for $m marks" ;;
      *) echo "Grade O for $m marks" ;;
    esac
  fi
else
  echo "Non-INT type entered or NEGATIVE INT...Try Again"
fi
