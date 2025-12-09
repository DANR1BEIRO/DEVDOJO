package academy.devdojo.maratonajava.javacore.ZZC_lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    static void main() {
        List<String> names = List.of("goku", "gohan", "goten");
        forEach(names, name -> System.out.println(name));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
