package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        ArrayList<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "Lobo solitário", 14.55));
        mangas.add(new Manga(2L, "Vagabond", 6.99));
        mangas.add(new Manga(3L, "Akira", 20D));
        mangas.add(new Manga(1L, "Fullmetal Alchemist", 15.90));

        System.out.println("Ordem de insercão:");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("----------\nOrdem alfabética (implementada na classe Manga):");


        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("----------\nOrdem por ID com Comparator, implementada pela classe MangaByIdComparator: ");
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
