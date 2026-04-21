package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.store.impl;

import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.exception.NullProductException;
import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.exception.AmountNegativeException;
import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.exception.AmountZeroException;
import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.model.GameProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// MethodName_State_ExpectedBehavior
class GameStoreTest {

    GameStore gameStore;

    @BeforeEach
    void init() {
        gameStore = new GameStore();
    }

    @Test
    void addInventory_shouldAddProduct_whenProductIsNew() {

        GameProduct playstation = GameProduct.PLAYSTATION;
        gameStore.addInventory(playstation, 10);

        assertEquals(10, gameStore.getInventory(playstation));
    }

    @Test
    void addInventory_shouldSumProduct_whenProductAlreadyExist() {

        gameStore.addInventory(GameProduct.XBOX, 5);
        gameStore.addInventory(GameProduct.XBOX, 5);

        assertEquals(10, gameStore.getInventory(GameProduct.XBOX));
    }

    @Test
    void addInventory_shouldThrowException_whenProductIsNull() {
        NullProductException exception = assertThrows(NullProductException.class,
                () -> gameStore.addInventory(null, 1));

        assertEquals("Product can't be null", exception.getMessage());
    }

    @Test
    void addInventory_shouldThrowException_whenAmountIsZero() {
        AmountZeroException exception = assertThrows(AmountZeroException.class,
                () -> gameStore.addInventory(GameProduct.PLAYSTATION, 0));

        assertEquals("Amount can't be zero", exception.getMessage());
    }

    @Test
    void addInventory_shouldThrowException_whenAmountIsNegative() {
        AmountNegativeException exception = assertThrows(AmountNegativeException.class,
                () -> gameStore.addInventory(GameProduct.PLAYSTATION, -10));

        assertEquals("Amount can't be negative", exception.getMessage());
    }

}