package org.testeunidade.veiculo;

public class Veiculo {

    private int anoFabricacao;
    private String modelo;
    private String placa;
    private String cor;
    private String marca;

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String obterClasse() {
        if (this.anoFabricacao < 2000) {
            return "Vintage";
        }
        if (this.anoFabricacao > 2020) {
            return "New Generation";
        }
        return "Contemporâneo";
    }
}
