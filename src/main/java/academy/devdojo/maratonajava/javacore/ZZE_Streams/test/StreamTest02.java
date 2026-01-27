package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lone Wolf & Cub", 8.99),
            new LightNovel("Evangelion", 3.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Death Note", 2.99),
            new LightNovel("Vagabond", 2.99),
            new LightNovel("Hunter x Hunter", 2.99),
            new LightNovel("Pluto", 1.99)));

    static void main() {
        List<String> collect = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle)) // ordena pelo título através de um metodo de referencia
                .filter(ln -> ln.getPrice() <= 4) // filtra os que tem o preco menor ou igual a 4
                .limit(3) // limita a quantidade por 3
                .map(LightNovel::getTitle) // map é uma funcao que recebe um T (LightNovel) e retorna um R (getTitle)
                .collect(Collectors.toList()); // fecha a stream, coletando e agrupando a colecao

        System.out.println(collect);

    }
}

/**
 * Stream: Agrupam elementos no tempo
 * Uma Stream representa um fluxo sequencial de elementos que são processados de forma declarativa.
 * Uma Stream permite que seja definido o que será feito com os dados enquanto passando no tempo, não onde serão armazenados
 */