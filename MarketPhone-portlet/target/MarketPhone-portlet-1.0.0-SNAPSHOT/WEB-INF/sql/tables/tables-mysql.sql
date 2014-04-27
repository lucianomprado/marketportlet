create table MARKETPHONE_PHONE (
	IDPHONE bigint not null primary key,
	NAME longtext null,
	BRAND varchar(75) null,
	DESCRIPTION longtext null,
	RELEASEDATE datetime null,
	PRICE double,
	IMGURL varchar(75) null
) engine InnoDB;
