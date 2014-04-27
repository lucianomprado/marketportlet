create database 'lportal.gdb' page_size 8192 user 'sysdba' password 'masterkey';
connect 'lportal.gdb' user 'sysdba' password 'masterkey';
create table MARKETPHONE_PHONE (IDPHONE int64 not null primary key,NAME varchar(4000),BRAND varchar(75),DESCRIPTION varchar(4000),RELEASEDATE timestamp,PRICE double precision,IMGURL varchar(75));
