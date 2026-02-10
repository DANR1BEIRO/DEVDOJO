package academy.devdojo.maratonajava.javacore.ZZL_testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestInsertionSort {
    public static void main(String[] args) {
        List<Integer> numbers = randomIntegerList();

        System.out.println("random list: " + numbers);
        System.out.println("sorted list: " + insertionSort(numbers));
    }

    public static List<Integer> randomIntegerList() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            numbers.add(random.nextInt(1, 99));
        }
        return numbers;
    }

    public static <T extends Comparable<T>> List<T> insertionSort(List<T> array) {

        for (int i = 1; i < array.size(); i++) {
            T key = array.get(i);
            int j = i - 1;
            while (j >= 0 && array.get(j).compareTo(key) > 0) {
                array.set(j + 1, array.get(j));
                j = j - 1;
            }
            array.set(j + 1, key);
        }
        return array;
    }
}
