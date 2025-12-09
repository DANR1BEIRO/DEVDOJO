package academy.devdojo.maratonajava.javacore.ZZC_lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    static void main() {
        List<String> strings = List.of("goku", "goten", "gohan");
        List<Integer> integers = map(strings, (String s) -> s.length());
        System.out.println(integers);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R apply = function.apply(e);
            result.add(apply);
        }
        return result;
    }
}
