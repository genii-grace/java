create table 대리점
(지점명 varchar(5) primary key,
도시 varchar(2),
전화번호 varchar(10),
종업원수 int,
자본금 int,
지점개설일 date);

create table 사업주
(사업주번호 int,
사업주명 varchar(5),
지점명 varchar(5));

create table telTBL (
name varchar(5) primary key,
tel varchar(3),
addr varchar(4)
);