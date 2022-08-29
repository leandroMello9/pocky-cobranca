package com.example.pockcobranca.model;


public class PosicaoAtual {
    public String valor;
    public Integer quantidade;


    public PosicaoAtual() {
    }


    public PosicaoAtual(String valor, Integer quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }
    public PosicaoAtual Builder(String valor, Integer quantidade) {
        return new PosicaoAtual(valor, quantidade);

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
