database sysmaster;
drop database lportal;
create database lportal WITH LOG;

create procedure 'lportal'.isnull(test_string varchar)
returning boolean;
IF test_string IS NULL THEN
	RETURN 't';
ELSE
	RETURN 'f';
END IF
end procedure;


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


create index IX_5C256366 on MARKETPHONE_PHONE (NAME);
create index IX_94926B66 on MARKETPHONE_PHONE (name);


