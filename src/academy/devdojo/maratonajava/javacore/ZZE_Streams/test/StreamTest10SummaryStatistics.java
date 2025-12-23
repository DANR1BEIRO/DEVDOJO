package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/*
STREAM API — ANOTAÇÃO DE ESTUDO

Esta classe demonstra as principais operações de agregação (redução) da Stream API.
Ela concentra vários conceitos fundamentais que aparecem com frequência em código real
e em entrevistas técnicas.

1) Contagem de elementos
- stream().count() é uma operação terminal direta
- Collectors.counting() faz a mesma coisa via collector
- Ambos retornam o número de elementos da stream
- A diferença é conceitual: count é direto, counting é usado em composições mais complexas

2) Maior e menor elemento (max / min)
- max e min recebem um Comparator
- Comparator.comparing é usado para definir o critério (preço)
- O retorno é Optional, pois a stream pode estar vazia
- ifPresent evita exceção em caso de ausência de valor

3) Soma de valores
- mapToDouble().sum() usa stream primitiva
- Collectors.summingDouble faz a soma via collector
- As duas abordagens produzem o mesmo resultado
- A versão com stream primitiva é mais direta e performática

4) Estatísticas resumidas (summarizingDouble)
- Retorna um DoubleSummaryStatistics
- Em uma única passagem calcula:
  count, sum, min, max e average
- Evita múltiplas iterações na stream
- Muito útil para relatórios e métricas

5) Junção de strings (joining)
- joining combina todos os títulos em uma única String
- O delimitador separa os elementos
- O prefixo e o sufixo fazem parte do resultado final
- A formatação fica centralizada no collector

Observações importantes:
- Streams não podem ser reutilizadas após uma operação terminal
- Operações de redução transformam vários elementos em um único resultado
- Collectors são usados quando a redução precisa de mais controle ou composição
*/

public class StreamTest10SummaryStatistics {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lone Wolf & Cub", 8.99),
            new LightNovel("Evangelion", 3.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Death Note", 2.99),
            new LightNovel("Vagabond", 5.99),
            new LightNovel("Hunter x Hunter", 1.99),
            new LightNovel("Pluto", 1.99),
            new LightNovel("Pluto", 1.99),
            new LightNovel("Dragon Ball", 4.00)));

    static void main() {
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream()
                .max(Comparator.comparing(lightNovel -> lightNovel.getPrice()))
                .ifPresent(System.out::println);

        lightNovels.stream()
                .min(Comparator.comparing(lightNovel -> lightNovel.getPrice()))
                .ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(ln -> ln.getPrice()).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String string = lightNovels.stream()
                .map(LightNovel::getTitle)
                .collect(Collectors.joining(", ", " - ", "."));
        System.out.println(string);
    }
}
