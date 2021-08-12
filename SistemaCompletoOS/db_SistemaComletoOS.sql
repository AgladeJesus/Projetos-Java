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

create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
endcli varchar(100),
fonecli varchar(50) not null,
emailcli varchar(50)
);

describe tbclientes;

insert into tbclientes(nomecli,endcli,fonecli,emailcli)
values('Linus Torvalds','Rua Tux, 2015','9999-9999','linus@linus.com');

insert into tbclientes(nomecli,endcli,fonecli,emailcli)
values('Lohanny Marcelly','Rua S6, 46','99256-5325','lohanny@gmail.com');

insert into tbclientes(nomecli,endcli,fonecli,emailcli)
values('Arthur Fernando','Rua S6, 46','99280-5350','arthur@gmail.com');

select * from tbclientes;

create table tbos(
os int primary key auto_increment,
data_os timestamp default current_timestamp,
equipamento varchar(150) not null,
defeito varchar(150) not null,
servico varchar(150),
tecnico varchar(30),
valor decimal(10,2),
idcli int not null,
foreign key(idcli) references tbclientes(idcli)
);

select * from tbclientes;

describe tbos;
select * from tbos;

insert into tbos(equipamento,defeito,servico,tecnico,valor,idcli)
values('Notebook','Não Liga','Troca da fonte','Zé','87.50',1);

insert into tbos(equipamento,defeito,servico,tecnico,valor,idcli)
values('Notebook Acer','Tela quebrada','Troca da tela','Adriano','245.85',1);

insert into tbos(equipamento,defeito,servico,tecnico,valor,idcli)
values('Notebook Samsung','Lentidão','Formartação do Sistema operacional','Leandro','300.00',1);

insert into tbos(equipamento,defeito,servico,tecnico,valor,idcli)
values('Notebook Dell','Lentidão','Formartação do Sistema operacional','Leandro','300.00',2);

insert into tbos(equipamento,defeito,servico,tecnico,valor,idcli)
values('Notebook Asus','Tela trincada','Troca da tela','leandro','300.00',3);

insert into tbos(equipamento,defeito,servico,tecnico,valor,idcli)
values('Notebook Dell','Não Liga','Reparo da fonte','Leandro','100.00',3);

select
O.os,data_os,equipamento,defeito,servico, valor,tecnico,
C.nomecli,fonecli
from tbos as O
inner join tbclientes as C
on (O.idcli = C.idcli);

update tbos set tecnico='Leandro' where os=9;


