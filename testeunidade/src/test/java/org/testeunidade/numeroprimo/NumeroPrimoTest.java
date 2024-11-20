package org.testeunidade.numeroprimo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeroPrimoTest {

    @Test
    void deveRetornarNumeroPrimo() {
        NumeroPrimo numeroPrimo = new NumeroPrimo();
        numeroPrimo.setNumero(5);
        assertEquals("Número Primo", numeroPrimo.validarNumeroPrimo());
    }

    @Test
    void deveRetornarNumeroNaoPrimo() {
        NumeroPrimo numeroPrimo = new NumeroPrimo();
        numeroPrimo.setNumero(1);
        assertEquals("Não é primo", numeroPrimo.validarNumeroPrimo());
    }

    @Test
    void deveRetornarNumeroNaoPrimo0() {
        NumeroPrimo numeroPrimo = new NumeroPrimo();
        numeroPrimo.setNumero(0);
        assertEquals("Não é primo", numeroPrimo.validarNumeroPrimo());
    }

    @Test
    void deveRetornarNumeroNaoPrimoNegativo() {
        NumeroPrimo numeroPrimo = new NumeroPrimo();
        numeroPrimo.setNumero(-1);
        assertEquals("Não é primo", numeroPrimo.validarNumeroPrimo());
    }
}