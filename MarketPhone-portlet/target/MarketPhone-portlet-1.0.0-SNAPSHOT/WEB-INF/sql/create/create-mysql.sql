drop database if exists lportal;
create database lportal character set utf8;
use lportal;

create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME longtext null,
	BRAND varchar(75) null,
	DESCRIPTION longtext null,
	RELEASEDATE datetime null,
	PRICE double,
	IMGURL varchar(75) null
) engine InnoDB;


create index IX_5C256366 on MARKETPHONE_PHONE (NAME);
create index IX_94926B66 on MARKETPHONE_PHONE (name);


