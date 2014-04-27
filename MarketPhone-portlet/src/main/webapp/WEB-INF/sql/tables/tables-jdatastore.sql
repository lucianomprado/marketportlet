create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME long varchar null,
	BRAND varchar(75) null,
	DESCRIPTION long varchar null,
	RELEASEDATE date null,
	PRICE double,
	IMGURL varchar(75) null
);
