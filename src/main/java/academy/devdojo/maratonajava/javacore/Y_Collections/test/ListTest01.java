package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Qualquer coleção que faz parte do Java Collections Framework (List, Set, Map, Queue, etc.)
 * foi projetada para armazenar e gerenciar apenas Objetos. Elas não podem, de forma nativa,
 * armazenar tipos primitivos (int, double, char, boolean, etc.).
 * <p>
 * O Java Collections Framework foi construído sobre o conceito de Generics (a sintaxe com < >).
 * Por exemplo, List<E>, onde E é o tipo do elemento. A regra fundamental dos Generics em Java é
 * que o tipo E deve ser um Objeto.
 * <p>
 * Como os tipos primitivos não são objetos (eles não herdam da classe Object, que é a "mãe"
 * de todas as classes em Java), eles simplesmente não se encaixam nesse requisito.
 */

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Goku");
        nomes.add("Kame");
        nomes.add("Vegeta");

        System.out.println(nomes.remove("Goku"));

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("----------");

        nomes.add("Gohan");
        nomes2.addAll(nomes); // Adiciona todos os elementos de nomes à nomes2
        System.out.println("Tamanho da lista: " + nomes.size());
        System.out.println(nomes2);

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }


        List<Integer> numeros = new ArrayList<>();
        numeros.add(100);
    }
}
