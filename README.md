# Java-e-JDBC-Trabalhando-com-um-banco-de-dados
Curso-Alura Link do Curso na Alura - Java e JDBC: Trabalhando com um banco de dados = https://cursos.alura.com.br/course/jdbc-dao-persistencia


#Ferramentas utilizadas:

c3p0
  É uma biblioteca “easy-to-use” usada para fornecer a capacidade de pooling de conexões. Vide seção Links para referências oficiais do projeto/C3PO é uma implementação Java de um pool de conexão Versão: c3p0-0.9.5.4

mysql connector O JDBC (Java Database Connectivity)
  Descreve uma lista de métodos SQL que um programador Java pode usar para acessar um banco de dados relacional. Versão: mysql-connector-java-8.0.17

mchange-commons
  Ela vai explicar que o C3P0, ele é uma library, é um JAR que faz o que os drivers JDBC, hoje eles fazem. Versão: mchange-commons-java-0.2.16

#Comandos no banco de dados

CREATE DATABASE loja_virtual;

USE loja_virtual;

CREATE TABLE PRODUTO(
ID INT AUTO_INCREMENT,
NOME VARCHAR(50) NOT NULL,
DESCRICAO VARCHAR(255),
PRIMARY KEY(ID)) Engine = InnoDB;

INSERT INTO PRODUTO (nome, descricao) VALUES ('notebook', 'notebook samsung');
INSERT INTO PRODUTO (nome, descricao) VALUES ('geladeira', 'geladeira azul');


CREATE TABLE CATEGORIA (
ID INT AUTO_INCREMENT,
NOME VARCHAR(50) NOT NULL,
PRIMARY KEY(ID))
Engine = InnoDB;

INSERT INTO CATEGORIA (NOME) VALUES ('ELETRONICOS');
INSERT INTO CATEGORIA (NOME) VALUES ('ELETRODOMESTICOS');
INSERT INTO CATEGORIA (NOME) VALUES ('MOVEIS');


ALTER TABLE PRODUTO ADD COLUMN CATEGORIA_ID INT;


ALTER TABLE PRODUTO ADD FOREIGN KEY (CATEGORIA_ID) REFERENCES CATEGORIA(ID);


UPDATE PRODUTO SET CATEGORIA_ID = 1 WHERE ID = 1;
UPDATE PRODUTO SET CATEGORIA_ID = 2 WHERE ID = 2;
UPDATE PRODUTO SET CATEGORIA_ID = 3 WHERE ID = 20;
