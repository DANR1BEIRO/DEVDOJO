package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import java.util.*;

public class IteratorTest02 {
    static void main() {

        Set<String> names = new HashSet<>();
        names.add("goku");
        names.add("gohan");
        names.add("goten");

        // get the iterator
        Iterator it = names.iterator();

        /**
         * To loop through a collection, use the hasNext() and next()
         * mrthods of the Iterator:
         */

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /**
         * Removing Items from a Collection:
         * Iterators are designed to easily change the collections
         * that they loop through. The remove() method can remove
         * items from a collection while looping
         */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(15);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> itNumber = numbers.iterator();
        System.out.println(numbers);

        System.out.println("");

        while (itNumber.hasNext()) {
            if (itNumber.next() % 2 == 0) {
                itNumber.remove();
            }
        }
        System.out.println(numbers);
    }
}
