package academy.devdojo.maratonajava.javacore.E_InstanceInitializationBlock.test;

import academy.devdojo.maratonajava.javacore.E_InstanceInitializationBlock.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }
}
