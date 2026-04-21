package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.model;

import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.store.Store;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Builder
public class Customer<T> {

    private final Store<T> store;

    public boolean purchase(T product, int quantity) {
        log.info("Trying to purchase {} units of {}", quantity, product);

        if (product == null) {
            log.error("Purchase fail! invalid product: {}", product);
            return false;
        }

        if (quantity <= 0) {
            log.error("Purchase fail! Invalid quantity: {}", quantity);
            return false;
        }

        if (!store.hasEnoughInventory(product, quantity)) {
            log.error("Purchase fail! There isn't enough amount of {} in stock.", product);
            return false;
        }

        store.removeInventory(product, quantity);
        log.info("{} {} purchase successful!", quantity, product);
        return true;
    }
}
