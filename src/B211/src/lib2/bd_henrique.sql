create database db_java;

use db_java;

create table pessoas(
	id int auto_increment primary key,
    nome varchar(100) not null,
    idade int not null
); 