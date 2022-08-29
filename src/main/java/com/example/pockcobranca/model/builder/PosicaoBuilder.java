package com.example.pockcobranca.model.builder;


import com.example.pockcobranca.model.Posicao;

public class PosicaoBuilder {

    public Posicao posicao;

    public PosicaoBuilder() {
    }

    public PosicaoBuilder(Posicao posicao) {
        this.posicao = posicao;
    }
    
    public PosicaoBuilder build(Posicao posicao) {
        return new PosicaoBuilder(posicao);
    }

    public Posicao getPosicao() {
        return this.posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
   

  

}