use master
exec sp_dboption 'lportal', 'allow nulls by default' , true
go

exec sp_dboption 'lportal', 'select into/bulkcopy/pllsort' , true
go

use lportal

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




