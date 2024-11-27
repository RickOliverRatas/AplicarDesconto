package br.eu.com;

public class Produto implements Vendavel{
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal(int quantidade) {
        double resultado;
        return resultado = preco * quantidade;
    }

    @Override
    public double aplicarDesconto(double desconto) {
        return preco -= preco * desconto;
    }
}
