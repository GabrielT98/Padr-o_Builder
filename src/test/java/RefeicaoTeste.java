package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class RefeicaoTeste {
    @Test
    void deveRetornarExcecaoParaRefeicaoSemPratoPrincipal() {
        try {
            RefeicaoBuilder refeicaoBuilder = new RefeicaoBuilder();
            Refeicao refeicao = refeicaoBuilder
                    .setAcompanhamento("Batata Frita")
                    .setSobremesa("Sorvete de Manga")
                    .setValor(25.00)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Refeição sem prato principal", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaRefeicaoSemValor() {
        try {
            RefeicaoBuilder refeicaoBuilder = new RefeicaoBuilder();
            Refeicao refeicao = refeicaoBuilder
                    .setPratoPricipal("Hamburguer de Costela")
                    .setSobremesa("Sorvete de Manga")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarRefeicaoValida() {

            RefeicaoBuilder refeicaoBuilder = new RefeicaoBuilder();
            Refeicao refeicao = refeicaoBuilder
                    .setPratoPricipal("Hamburguer de Costela")
                    .setValor(25.00)
                    .setSobremesa("Sorvete de Manga")
                    .setAcompanhamento("Batata Frita Rústica")
                    .setBebida("Fanta")
                    .build();

            assertNotNull(refeicao);
    }

}
