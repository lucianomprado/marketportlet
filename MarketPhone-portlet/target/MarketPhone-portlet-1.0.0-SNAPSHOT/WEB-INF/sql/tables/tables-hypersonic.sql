create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME longvarchar null,
	BRAND varchar(75) null,
	DESCRIPTION longvarchar null,
	RELEASEDATE timestamp null,
	PRICE double,
	IMGURL varchar(75) null
);
