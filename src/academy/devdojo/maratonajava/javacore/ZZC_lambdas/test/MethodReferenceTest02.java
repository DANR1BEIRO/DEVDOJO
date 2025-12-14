package academy.devdojo.maratonajava.javacore.ZZC_lambdas.test;

import academy.devdojo.maratonajava.javacore.ZZC_lambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZC_lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    static void main() {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 1150),
                new Anime("One Piece", 900),
                new Anime("Naruto", 250)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        // como ficaria com lambda:
        // animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
    }
}
