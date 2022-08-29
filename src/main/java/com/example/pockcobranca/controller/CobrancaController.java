package com.example.pockcobranca.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.pockcobranca.facade.DefaultResponse;
import com.example.pockcobranca.model.ConsolidadoVencer;
import com.example.pockcobranca.model.Liquidacao;
import com.example.pockcobranca.model.Posicao;
import com.example.pockcobranca.model.PosicaoAtual;
import com.example.pockcobranca.model.Vencidos;
import com.example.pockcobranca.model.builder.PosicaoBuilder;
import com.example.pockcobranca.model.builder.ResumidaBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CobrancaController {
    
    @GetMapping("/cobranca")
    public DefaultResponse getExampleCobrancaResumida() throws Exception {
        Liquidacao liquidacao = new Liquidacao().Builder("12.2", 1500);
      
        Vencidos vencidos = new Vencidos().Builder(LocalDate.now(), "123,14", 1600);

        PosicaoAtual posicaoAtual = new PosicaoAtual().Builder("123.45", 300);

        List<ConsolidadoVencer> consolidadoVencer = new ArrayList<ConsolidadoVencer>();

        ConsolidadoVencer consolidadoVencer1 = new ConsolidadoVencer().Builder(LocalDate.now(), LocalDate.now(), "157.88", 23); 

        consolidadoVencer.add(consolidadoVencer1);

        Posicao posicao = new Posicao().Builder(LocalDate.now(),liquidacao, posicaoAtual, consolidadoVencer, vencidos);

        PosicaoBuilder posicaoBuilder = new PosicaoBuilder().build(posicao);
         
         return DefaultResponse.of(new ResumidaBuilder().Builder(posicaoBuilder));
       
    }
    
    
}
