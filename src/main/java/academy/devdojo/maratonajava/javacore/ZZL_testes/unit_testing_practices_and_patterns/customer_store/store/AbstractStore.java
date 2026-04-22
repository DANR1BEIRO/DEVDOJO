package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.store;

import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.exception.AmountNegativeException;
import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.exception.AmountZeroException;
import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.exception.NullProductException;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class AbstractStore<T> implements Store<T> {
    private Map<T, Integer> inventory = new HashMap<>();

    @Override
    public void addInventory(T product, int amount) {

        validateProductNotNull(product);
        validateAmountGreaterThanZero(amount);

        inventory.put(product, inventory.getOrDefault(product, 0) + amount);
    }

    @Override
    public int getInventory(T product) {

        validateProductNotNull(product);

        return inventory.getOrDefault(product, 0);
    }

    @Override
    public boolean hasEnoughInventory(T product, int amount) {

        validateProductNotNull(product);
        validateAmountGreaterThanZero(amount);

        int currentStock = getInventory(product);
        return currentStock >= amount;
    }

    @Override
    public void removeInventory(T product, int amount) {
        if (hasEnoughInventory(product, amount)) {
            inventory.remove(product, inventory.getOrDefault(product, 0) - amount);
        }
    }

    private void validateProductNotNull(T product) {
        if (product == null) {
            throw new NullProductException();
        }
    }

    private void validateAmountGreaterThanZero(int amount) {
        if (amount == 0) {
            throw new AmountZeroException();
        }

        if (amount < 0) {
            throw new AmountNegativeException();
        }
    }
}
