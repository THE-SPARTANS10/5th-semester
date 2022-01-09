clear
TODAY=$(date +"%Y-%m-%d")
echo "May I know your name"
read name
echo "Your birthdate(yyyy-mm-dd)"
read birthdate
tmpDays=$( printf '%s' $(( $(date -u -d"$TODAY" +%s) - $(date -u -d"$birthdate" +%s)))  )
age=$(( $tmpDays / 60 / 60 / 24 / 364 ))
echo Hey $name you are $age years old.
