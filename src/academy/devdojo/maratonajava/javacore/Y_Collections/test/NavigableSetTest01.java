package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.Manga;
import academy.devdojo.maratonajava.javacore.Y_Collections.domain.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneCompareToSerial implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getSerial().compareTo(o2.getSerial());
    }
}

class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}

public class NavigableSetTest01 {
    static void main() {
        NavigableSet<SmartPhone> smartPhones = new TreeSet<>(new SmartPhoneCompareToSerial());
        smartPhones.add(new SmartPhone("123", "xiaomi"));
        smartPhones.add(new SmartPhone("1234", "xiaomi"));
        System.out.println(smartPhones);

        /**
         * O papel do compareTo() no TreeSet
         *
         * O TreeSet é uma coleção ordenada.
         * Ele precisa saber como comparar dois objetos pra decidir:
         *
         * onde inserir o novo elemento,
         * e se um elemento é igual a outro (ou seja, se deve ser ignorado).
         *
         * Por isso ele exige uma forma de comparação.
         * Essa comparação pode vir de dois lugares:
         *
         * 1 - O próprio objeto implementa Comparable (e, portanto, tem o metodo compareTo())
         */

        NavigableSet<Manga> mangas = new TreeSet<>(); // implementa Comparable e tem o metodo compareTo()
        mangas.add(new Manga(4L, "Lobo solitário", 14.55, 2));
        mangas.add(new Manga(2L, "Vagabond", 6.99, 5));
        mangas.add(new Manga(3L, "Akira", 20D, 2));
        mangas.add(new Manga(1L, "Fullmetal Alchemist", 15.90, 1));
        mangas.add(new Manga(2L, "Dragon ball", 15.90, 0));
        mangas.add(new Manga(2L, "Dragon ball", 15.90, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        // 2 - Ou o TreeSet recebe um Comparator na criação, pra que a comparação seja externa.
        NavigableSet<Pessoa> pessoas = new TreeSet<>(Comparator.comparing(p -> p.nome));
        pessoas.add(new Pessoa("Goku"));
        pessoas.add(new Pessoa("vegeta"));


        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.nome);
        }
    }
}
