package academy.devdojo.maratonajava.src.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.src.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 12, "Ação");
        anime.imprime();
    }
}
