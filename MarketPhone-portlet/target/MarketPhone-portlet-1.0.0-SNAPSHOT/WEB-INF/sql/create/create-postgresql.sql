drop database lportal;
create database lportal encoding = 'UNICODE';
\c lportal;

create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME text null,
	BRAND varchar(75) null,
	DESCRIPTION text null,
	RELEASEDATE timestamp null,
	PRICE double precision,
	IMGURL varchar(75) null
);


create index IX_5C256366 on MARKETPHONE_PHONE (NAME);
create index IX_94926B66 on MARKETPHONE_PHONE (name);


