package com.example.dao;

import java.sql.Connection;

public class DAO {
    protected Connection conn;

    public DAO(Connection conn){
        this.conn = conn;
    }

    public void listar(String tabela){
        var sql = "select * from " + tabela;
        try {
            var statement = conn.createStatement();
            var result = statement.executeQuery(query);

            var metadata = result.getMetadata();
            int cols = metadata.getColumnCount();


        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
