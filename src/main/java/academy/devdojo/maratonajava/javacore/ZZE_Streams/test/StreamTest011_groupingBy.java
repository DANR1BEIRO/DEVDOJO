package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest011_groupingBy {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lone Wolf & Cub", 8.99, Category.SEINEN),
            new LightNovel("Evangelion", 3.99, Category.SEINEN),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.SHOUNEN),
            new LightNovel("Death Note", 2.99, Category.SEINEN),
            new LightNovel("Vagabond", 5.99, Category.SEINEN),
            new LightNovel("Hunter x Hunter", 1.99, Category.SHOUNEN),
            new LightNovel("Pluto", 1.99, Category.SEINEN),
            new LightNovel("Pluto", 1.99, Category.SEINEN),
            new LightNovel("Dragon Ball", 4.00, Category.SHOUNEN)));

    static void main() {

        Map<Category, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));

        collect.forEach(((category, lightNovels1) ->
                System.out.println(category + ": " + lightNovels1)));
    }
}
