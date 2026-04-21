package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.store;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class AbstractStore<T> implements Store<T> {
    private Map<T, Integer> inventory = new HashMap<>();

    @Override
    public void addInventory(T product, int amount) {
        inventory.put(product, inventory.getOrDefault(product, 0) + amount);
    }

    @Override
    public int getInventory(T product) {
        log.info("Inventory: {}", inventory);
        return inventory.get(product);
    }

    @Override
    public boolean hasEnoughInventory(T product, int amount) {
        return product != null && getInventory(product) >= amount;
    }

    @Override
    public void removeInventory(T product, int amount) {
        if (hasEnoughInventory(product, amount)) {
            inventory.remove(product, inventory.getOrDefault(product, 0) - amount);
        }
    }
}
