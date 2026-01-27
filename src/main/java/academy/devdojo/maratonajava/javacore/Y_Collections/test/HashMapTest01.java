package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import java.util.HashMap;

public class HashMapTest01 {
    static void main() {
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("China", "Beijing");
        capitalCities.put("Korean", "Seoul");
        capitalCities.put("India", "New Dehli");

        System.out.println(capitalCities.get("China"));
        System.out.println("The amount of elements in HashMap: " + capitalCities.size());

        // print keys
        for (String s : capitalCities.keySet()) {
            System.out.println(s);
        }

        System.out.println();

        // print values
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

        System.out.println();
        for (String s : capitalCities.keySet()) {
            System.out.println(s + " - " + capitalCities.get(s));
        }
    }
}
