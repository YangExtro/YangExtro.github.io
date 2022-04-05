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

insert into employees values(1,'tom',19700820,'male','����','��ְ','�ܾ���','�ѻ�',20000,'�ܹ�MBA��ѵ','�屣һ��');
insert into  employees values(2,'lily',19851012,'female','����','��ְ','�ܾ�������','δ��',8000,'�ܹ��ƻ���ѵ','�屣һ��');


insert into users values('admin','admin');

