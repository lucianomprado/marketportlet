create table MARKETPHONE_PHONE (
	IDPHONE decimal(20,0) not null primary key,
	NAME varchar(1000) null,
	BRAND varchar(75) null,
	DESCRIPTION varchar(1000) null,
	RELEASEDATE datetime null,
	PRICE float,
	IMGURL varchar(75) null
)
go
