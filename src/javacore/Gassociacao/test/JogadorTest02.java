package academy.devdojo.maratonajava.src.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.src.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.src.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador ("Pelé");

        Time time = new Time ("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
