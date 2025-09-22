package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Goku");
        nomes.add("Vegeta");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("----------");

        nomes.add("Gohan");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
