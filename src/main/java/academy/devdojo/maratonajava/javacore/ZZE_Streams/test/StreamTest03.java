package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest03 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lone Wolf & Cub", 8.99),
            new LightNovel("Evangelion", 3.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Death Note", 2.99),
            new LightNovel("Vagabond", 5.99),
            new LightNovel("Hunter x Hunter", 1.99),
            new LightNovel("Pluto", 1.99),
            new LightNovel("Pluto", 1.99),
            new LightNovel("Dragon Ball", 4.00)));

    static void main() {
        lightNovels.forEach(System.out::println);
        System.out.println("-------------------");
        lightNovels.stream().forEach(System.out::println);


        long count = lightNovels.stream()
                .filter(ln -> ln.getPrice() <= 4)
                .distinct()
                .count();

        System.out.println(count);

    }
}
