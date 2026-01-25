package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.test;

import academy.devdojo.maratonajava.javacore.ZZG_Concurrent.domain.Quote;
import academy.devdojo.maratonajava.javacore.ZZG_Concurrent.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest05 {
    static void main() {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(service);
    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        var completableFutures = stores.stream()
                .map(store -> CompletableFuture.supplyAsync(() -> service.getPriceSync(store)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s finished in %d%n", store, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);

        // allOf() returns a new CompletableFuture that is completed when all of the given CompletableFuture is complete
        // CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);

        // anyOf() returns a new CompletableFuture that is completed when any of the given CompletableFuture is complete
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("Finished: %b%n", voidCompletableFuture.isDone());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }
}
