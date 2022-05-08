create database dbblog;
use dbblog;

create table usuario(
id int auto_increment,
nome varchar(50),
login varchar(20),
senha varchar(20),
primary key(id)
);

create table post(
id int auto_increment primary key,
titulo varchar(100),
conteudo varchar(300),
datpost date,
id_usuario int,
foreign key (id_usuario) references usuario(id)
);

create table comentario(
id int auto_incremnet primary key,
descricao varchar (300),
id_post int,
id_usuario int,
datpost date,
foreign key (id_post) references post(id),
foreign key (id_usuario) references usuario(id)
);

create table comentario(
id int auto_incremnet primary key,
descricao varchar (300),
id_post int,
id_usuario int,
datpost date,
foreign key (id_post) references post(id),
foreign key (id_usuario) references usuario(id)
);

insert usuario(nome, login, senha) values ('maria','m@m','a123');
select * from usuario;

insert post(titulo, conteudo, datpost, usuario)
values ('Em quem você votará na próxima eleição?', null,'2022-04-27',1)
select * from post;

insert into comentario(descricao, id_post, id_usuario, datpost)
values ('Eu votarei no macado tião.', 1, 1, '2022-04-27');
select * from comentario;


