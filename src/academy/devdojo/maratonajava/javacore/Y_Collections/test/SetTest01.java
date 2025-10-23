package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Manga;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    static void main() {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(4L, "Lobo solitário", 14.55, 2));
        mangas.add(new Manga(2L, "Vagabond", 6.99, 5));
        mangas.add(new Manga(3L, "Akira", 20D, 2));
        mangas.add(new Manga(1L, "Fullmetal Alchemist", 15.90, 1));
        mangas.add(new Manga(2L, "Dragon ball", 15.90, 0));
        mangas.add(new Manga(2L, "Dragon ball", 15.90, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);

        }

    }
}
