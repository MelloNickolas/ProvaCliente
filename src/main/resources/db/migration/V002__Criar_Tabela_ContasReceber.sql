create table contasreceber(
    id int not null primary key auto_increment,
    valorconta decimal(12, 2),
    dataconta date,
    idcliente int not null
);