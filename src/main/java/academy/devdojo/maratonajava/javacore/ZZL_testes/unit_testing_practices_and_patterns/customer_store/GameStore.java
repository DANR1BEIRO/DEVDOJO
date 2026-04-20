package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class GameStore implements Store<GameProduct> {

    private Map<GameProduct, Integer> inventory = new HashMap<>();

    @Override
    public void addInventory(GameProduct product, int amount) {
        inventory.put(product, inventory.getOrDefault(product, 0) + amount);
    }

    @Override
    public int getInventory(GameProduct product) {
        log.info("Inventory: {}", inventory);
        return inventory.get(product);
    }

    @Override
    public boolean hasEnoughInventory(GameProduct product, int amount) {
        return product != null && getInventory(product) >= amount;
    }

    @Override
    public void removeInventory(GameProduct product, int amount) {
        if (hasEnoughInventory(product, amount)) {
            inventory.remove(product, inventory.getOrDefault(product, 0) - amount);
        }
    }
}
