package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import java.util.stream.Stream;

public class StreamTest015_ParallelStreams {
    private static long num = 100_000_000;

    static void main() {
        //System.out.println(Runtime.getRuntime().availableProcessors());
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("sum for:");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 0; i < num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("sum Stream:");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1)
                .limit(num)
                .reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(long num) {
        System.out.println("sum Parallel Stream:");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1)
                .limit(num)
                .parallel()
                .reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
