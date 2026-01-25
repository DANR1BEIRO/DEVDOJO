package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.service;

import academy.devdojo.maratonajava.javacore.ZZG_Concurrent.domain.Discount;
import academy.devdojo.maratonajava.javacore.ZZG_Concurrent.domain.Quote;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

// storeName:price:discountCode

public class StoreServiceWithDiscount {
    public String getPriceSync(String storeName) {
        double price = priceGenerator(); // Simulating an API searching for price
        Discount.Code discountCode = Discount.Code.values()[ // discount code that simulates a db query
                ThreadLocalRandom.current().nextInt(Discount.Code.values().length)
                ];
        return String.format("%s:%.2f:%s", storeName, price, discountCode);
    }

    /**
     * To apply a discount we need a quote
     *
     * @param quote
     * @return returns the pattern storeName, discount applied and final price
     */
    public String applyDiscount(Quote quote) {
        delay(); // simulating an API
        double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) / 100;
        return String.format("'%s' original price: '%.2f'. Applying discount code '%s'. Final price: '%s",
                quote.getStore(),
                quote.getPrice(),
                quote.getDiscountCode(),
                discountValue);
    }

    private double priceGenerator() {
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        int milliseconds = ThreadLocalRandom.current().nextInt(250, 2500);
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
