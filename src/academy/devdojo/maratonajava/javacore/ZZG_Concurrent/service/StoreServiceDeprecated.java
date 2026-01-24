package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.service;

import java.util.concurrent.*;

public class StoreServiceDeprecated {
    public double getPriceSync(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGenerator();
    }

    private double priceGenerator() {
        double randomPrice = ThreadLocalRandom.current().nextInt(1, 500) * 10;
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return randomPrice;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
