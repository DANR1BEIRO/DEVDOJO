package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/*
STREAM API — ANOTAÇÃO DE ESTUDO

Esta classe demonstra a criação de streams infinitas utilizando
Stream.iterate e Stream.generate, além do controle de consumo
dessas streams com limit.

1) Stream.iterate com incremento simples
- Cria uma stream infinita iniciando em 2
- A cada iteração soma 2 ao valor anterior
- Gera a sequência de números pares
- O limit(5) é essencial para evitar loop infinito

2) Stream.iterate com array (sequência de Fibonacci)
- A stream inicia com um array [0, 1]
- Cada iteração gera um novo array:
  [valor atual, soma dos dois anteriores]
- O resultado é a sequência de pares que representam o estado
  da progressão de Fibonacci
- Arrays.toString é usado apenas para visualização

3) Extraindo valores da sequência de Fibonacci
- A mesma stream é utilizada, mas agora com map
- O map extrai apenas o primeiro valor do array
- O resultado é a sequência de Fibonacci propriamente dita

4) Stream.generate com valores aleatórios
- Gera uma stream infinita de números aleatórios
- ThreadLocalRandom é usado por ser seguro e eficiente
- O limit define quantos valores serão consumidos

Observações importantes:
- iterate e generate sempre produzem streams infinitas
- limit é obrigatório para controle de execução
- Streams são lazy e só executam quando há operação terminal
*/

public class StreamTest09 {
    static void main() {
        Stream.iterate(2, n -> n + 2)
                .limit(5)
                .forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.print(Arrays.toString(a) + " "));
        System.out.println();

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .map(a -> a[0])
                .limit(10)
                .forEach(a -> System.out.print(a + " "));
        System.out.println("\n");

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 10))
                .limit(10)
                .forEach(System.out::println);
    }
}
