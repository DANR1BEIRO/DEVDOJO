package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import academy.devdojo.maratonajava.javacore.ZZE_Streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

/*
Demonstra duas formas de somar valores utilizando a Stream API.

A primeira abordagem utiliza Stream de objetos combinando map e reduce.
Nesse caso, os preços são convertidos para Double, o que envolve autoboxing,
e o resultado da redução é um Optional, pois a stream pode não conter elementos
após o filtro.

A segunda abordagem utiliza uma stream especializada para tipos primitivos
(DoubleStream) por meio de mapToDouble.
Essa forma evita boxing e unboxing, é mais performática e retorna diretamente
um double. Caso não existam elementos válidos, o valor retornado será 0.0.

Em cenários de cálculos numéricos simples, como soma, média ou máximo,
a utilização de streams primitivas (mapToDouble, mapToInt, etc.)
é a abordagem recomendada por ser mais clara e eficiente.
*/


public class StreamTest07 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lone Wolf & Cub", 8.99),
            new LightNovel("Evangelion", 3.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Death Note", 2.99),
            new LightNovel("Vagabond", 2.99),
            new LightNovel("Hunter x Hunter", 2.99),
            new LightNovel("Pluto", 1.99)));

    static void main() {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println(sum);
    }
}
