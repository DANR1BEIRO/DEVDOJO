package academy.devdojo.maratonajava.javacore.ZZC_lambdas.test;

import academy.devdojo.maratonajava.javacore.ZZC_lambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZC_lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferenceTest04 {
    static void main() {
        Supplier<AnimeComparators> newAnimeComparatores = AnimeComparators::new; // o objeto não está sendo criado aqui!
        AnimeComparators animeComparators = newAnimeComparatores.get(); // objeto criado
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 1150),
                new Anime("One Piece", 900),
                new Anime("Naruto", 250)));

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        animeList.add(animeBiFunction.apply("Super Campeões", 70));

        BiFunction<String, Integer, Anime> animeBiFunctio2 = Anime::new; // o objeto não está sendo criado aqui!
        animeList.add(animeBiFunctio2.apply("Dragon ball", 150));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

    }
}
