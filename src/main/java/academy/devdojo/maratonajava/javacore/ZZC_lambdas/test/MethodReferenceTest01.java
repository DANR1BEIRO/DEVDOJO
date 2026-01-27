package academy.devdojo.maratonajava.javacore.ZZC_lambdas.test;

import academy.devdojo.maratonajava.javacore.ZZC_lambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZC_lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest01 {
    static void main() {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 1150),
                new Anime("One Piece", 900),
                new Anime("Naruto", 250)));
        //Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println("Compare by title: " + animeList);

        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println("Compare by episodes: " + animeList);

        animeList.sort(Collections.reverseOrder(AnimeComparators::compareByEpisodes));
        System.out.println("Sort by reverse natural order: " + animeList);
    }
}
