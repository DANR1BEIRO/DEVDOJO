package academy.devdojo.maratonajava.javacore.C_OverloadingMethods.test;

import academy.devdojo.maratonajava.javacore.C_OverloadingMethods.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Hunter x Hunter", "TV", 12);
        anime.init("Death Note", "TV", 15, "Seinen");
        anime.print();
    }
}
