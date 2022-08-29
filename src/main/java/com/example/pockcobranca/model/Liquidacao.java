package com.example.pockcobranca.model;


public class Liquidacao {
    public String valor;
    public Integer quantidade;

    public Liquidacao() {
    }

    public Liquidacao(String valor, Integer quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Liquidacao Builder(String valor, Integer quantidade) {
        return new Liquidacao(valor, quantidade);
    }


    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
