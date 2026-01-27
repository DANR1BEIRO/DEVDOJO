package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.service;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService executor = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPricesAsyncFuture(String storeName) {
        System.out.printf("Getting prices async for store %s%n", storeName);
        return executor.submit(this::priceGenerator);
    }

    // CompletableFuture não precisa de um executor
    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName) {
        System.out.printf("Getting prices async for store %s%n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    private double priceGenerator() {
        double randomPrice = ThreadLocalRandom.current().nextInt(1, 500) * 10;
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return randomPrice;
    }

    public static void shutdown() {
        executor.shutdown();
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
