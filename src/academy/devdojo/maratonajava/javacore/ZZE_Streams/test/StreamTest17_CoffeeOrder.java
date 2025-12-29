package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

// exercise: code magnets - Head First Java - p.384
// expected result: [Americano, Cappuccino, Cortado, Espresso]

import java.util.List;
import java.util.stream.Collectors;

public class StreamTest17_CoffeeOrder {
    static void main() {
        List<String> coffees = List.of("Cappuccino", "Americano", "Espresso", "Cortado", "Mocha",
                "Cappuccino", "Flat White", "Latte");

        List<String> result = coffees.stream()
                .filter(c -> c.endsWith("o"))
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
