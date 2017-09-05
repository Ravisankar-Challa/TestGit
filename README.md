# Change time zone in redhat linux
run date command and check the timezone
ls -ltr /etc/localtime -> check to whihc file this symbolic link is refered to.
ln -sf /usr/share/zoneinfo/Australia/Sydney /etc/localtime
