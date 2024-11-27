package br.eu.com;

public class Servico implements Vendavel {

    private double precoHora;

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public double calcularPrecoFinal(int quantidade) {
        double resultado;
        return resultado = precoHora * quantidade;
    }

    @Override
    public double aplicarDesconto(double percentualDesconto) {
        return precoHora -= precoHora * percentualDesconto;
    }
}
