DROP DATABASE IF EXISTS clinica;

CREATE DATABASE clinica;
USE clinica;

CREATE TABLE ambulatorio (
  nroa int PRIMARY KEY AUTO_INCREMENT,
  andar int NOT NULL,
  capacidade smallint
);

CREATE TABLE medicos(
  codm int PRIMARY KEY AUTO_INCREMENT
  ,nome varchar(40) NOT NULL
  ,idade smallint NOT NULL
  ,especialidade char(20)
  ,cpf varchar(11) UNIQUE
  ,cidade varchar(30) 
  ,nroa int

  ,FOREIGN KEY (nroa) REFERENCES ambulatorio(nroa)
);

CREATE TABLE pacientes (
  codp int PRIMARY KEY AUTO_INCREMENT
  ,nome varchar(40) NOT NULL
  ,idade smallint NOT NULL
  ,cidade varchar(30)
  ,cpf varchar(11) UNIQUE
  ,doenca varchar(40) NOT NULL
);

CREATE TABLE funcionarios (
  codf int PRIMARY KEY AUTO_INCREMENT
  ,nome varchar(40) NOT NULL
  ,idade smallint
  ,cpf varchar(11) UNIQUE
  ,cidade varchar(30) 
  ,salario numeric(10,2)
  ,nroa varchar(20)
);

CREATE TABLE consultas (
  num_consulta INT PRIMARY KEY AUTO_INCREMENT
  ,codm INT
  ,codp INT
  ,data DATE
  ,hora TIME

  ,FOREIGN KEY (codm) REFERENCES medicos(codm)
  ,FOREIGN KEY (codp) REFERENCES pacientes(codp)
)