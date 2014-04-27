drop user &1 cascade;
create user &1 identified by &2;
grant connect,resource to &1;
connect &1/&2;
set define off;

create table MARKETPHONE_PHONE (
	IDPHONE number(30,0) not null primary key,
	NAME varchar2(4000) null,
	BRAND VARCHAR2(75 CHAR) null,
	DESCRIPTION varchar2(4000) null,
	RELEASEDATE timestamp null,
	PRICE number(30,20),
	IMGURL VARCHAR2(75 CHAR) null
);


create index IX_5C256366 on MARKETPHONE_PHONE (NAME);
create index IX_94926B66 on MARKETPHONE_PHONE (name);



quit