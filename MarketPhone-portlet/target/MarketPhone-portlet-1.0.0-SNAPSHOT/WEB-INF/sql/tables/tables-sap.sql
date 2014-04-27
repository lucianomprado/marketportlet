create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME varchar null,
	BRAND varchar(75) null,
	DESCRIPTION varchar null,
	RELEASEDATE timestamp null,
	PRICE float,
	IMGURL varchar(75) null
);
