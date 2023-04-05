alter table contasreceber add constraint FK_ID_Cliente foreign key (idcliente) references cliente(id);

insert into cliente(nomecliente) values ('Nickolas');
insert into cliente(nomecliente) values ('Victor');
insert into cliente(nomecliente) values ('Duda');
insert into cliente(nomecliente) values ('Marcela');

insert into contasreceber(valorconta, dataconta, idcliente) values ('1200', '2006-03-07', 1);
insert into contasreceber(valorconta, dataconta, idcliente) values ('1323.50', '2023-06-27', 3);
insert into contasreceber(valorconta, dataconta, idcliente) values ('1982.25', '2022-05-31', 2);
