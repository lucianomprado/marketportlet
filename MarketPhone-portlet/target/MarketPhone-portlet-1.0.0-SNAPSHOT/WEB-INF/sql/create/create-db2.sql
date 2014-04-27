drop database lportal;
create database lportal pagesize 8192;
connect to lportal;
create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME varchar(750),
	BRAND varchar(75),
	DESCRIPTION varchar(750),
	RELEASEDATE timestamp,
	PRICE double,
	IMGURL varchar(75)
);


create index IX_5C256366 on MARKETPHONE_PHONE (NAME);
create index IX_94926B66 on MARKETPHONE_PHONE (name);


