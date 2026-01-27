package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.test;

import java.util.concurrent.*;

public class FutureTest01 {
    static void main() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(5);
            return 5.30D;
        });

        System.out.println(doSomething());
        try {

            // O valor recebido no parâmetro define quanto tempo a Thread esperará
            // pelo dado até que lance um TimeoutException.
            System.out.println(dollarRequest.get(3, TimeUnit.SECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    private static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}
