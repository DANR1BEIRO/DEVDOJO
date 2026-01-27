package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest16_UseACabecaJava {
    static void main() {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        System.out.println(strings);

        System.out.println("------------------------");

        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(4);
        List<String> result = limit.collect(Collectors.toList());
        System.out.println("result: " + result);

        System.out.println("------------------------");

        List<String> collect = strings.stream()
                .limit(4)
                .toList();
        System.out.println("result: " + collect);

        System.out.println("------------------------");

        List<String> collect1 = strings.stream()
                .sorted((s, t1) -> s.compareToIgnoreCase(t1))
                .skip(2)
                .limit(4)
                .toList();
        System.out.println("result: " + collect1); // Ordem natural coloca letra maiúscula antes de minúscula


    }
}
