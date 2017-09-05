# Change time zone in redhat linux
run date command and check the timezone\s\s
ls -ltr /etc/localtime -> check to whihc file this symbolic link is refered to.\s\s
ln -sf /usr/share/zoneinfo/Australia/Sydney /etc/localtime\s\s\s\s
