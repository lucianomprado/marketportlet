create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME varchar(750),
	BRAND varchar(75),
	DESCRIPTION varchar(750),
	RELEASEDATE timestamp,
	PRICE double,
	IMGURL varchar(75)
);
