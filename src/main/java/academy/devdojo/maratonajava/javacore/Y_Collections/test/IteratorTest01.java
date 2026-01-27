package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest01 {
    public static void main(String[] args) {
        ArrayList<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "Lobo solitário", 14.55, 2));
        mangas.add(new Manga(2L, "Vagabond", 6.99, 5));
        mangas.add(new Manga(3L, "Akira", 20D, 2));
        mangas.add(new Manga(1L, "Fullmetal Alchemist", 15.90, 1));
        mangas.add(new Manga(1L, "Dragon ball", 15.90, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }

        System.out.println(mangas);
    }
}
