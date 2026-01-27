package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    static void main() {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("A", "letra A");
        map.put("D", "letra D");
        map.put("B", "letra B");
        map.put("C", "letra C");

        // o TreeMap ordena as keys
        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
