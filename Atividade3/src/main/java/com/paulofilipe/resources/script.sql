-- Verificar se o banco de dados existe
CREATE DATABASE IF NOT EXISTS library;

-- Selecionar o banco de dados
USE library;

-- Verificar se a tabela existe
CREATE TABLE IF NOT EXISTS book (
    ID bigint PRIMARY KEY AUTO_INCREMENT,
    title varchar(150) NOT NULL,
    authors varchar(250) NOT NULL,
    acquisition DATE NOT NULL,
    pages SMALLINT,
    year SMALLINT NOT NULL,
    edition TINYINT,
    price DECIMAL(10,2)
);

-- Descrever a tabela
DESC book;