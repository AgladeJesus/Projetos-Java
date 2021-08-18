use dbaula4;
create table `curso`(
	`Sigla` CHAR(10),
    `Nome` VARCHAR(64),
    `Descricao` VARCHAR(256)
);

drop table cruso;
describe curso;
select * from curso;
drop table curso;



insert into curso(Sigla,Nome,Descricao)
values("AJ","Alexandre","de Jesus Miranda");