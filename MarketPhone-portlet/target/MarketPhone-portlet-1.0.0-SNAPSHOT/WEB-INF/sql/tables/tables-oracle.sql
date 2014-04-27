create table MARKETPHONE_PHONE (
	IDPHONE number(30,0) not null primary key,
	NAME varchar2(4000) null,
	BRAND VARCHAR2(75 CHAR) null,
	DESCRIPTION varchar2(4000) null,
	RELEASEDATE timestamp null,
	PRICE number(30,20),
	IMGURL VARCHAR2(75 CHAR) null
);
