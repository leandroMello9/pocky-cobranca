package com.example.pockcobranca.model;

import java.time.LocalDate;


public class Vencidos {
    public LocalDate data_final;
    public String valor;
    public Integer quantidade;

    public Vencidos() {
    }

    public Vencidos(LocalDate data_final, String valor, Integer quantidade) {
        this.data_final = data_final;
        this.valor = valor;
        this.quantidade = quantidade;
    }

  
    public Vencidos Builder(LocalDate data_final, String valor, Integer quantidade) {
        return new Vencidos(data_final, valor, quantidade);
    }
 
    public LocalDate getData_final() {
        return this.data_final;
    }

    public void setData_final(LocalDate data_final) {
        this.data_final = data_final;
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

  
