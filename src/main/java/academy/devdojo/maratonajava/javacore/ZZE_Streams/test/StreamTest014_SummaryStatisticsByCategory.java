package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.Promotion.UNDER_PROMOTION;

public class StreamTest014_SummaryStatisticsByCategory {
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

        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        // Map<Category, Set<Promotion>>
        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest014_SummaryStatisticsByCategory::getPromotion, Collectors.toSet())));
        System.out.println(collect1);

        // Criando colecoes (LinkedHashSet)
        Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest014_SummaryStatisticsByCategory::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 5 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
