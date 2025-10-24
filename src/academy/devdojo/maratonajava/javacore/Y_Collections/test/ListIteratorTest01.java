package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorTest01 {
    static void main() {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Goku");
        nomes.add("vegeta");
        nomes.add("gohan");

        ListIterator<String> nomesIterador = nomes.listIterator();
        System.out.println(nomes);
        while (nomesIterador.hasNext()) {
            nomesIterador.next();
        }
        nomesIterador.add("Bulma");
        System.out.println(nomes);

        nomes.removeIf(nome -> nome.equals("Goku"));
        System.out.println(nomes);
    }
}
