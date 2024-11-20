package org.testeunidade.numeroprimo;

public class NumeroPrimo {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String validarNumeroPrimo() {
        if (numero <= 1) {
            return "Não é primo";
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return "Não é primo";
            }
        }
        return "Número Primo";
    }
}
