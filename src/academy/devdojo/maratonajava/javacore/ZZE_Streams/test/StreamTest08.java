package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/*
STREAM API — ANOTAÇÃO DE ESTUDO

Esta classe demonstra diferentes formas de criar e utilizar streams no Java,
incluindo streams primitivas, streams de objetos e streams a partir de arquivos.

1) IntStream.rangeClosed vs IntStream.range
- rangeClosed(início, fim) inclui o valor final
  Exemplo: rangeClosed(1, 10) gera números de 1 a 10
- range(início, fim) não inclui o valor final
  Exemplo: range(1, 10) gera números de 1 a 9
- Em ambos os casos, o filtro n % 2 == 0 mantém apenas números pares

2) Stream.of com objetos
- Cria uma Stream<String> diretamente a partir de valores
- O map transforma cada string em maiúscula
- O forEach consome a stream exibindo os valores

3) Arrays.stream com tipos primitivos
- Cria um IntStream a partir de um array de int
- O metodo average retorna OptionalDouble
- O uso de ifPresent evita erro caso o array esteja vazio

4) Stream a partir de arquivo (Files.lines)
- Cria uma Stream<String> onde cada elemento é uma linha do arquivo
- O try-with-resources garante o fechamento do arquivo
- As linhas são normalizadas para minúsculas
- O contains é usado para busca parcial e case-insensitive
- Apenas linhas que contêm a palavra "java" são exibidas

Observações importantes:
- Streams são consumidas uma única vez
- Operações intermediárias (filter, map) são lazy
- Operações terminais (forEach, average) disparam o processamento
*/

public class StreamTest08 {
    static void main() {
        IntStream.rangeClosed(1, 10)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        IntStream.range(1, 10)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("goku", "gohan", "goten")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        int num[] = {1, 2, 3, 4, 5};

        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);


        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(l -> l.toLowerCase().contains("java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
