drop database lportal;
create database lportal;

go

use lportal;

create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME nvarchar(2000) null,
	BRAND nvarchar(75) null,
	DESCRIPTION nvarchar(2000) null,
	RELEASEDATE datetime null,
	PRICE float,
	IMGURL nvarchar(75) null
);


create index IX_5C256366 on MARKETPHONE_PHONE (NAME);
create index IX_94926B66 on MARKETPHONE_PHONE (name);


