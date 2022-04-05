drop database if exists businessdb;
create database businessdb;
use businessdb;


CREATE TABLE users(
    username varchar(50) NOT NULL,
    password varchar(50) NOT NULL,
    primary key(username)
);

CREATE TABLE employees (
	id bigint NOT NULL ,
	name varchar(50) NOT NULL ,
	birth int NOT NULL ,
	sex char(10) NOT NULL ,
	education varchar(50) NOT NULL ,
	postevent varchar (50)  NOT NULL ,
	post varchar (50) NOT NULL ,

	marriage varchar (50) NOT NULL ,
	salary float NOT NULL ,
	training varchar (50) NULL ,
	welfare varchar (10) NOT NULL,
	primary key(id) 
);

insert into employees values(1,'tom',19700820,'male','本科','在职','总经理','已婚',20000,'受过MBA培训','五保一险');
insert into  employees values(2,'lily',19851012,'female','本科','在职','总经理秘书','未婚',8000,'受过财会培训','五保一险');


insert into users values('admin','admin');

