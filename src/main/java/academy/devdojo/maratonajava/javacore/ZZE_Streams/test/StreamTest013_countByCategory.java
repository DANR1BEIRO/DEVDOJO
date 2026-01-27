package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest013_countByCategory {
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

        // Count by category
        Map<Category, Long> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        // Collect the highest priced item per category
        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        // Collect the highest priced item per category (without returning an Optional)
        Map<Category, LightNovel> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);
    }
}
