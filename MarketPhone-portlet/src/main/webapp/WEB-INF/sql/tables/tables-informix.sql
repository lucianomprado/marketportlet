create table MARKETPHONE_PHONE (
	IDPHONE int8 not null primary key,
	NAME lvarchar,
	BRAND varchar(75),
	DESCRIPTION lvarchar,
	RELEASEDATE datetime YEAR TO FRACTION,
	PRICE float,
	IMGURL varchar(75)
)
extent size 16 next size 16
lock mode row;
