CREATE SCHEMA IF NOT EXISTS `db_acervo`;
USE `db_acervo`;

/*user*/

DROP TABLE IF EXISTS `tb_associado`;

CREATE TABLE `tb_associado` (
  `id` INT AUTO_INCREMENT NOT NULL,
  `name` VARCHAR(255),
  `endereco` VARCHAR(255),
  PRIMARY KEY(`id`)
);

/*author*/

DROP TABLE IF EXISTS `tb_autor`;

CREATE TABLE `tb_autor` (
  `id` INT AUTO_INCREMENT NOT NULL,
  `name` VARCHAR(255),
  `residencia` VARCHAR(255),
  `data_nascimento` DATETIME,
  PRIMARY KEY(`id`)
);

/*book*/

DROP TABLE IF EXISTS `tb_livro`;

CREATE TABLE `tb_livro` (
  `id` INT AUTO_INCREMENT NOT NULL,
  `id_autor` INT,
  `titulo` VARCHAR(255),
  `id_editora` INT,
  `local_de_edicao` VARCHAR(255),
  `ISBN` INT,
  PRIMARY KEY(`id`)
);

/*book-example*/

DROP TABLE IF EXISTS `tb_exemplar`;

CREATE TABLE `tb_exemplar` (
  `id` INT AUTO_INCREMENT NOT NULL,
  `id_livro_original` INT,
  PRIMARY KEY(`id`)
);

/*key-words*/

DROP TABLE IF EXISTS `tb_palavras_chave`;

CREATE TABLE `tb_palavras_chave` (
  `id` INT AUTO_INCREMENT NOT NULL,
  `id_livro` INT,
  `palavra` VARCHAR(255),
  PRIMARY KEY(`id`)
);

/*editor*/

DROP TABLE IF EXISTS `tb_editora`;

CREATE TABLE `tb_editora` (
  `id` INT AUTO_INCREMENT NOT NULL,
  `name` VARCHAR(255),
  `book_amount` INT,
  PRIMARY KEY(`id`)
);

/*user debits*/

DROP TABLE IF EXISTS `tb_associado_emprestimos`;

CREATE TABLE `tb_associado_emprestimos` (
  `id` INT AUTO_INCREMENT NOT NULL,
  `id_livro` INT,
  `id_associado` INT,
  `date` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `active` boolean,
  PRIMARY KEY(`id`)
);

ALTER TABLE
  `tb_editora`
ADD CONSTRAINT `livro_editora` 
  FOREIGN KEY (`id`) REFERENCES `tb_livro` (`id_editora`);

ALTER TABLE
  `tb_livro`
ADD
  FOREIGN KEY (`id`) REFERENCES `tb_palavras_chave` (`id_livro`);

ALTER TABLE
  `tb_associado_emprestimos`
ADD
  FOREIGN KEY (`id_associado`) REFERENCES `tb_associado` (`id`);

ALTER TABLE
  `tb_associado_emprestimos`
ADD
  FOREIGN KEY (`id_livro`) REFERENCES `tb_livro` (`id`);

ALTER TABLE
  `tb_livro`
ADD
  FOREIGN KEY (`id_autor`) REFERENCES `tb_autor` (`id`);

ALTER TABLE
  `tb_livro`
ADD
  FOREIGN KEY (`id`) REFERENCES `tb_exemplar` (`id_livro_original`);