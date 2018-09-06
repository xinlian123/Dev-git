#!/bin/bash

while read f1 f2 f3
do

	
	ExpireDate=$(date -d "$f2 " '+%s')

	if [ "$(((ExpireDate - $(date +%s))/86400))" -le 1000 ]; then

		echo -e "Subject:Certificate Alert \n\n The $f1 certificate is expiring in $(((ExpireDate - $(date +%s))/86400)) days. Please find the cert path at $f3\n" | /usr/sbin/sendmail -f Idmadmin@creditacceptance.com -t idmadmin@creditacceptance.com
	fi


done < /proj/app/certificateInfo.txt