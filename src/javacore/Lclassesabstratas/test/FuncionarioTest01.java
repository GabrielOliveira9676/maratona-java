package academy.devdojo.maratonajava.src.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.src.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.src.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 120000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
        gerente.imprime();
    }
}
