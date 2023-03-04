/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  kcalixto
 * Created: Oct 20, 2022
 */

CREATE SCHEMA IF NOT EXISTS lojainformatica;

USE lojainformatica;

CREATE TABLE IF NOT EXISTS computadores(
    id int auto_increment not null primary key,
    marca varchar(45),
    hd varchar(45),
    processador varchar(45)
);