package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.src.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.src.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.src.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.src.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate siciliano", 10);
        Televisao televisao = new Televisao("Samsung", 4000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}

