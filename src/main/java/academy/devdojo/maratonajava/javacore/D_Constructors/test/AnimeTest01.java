package academy.devdojo.maratonajava.javacore.D_Constructors.test;

import academy.devdojo.maratonajava.javacore.D_Constructors.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon ball", "TV", 12, "Shonen", "Mappa");
        anime.print();
    }
}
