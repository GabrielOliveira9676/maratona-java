package academy.devdojo.maratonajava.src.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.src.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.println(anime.getEpisodios());

        for (int episodios : anime.getEpisodios()) {
            System.out.print(episodios + " ");
        }

    }
}
