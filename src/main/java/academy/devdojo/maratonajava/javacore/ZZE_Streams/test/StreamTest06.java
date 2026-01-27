package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import java.util.List;

/**
 * O operador `reduce` é o que chamamos de uma operação terminal de redução.
 * Ele é usado quando você quer pegar todos os elementos de um Stream e
 * combiná-los em um único resultado final.
 *
 * Se o `map` transforma e o `filter` seleciona, o `reduce` acumula.
 */


public class StreamTest06 {
    static void main() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        integers.stream()
                .reduce((Integer::sum))
                .ifPresent(System.out::println);

        integers.stream()
                .reduce((x, y) -> x * y).ifPresent(System.out::println);

        integers.stream()
                .reduce((Integer::max))
                .ifPresent(System.out::println);
    }
}
