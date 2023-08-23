package com.example.finaceiro.model;

import java.util.List;

public class Transacao {
    private Integer id;
    private String cliente;
    private double valor;
    private String moeda;
    private String tipo;

    public List<Transacao> todasTransacoes = new ArrayList<>();
    
}
