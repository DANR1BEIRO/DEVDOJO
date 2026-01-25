package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.domain.NutritionFacts;

public class NutritionFactsTest {
    static void main() {
        NutritionFacts cocaCola = new NutritionFacts.Builder(200, 1)
                .calories(100)
                .fat(3000)
                .carbohydrate(300)
                .sodium(35)
                .build();

        System.out.println(cocaCola);
    }
}
