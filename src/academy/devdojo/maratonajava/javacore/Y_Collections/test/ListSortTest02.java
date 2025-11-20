package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortTest02 {
    public static void main(String[] args) {
        ArrayList<String> mangas = new ArrayList<>();
        mangas.add("Neon Genesis Evangelion");
        mangas.add("Cawboy bebop");
        mangas.add("Blade");
        mangas.add("Akira");

        Collections.sort(mangas, Collections.reverseOrder());
        for (String manga : mangas) {
            System.out.println(manga);
        }

        ArrayList<Double> valores = new ArrayList<Double>();
        valores.add(100.22);
        valores.add(56D);
        valores.add(0.1);
        valores.add(30.54);

        System.out.println(valores);
        Collections.sort(valores, Collections.reverseOrder());
        System.out.println(valores);

        new Manga(2L, "goku", 0);
    }

}
