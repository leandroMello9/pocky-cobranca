package com.example.pockcobranca.model;

import java.time.LocalDate;

public class ConsolidadoVencer {
    public LocalDate data_inicial;
    public LocalDate data_final;
    public String valor;
    public Integer quantidade;


    public ConsolidadoVencer() {
    }

    public ConsolidadoVencer(LocalDate data_inicial, LocalDate data_final, String valor, Integer quantidade) {
        this.data_inicial = data_inicial;
        this.data_final = data_final;
        this.valor = valor;
        this.quantidade = quantidade;
    }


  public ConsolidadoVencer Builder(LocalDate data_inicial, LocalDate data_final, String valor, Integer quantidade) {
    return new ConsolidadoVencer(data_final, data_final, valor, quantidade);

  }

    public LocalDate getData_inicial() {
        return this.data_inicial;
    }

    public void setData_inicial(LocalDate data_inicial) {
        this.data_inicial = data_inicial;
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
