package academy.devdojo.maratonajava.javacore.Y_Collections.test;


import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Manga;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getValor(), manga2.getValor());
    }
}

public class NavigableSetTest02 {
    static void main() {

        /**
         * Uma instancia de TreeSet faz a comparacao dos elementos usando seu metodo
         * comparaTo (or compare), então pode-se dizer que ele 'falha' ao obedecer
         * o contrato da interface Set, que utiliza o metodo equals para fazer essa comparacao.gi
         */
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(4L, "Lobo solitário", 14.55, 2));
        mangas.add(new Manga(2L, "Vagabond", 6.99, 5));
        mangas.add(new Manga(3L, "Akira", 20, 2));
        mangas.add(new Manga(1L, "Fullmetal Alchemist", 3.99, 1));
        mangas.add(new Manga(2L, "Dragon ball", 15.90, 0));
        mangas.add(new Manga(2L, "Dragon ball", 7.90, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(10L, "YuYu Hakusho", 20);
        System.out.println("------------");

        // Usefull NavigableSet methods

        /**
         * lower '<' : returns the greatest element in this set strictly
         * less than the gien element, or null if there is no such element.
         */
        System.out.println("Lower: " + mangas.lower(yuyu));

        /**
         * floor '<=': returns the greatest element in this set less than
         * or equal to the given element, or null if there is no such element.
         */
        System.out.println("Floor: " + mangas.floor(yuyu));

        /**
         * higher '>': returns the least element in this set strictly greater
         * than the given element, or null if there is no such element.
         */
        System.out.println("Higher: " + mangas.higher(yuyu));

        /**
         * ceiling '>=': returns the least element in this set greater  than
         * or equal to the given element, or null if there is no such element.
         */
        System.out.println("Ceiling: " + mangas.ceiling(yuyu));


    }
}
