package academy.devdojo.maratonajava.src.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.src.javacore.Gassociacao.domain.Escola;
import academy.devdojo.maratonajava.src.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor [] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
