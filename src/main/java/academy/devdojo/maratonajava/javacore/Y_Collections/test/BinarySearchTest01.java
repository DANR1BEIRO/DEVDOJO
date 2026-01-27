package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(3);
        numbers.add(4);

        /**
         * Para fazer uma busca binária (binary search), o array precisa estar ordenado
         * em ordem crescente de acordo à ordem natural dos elementos no array.
         */
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 2));
    }
}
