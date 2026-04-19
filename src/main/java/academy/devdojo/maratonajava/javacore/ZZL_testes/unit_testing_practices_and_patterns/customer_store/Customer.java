package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Builder
public class Customer {

    private final Store store;

    public boolean purchase(GameProduct product, int quantity) {
        log.info("Trying to purchase {} units of {}", quantity, product);

        if (!store.hasEnoughInventory(product, quantity)) {
            log.error("Purchase fail! There isn't enough amount of {} in stock.", product);
            return false;
        }

        store.removeInventory(product, quantity);
        log.info("{} {} purchase successful!", quantity, product);
        return true;
    }
}
