package com.example.pockcobranca.model.builder;

public class ResumidaBuilder {
    public PosicaoBuilder resumida_cobranca;


    public ResumidaBuilder() {
    }

    public ResumidaBuilder(PosicaoBuilder resumida_cobranca) {
        this.resumida_cobranca = resumida_cobranca;
    }


    public ResumidaBuilder Builder(PosicaoBuilder resumida_cobranca) {
        return new ResumidaBuilder(resumida_cobranca);
    }

}
