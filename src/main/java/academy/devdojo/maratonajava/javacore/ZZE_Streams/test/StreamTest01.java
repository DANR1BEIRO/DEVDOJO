package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 1 - Order LightNovel by title
 * 2 - Retrieve the first 3 titles light novels with price less than 4
 */

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lone Wolf & Cub", 8.99),
            new LightNovel("Evangelion", 3.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Death Note", 2.99),
            new LightNovel("Vagabond", 2.99),
            new LightNovel("Hunter x Hunter", 2.99),
            new LightNovel("Pluto", 1.99)));

    static void main() {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);

    }
}
