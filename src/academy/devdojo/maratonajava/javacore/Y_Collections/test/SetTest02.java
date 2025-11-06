package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import java.util.*;


public class SetTest02 {
    static void main() {
        Set<String> names = new HashSet<>();

        names.add("walter");
        names.add("skyler");
        names.add("jesse");
        names.add("mike");
        names.add("saul");

        String nameToCheck = "Walter";

        boolean exist = names.stream()
                .anyMatch(name -> name.equalsIgnoreCase(nameToCheck));
        System.out.println(exist ? "yes" : "no");
        System.out.println("-------------");
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        System.out.println("---------------");
        System.out.println("Lists allow duplicates:");

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(1);
        numberList.add(1);
        numberList.add(1);
        System.out.println(numberList);

        System.out.println("Sets don't allow duplicates:");
        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);
    }
}
