package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest01 {
    static void main() {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        names.add("goku");
        names.add("eren");
        names.add("vegeta");
        names.add("akira");
        names.add("boo");

        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

        System.out.println("----------");

        numbers.add(8);
        numbers.add(7);
        numbers.add(5);
        numbers.add(6);
        numbers.add(4);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println("Numbers sorted: " + numbers);

        ArrayList<Integer> numbers2 = (ArrayList) numbers.clone();
        System.out.println(numbers + "\n" + numbers2);

        System.out.println(numbers.contains(111));

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Sort the ArrayList alphabetically in descending order: " + names);

    }
}
