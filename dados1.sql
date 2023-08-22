drop table if exists aluno;

CREATE TABLE aluno (
    matricula serial NOT NULL PRIMARY KEY,
    nome varchar(120) NOT NULL,
    nota1 DECIMAL(10,2),
    nota2 DECIMAL(10,2),
    nota3 DECIMAL(10,2)
);