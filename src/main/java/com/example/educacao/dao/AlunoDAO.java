package com.example.educacao.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.dao.DAO;
import com.example.educacao.model.Aluno;

import javafx.fxml.LoadException;

public class AlunoDAO extends DAO {

    public AlunoDAO(Connection conn) {
        super(conn);
    }

    public void insert(Aluno aluno) throws SQLException{
        try {
            var sql = "insert into aluno (nome) values (?)";
            var statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.execute();
            var result = statement.getGeneratedKeys();
            if (result.next()){
                aluno.setMatricula(null);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirNota(int idDisciplina, double nota, int matricula){
        try{

        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
