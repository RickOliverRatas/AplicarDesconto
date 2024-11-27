
import br.eu.com.Servico;
import br.eu.com.Produto;


public class Main {
    public static void main(String[] args) {
        Servico ola = new Servico();
        ola.setPrecoHora(670.00);
        System.out.println(ola.calcularPrecoFinal(10));
        System.out.println(ola.aplicarDesconto(0.1));

        Produto ola2 = new Produto();
        ola2.setPreco(70.40);
        System.out.println(ola.calcularPrecoFinal(5));
        System.out.println(ola.aplicarDesconto(0.1));

    }
}