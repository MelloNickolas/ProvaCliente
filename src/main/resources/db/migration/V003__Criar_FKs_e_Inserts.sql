alter table contasreceber add constraint FK_ID_Cliente foreign key (idcliente) references cliente(id);

insert into cliente(nomecliente) values ('Nickolas');
insert into cliente(nomecliente) values ('Victor');
insert into cliente(nomecliente) values ('Duda');
insert into cliente(nomecliente) values ('Marcela');
