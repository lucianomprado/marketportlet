create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME text null,
	BRAND varchar(75) null,
	DESCRIPTION text null,
	RELEASEDATE timestamp null,
	PRICE double precision,
	IMGURL varchar(75) null
);
