package com.example.pockcobranca.model;

import java.time.LocalDate;
import java.util.List;


public class Posicao {
    public LocalDate data_posicao;
    public Liquidacao liquidacoes;
    public PosicaoAtual posicao_atual;
    public List<ConsolidadoVencer> consolidado_vencer;
    public Vencidos vencidos;
    public Posicao(){
    }
 
    public Posicao(LocalDate data_posicao, Liquidacao liquidacoes, PosicaoAtual posicao_atual, List<ConsolidadoVencer> consolidado_vencer, Vencidos vencidos) {
        this.data_posicao = data_posicao;
        this.liquidacoes = liquidacoes;
        this.posicao_atual = posicao_atual;
        this.consolidado_vencer = consolidado_vencer;
        this.vencidos = vencidos;
    }

    public Posicao Builder(LocalDate data_posicao, Liquidacao liquidacoes, PosicaoAtual posicao_atual, List<ConsolidadoVencer> consolidado_vencer, Vencidos vencidos) {
        return new Posicao(data_posicao,  liquidacoes,  posicao_atual,  consolidado_vencer,  vencidos);
    }
   
    public LocalDate getData_posicao() {
        return this.data_posicao;
    }

    public void setData_posicao(LocalDate data_posicao) {
        this.data_posicao = data_posicao;
    }

    public Liquidacao getLiquidacoes() {
        return this.liquidacoes;
    }

    public void setLiquidacoes(Liquidacao liquidacoes) {
        this.liquidacoes = liquidacoes;
    }

    public PosicaoAtual getPosicao_atual() {
        return this.posicao_atual;
    }

    public void setPosicao_atual(PosicaoAtual posicao_atual) {
        this.posicao_atual = posicao_atual;
    }

    public List<ConsolidadoVencer> getConsolidado_vencer() {
        return this.consolidado_vencer;
    }

    public void setConsolidado_vencer(List<ConsolidadoVencer> consolidado_vencer) {
        this.consolidado_vencer = consolidado_vencer;
    }

    public Vencidos getVencidos() {
        return this.vencidos;
    }

    public void setVencidos(Vencidos vencidos) {
        this.vencidos = vencidos;
    }


}
