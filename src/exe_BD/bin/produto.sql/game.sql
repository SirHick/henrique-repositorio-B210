create table games(
	
	id int auto_increment primary key,
    titulo varchar(100) not null,
    plataforma varchar (50) not null, 
    genero varchar (50) not null,
    anoLancamento int not null,
    precoAluguel double not null
);