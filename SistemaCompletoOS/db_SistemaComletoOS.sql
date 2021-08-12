create database dbinfox;
use dbinfox;
create table tbusuarios(
iduser int primary key,
usuario varchar(50) not null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null
);

describe tbusuarios;

insert into tbusuarios(iduser,usuario,fone,login,senha)
values(1,'José de Assis','9999-9999','joseassis','123456');

select * from tbusuarios;

insert into tbusuarios(iduser,usuario,fone,login,senha)
values(2,'Administrador','9999-9998','admin','admin');
insert into tbusuarios(iduser,usuario,fone,login,senha)
values(3,'Bill Gates','9999-9997','bill','123456');

update tbusuarios set fone='8888-8888' where iduser=2;

delete from tbusuarios where iduser=3;

