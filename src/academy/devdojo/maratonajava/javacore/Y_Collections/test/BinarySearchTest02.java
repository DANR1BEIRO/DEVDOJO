package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        ArrayList<Manga> mangas = new ArrayList<>();
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        mangas.add(new Manga(4L, "Lobo solitário", 14.55));
        mangas.add(new Manga(2L, "Vagabond", 6.99));
        mangas.add(new Manga(3L, "Akira", 20D));
        mangas.add(new Manga(1L, "Fullmetal Alchemist", 15.90));

        //Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Vagabond", 6.99);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
