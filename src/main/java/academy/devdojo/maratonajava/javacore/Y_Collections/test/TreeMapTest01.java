package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import java.util.TreeMap;

public class TreeMapTest01 {
    static void main() {

        // TreeMap stores key-value pairs in sorted order by key
        TreeMap<String, String> capitalCities = new TreeMap<>();

        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("China", "Beijing");
        capitalCities.put("Korean", "Seoul");
        capitalCities.put("India", "New Dehli");

        System.out.println(capitalCities);

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
