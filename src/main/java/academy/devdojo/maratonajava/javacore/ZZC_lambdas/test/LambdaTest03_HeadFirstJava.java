package academy.devdojo.maratonajava.javacore.ZZC_lambdas.test;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest03_HeadFirstJava {
    static void main() {
        Comparator<String> comparator = (s1, s2) -> s1.compareToIgnoreCase(s2);
        Runnable runnable = () -> System.out.println("runnable");
        Consumer<String> consumer = str -> System.out.println(str);

        int resultado = comparator.compare("Java", "java");
        System.out.println("Resultado do Comparator: " + resultado);
        runnable.run();
        consumer.accept("teste consumer");
    }
}
