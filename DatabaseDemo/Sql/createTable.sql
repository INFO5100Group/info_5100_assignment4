use "databseDemo";

drop table Demo.Account;
drop table Demo.Admin;
drop table Demo.[User];
drop table Demo.ObjectKey;


create table Demo.ObjectKey
(
	UID int not null primary key,
	ObjectType varchar(20) not null
);

create table Demo.Account
(	
	UID int not null primary key
		references Demo.ObjectKey(UID),
	AccountName varchar(10) not null,
	Password varchar(20) not null,
	AccountType varchar(10) not null
);

create table Demo.Admin
(	
	UID int not null primary key
		references Demo.ObjectKey(UID),
	AccountID int not null
		References Demo.Account(UID)
);

Create table Demo.[User]
(
	UID int not null primary key
		references Demo.ObjectKey(UID),
	AccountID int not null 
		references Demo.Account(UID),
	FirstName varchar(40) not null,
	LastName varchar(40) not null
);
