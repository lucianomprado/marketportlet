create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME varchar(4000),
	BRAND varchar(75),
	DESCRIPTION varchar(4000),
	RELEASEDATE timestamp,
	PRICE double,
	IMGURL varchar(75)
);
