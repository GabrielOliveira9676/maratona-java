package academy.devdojo.maratonajava.src.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.src.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.src.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.src.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.src.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------------------------------");

        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

        System.out.println("----------------------------------------");
        Produto produto3 = new Televisao("Samsung 50\" ", 5000);
        System.out.println(produto3.getNome());
        System.out.println(produto3.getValor());
        System.out.println(produto3.calcularImposto());

    }
}
