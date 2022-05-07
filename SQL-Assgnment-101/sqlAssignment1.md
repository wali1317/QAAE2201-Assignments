# SQL Assignment 101

1. PostgreSQL version 12.10 is installed in my window machine folLowing the instruction.
<br>

![PLOT](1.JPG)
 
2. I have connected my git bash terminal with DB server by adding path "C:\Program Files\PostgrepSQL\14\bin" in the 
environment variable.

- Access the server with a specific user:

psql -U postgres
Password for user postgres:

![PLOT](2.JPG)

- Executed following command from cheat sheet:

![PLOT](3.JPG)

![PLOT](4.JPG)

![PLOT](5.JPG)

![PLOT](6.JPG)

![PLOT](7.JPG)

![PLOT](8.JPG)

![PLOT](9.JPG)

![PLOT](10.JPG)

![PLOT](11.JPG)

![PLOT](12.JPG)

3. PGAdmin already installed with postgreSQL.

4. Then I have practiced some queries in pgadmin 4:

- First I have created a connection in the following ways:
  
I went to Server ---> Register ---> Server

Named as db_test local<br>
Server group: Servers

![PLOT](13.JPG)

In Connection tab followings were selected:

Hostname: localhost<br>
Port: 5432
Maintenance database: db_test
Username: postgres
Password: .....

![PLOT](14.JPG)

- Then did some queries and got following output:

![PLOT](15.JPG)

![PLOT](16.JPG)

![PLOT](17.JPG)

![PLOT](18.JPG)

![PLOT](19.JPG)

5. I have downloaded DVD rental sample Database form following link:

https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip

Then I shifted this file to /c/sampledb using git bash

cp /c/Users/My\ Pc/Downloads /c/samplebd [ Before that I created a directory "samplebd" in c drive]

Then I converted .zip file to .tar file using following command

cd /c/sampldb<br>
unzip dvdrental.zip

Then I created a new database named dvdrental:

psql -U postgres<br>
postgres=#  create database dvdrental;<br>
CREATE DATABASE<br>

postgres=#exit

Then, the sample database "dvdrental" imported by the following commands:

cd /c/Program\ Files/PostgrepSQL/12/bin<br>
pg_restore -U postgres -d dvdrental /c/sampledb/dvdrental.tar<br>
password:

Finally it can be varified from  Application -------> PostgreSQL 12 ------> pgAdmin4 ----> Servers ----> PostSQL 12 -----> Database -----> dvdrental

![PLOT](20.JPG)

6. Commands practiced from tutorial:

![PLOT](21.JPG)

![PLOT](22.JPG)

![PLOT](23.JPG)

![PLOT](24.JPG)

![PLOT](25.JPG)