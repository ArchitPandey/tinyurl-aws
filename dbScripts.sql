mysql -h archit-mysql-rds.c7kjgssdxmwq.us-west-2.rds.amazonaws.com --ssl-ca=rds-combined-ca-bundle.pem -u admin -P 3306 -p

CREATE DATABASE tinyurl

GRANT ALL PRIVILEGES ON tinyurl.* TO 'iamUser';

