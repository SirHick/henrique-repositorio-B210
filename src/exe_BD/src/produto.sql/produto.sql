
create table produtos(
	
	id int auto_increment primary key,
    nome varchar(100),
    preco double not null,
    quantidade int not null
);