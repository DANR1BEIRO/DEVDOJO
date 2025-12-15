package academy.devdojo.maratonajava.javacore.ZZD_Optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    static void main() {
        Optional<String> optional = Optional.of("gohan");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();

        System.out.println(optional);
        System.out.println(optional2);
        System.out.println(optional3);
        System.out.println("-------");

        Optional<String> nameOptional = findName("Goku");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("goku", "piccolo");

        if (list.contains(name)) {
            return Optional.of(name);
        }
        return Optional.empty();
    }
}

/*int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }*/
