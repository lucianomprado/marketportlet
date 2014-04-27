create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME varchar(1000) null,
	BRAND varchar(75) null,
	DESCRIPTION varchar(1000) null,
	RELEASEDATE timestamp null,
	PRICE float,
	IMGURL varchar(75) null
);
