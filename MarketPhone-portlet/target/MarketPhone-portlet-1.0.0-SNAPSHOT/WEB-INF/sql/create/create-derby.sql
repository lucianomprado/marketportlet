drop database lportal;
create database lportal;
connect to lportal;
create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME varchar(4000),
	BRAND varchar(75),
	DESCRIPTION varchar(4000),
	RELEASEDATE timestamp,
	PRICE double,
	IMGURL varchar(75)
);


create index IX_5C256366 on MARKETPHONE_PHONE (NAME);
create index IX_94926B66 on MARKETPHONE_PHONE (name);


