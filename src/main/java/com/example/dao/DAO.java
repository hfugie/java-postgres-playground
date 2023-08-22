package com.example.dao;

import java.sql.Connection;

public class DAO {
    private Connection conn;

    public DAO(Connection conn){
        this.conn = conn;
    }

    public void listar(String tabela){
        var sql = "select * from " + tabela;
        try {
            var statement = conn.createStatement(0, 0, 0)
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
