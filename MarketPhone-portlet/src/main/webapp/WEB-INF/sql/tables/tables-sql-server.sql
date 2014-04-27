create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME nvarchar(2000) null,
	BRAND nvarchar(75) null,
	DESCRIPTION nvarchar(2000) null,
	RELEASEDATE datetime null,
	PRICE float,
	IMGURL nvarchar(75) null
);
