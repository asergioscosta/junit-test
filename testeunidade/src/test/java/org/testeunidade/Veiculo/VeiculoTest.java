package org.testeunidade.Veiculo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveRetornarClasseCarroVintage() {
        Veiculo veiculo = new Veiculo();
        veiculo.setAnoFabricacao(1965);
        veiculo.setMarca("Volkswagen");
        veiculo.setModelo("Fusca");
        veiculo.setCor("Azul");
        veiculo.setPlaca("2658786");

        assertEquals("Vintage", veiculo.obterClasse());
    }

    @Test
    void deveRetornarClasseCarroContemporaneo() {
        Veiculo veiculo = new Veiculo();
        veiculo.setAnoFabricacao(2015);
        veiculo.setMarca("Honda");
        veiculo.setModelo("Civic");
        veiculo.setCor("Prata");
        veiculo.setPlaca("2658786");

        assertEquals("Contemporâneo", veiculo.obterClasse());
    }

    @Test
    void deveRetornarClasseCarroNewGeneration() {
        Veiculo veiculo = new Veiculo();
        veiculo.setAnoFabricacao(2023);
        veiculo.setMarca("Porsche");
        veiculo.setModelo("Taycan");
        veiculo.setCor("Cinza");
        veiculo.setPlaca("R1Y96F");

        assertEquals("New Generation", veiculo.obterClasse());
    }
}