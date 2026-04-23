create database db_java;
use db_java;

create table pessoa(
	id int auto_increment primary key,
    nome varchar(100) not null,
    idade int not null
    cpf varchar(20) not null
);

select * from pessoa;