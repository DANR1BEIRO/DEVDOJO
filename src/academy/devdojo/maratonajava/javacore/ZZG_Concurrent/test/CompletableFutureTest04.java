package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.test;

import academy.devdojo.maratonajava.javacore.ZZG_Concurrent.domain.Quote;
import academy.devdojo.maratonajava.javacore.ZZG_Concurrent.service.StoreServiceWithDiscount;

import java.util.List;

public class CompletableFutureTest04 {
    static void main() {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service) {
        List<String> stores = List.of("Store1", "Store2", "Store3", "Store4");
        //stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync) // store:price:code
                .map(Quote::newQuote)// generate a new Quote
                .map(service::applyDiscount) // apply the discount
                .forEach(System.out::println);
    }

}
