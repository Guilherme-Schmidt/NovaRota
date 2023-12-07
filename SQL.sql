create table Cliente(
	cli_id INT PRIMARY KEY, 
    cli_nome varchar(30) not null, 
    cli_cpf long, 
    cli_email varchar(30)
);

create table Funcionario(
	func_id INT primary key, 
    func_nome varchar(30) not null, 
    func_cpf long,
    func_email varchar(30),
    func_senha varchar(30)
);

create table Administrador(
	admin_id INT primary key, 
    admin_nome varchar(30) not null, 
    admin_cpf long, 
    admin_email varchar(30),
    admin_senha varchar(30)
);

create table Usuario(
	usr_nome varchar(30),
    usr_cpf long,
    usr_endereco varchar(30)
);

create table Locacao(
	locacao_id INT PRIMARY KEY,
    Placa varchar(30),
    DataLocacao INT,
    DataDevolucao INT,
    cliente_id INT,
    funcionario_id INT,
    FOREIGN KEY (cliente_id) REFERENCES Cliente(cli_id),
    FOREIGN KEY (funcionario_id) REFERENCES Funcionario(func_id)
);

create table Veiculo(
	Placa int PRIMARY KEY,
    Marca varchar(30),
    Modelo varchar(30),
    Ano int, 
    Cor varchar(30)
);



##Inserção de dados 

insert into Funcionario values(2,'Guilherme',655184561,'guilingnau.g@gmail.com','gui');
insert into Administrador values(1,'admin',12124314,'sdasdasd','admin');
insert into cliente values(1,'Guilherme',243553453534,'fgdfgdfgdfgd');

## Consulta 

select * from Funcionario;
select * from Cliente;
select * from Usuario;
select * from Administrador;

##Deletar tabelas 
drop table Funcionario;
drop table Veiculo; 
drop table Cliente;
drop table Locacao;
drop table administrador;
drop table Usuario;
