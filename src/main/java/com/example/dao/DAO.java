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
            var result = statement.executeQuery(sql);

            var metadata = result.getMetaData();
            int cols = metadata.getColumnCount();

            for (int i = 1; i <= cols; i++){
                System.out.printf("%-25s |", metadata.getColumnName(i));
            }
            System.out.println();

            while(result.next()){
                for (int i = 1; i <= cols; i++){
                    System.out.printf("%-s25s | ", result.getString(i));
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.err.println("Erro na execução da consulta: " + e.getMessage());
        }
    }
}