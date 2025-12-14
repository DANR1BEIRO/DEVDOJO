package academy.devdojo.maratonajava.javacore.ZZC_lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    static void main() {
        List<String> stringList = new ArrayList<>(List.of("piccolo", "goku", "gohan", "kame", "akira"));
        stringList.sort(String::compareTo);
        System.out.println(stringList);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        int num = numStringToInteger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(stringList, "akira"));
    }
}
