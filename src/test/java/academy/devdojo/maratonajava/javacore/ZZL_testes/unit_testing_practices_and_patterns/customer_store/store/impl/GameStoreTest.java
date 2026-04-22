package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.store.impl;

import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.exception.AmountNegativeException;
import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.exception.AmountZeroException;
import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.exception.NullProductException;
import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.model.GameProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void getInventory_shouldReturnAmount_whenProductExists() {

        gameStore.addInventory(GameProduct.PLAYSTATION, 10);
        int amountOfProduct = gameStore.getInventory(GameProduct.PLAYSTATION);

        assertEquals(10, amountOfProduct);
    }

    @Test
    void getInventory_shouldThrowException_whenProductIsNull() {

        assertThrows(NullProductException.class,
                () -> gameStore.getInventory(null));
    }

    @Test
    void getInventory_shouldReturnZero_whenProductDoesNotExist() {

        int quantity = gameStore.getInventory(GameProduct.XBOX);

        assertEquals(0, quantity);
    }

    @Test
    void hasEnoughInventory_shouldReturnTrue_whenAmountIsExactlyTheInventory() {

        int quantity = 5;
        gameStore.addInventory(GameProduct.XBOX, quantity);

        assertTrue(gameStore.hasEnoughInventory(GameProduct.XBOX, quantity));
    }

    @Test
    void hasEnoughInventory_shouldReturnTrue_whenInventoryIsGreaterThanAmount() {

        gameStore.addInventory(GameProduct.XBOX, 400);

        assertTrue(gameStore.hasEnoughInventory(GameProduct.XBOX, 200));
    }

    @Test
    void hasEnoughInventory_shouldReturnFalse_whenAmountIsGreaterThanInventory() {

        gameStore.addInventory(GameProduct.PLAYSTATION, 5);

        assertFalse(gameStore.hasEnoughInventory(GameProduct.PLAYSTATION, 10));
    }

    @Test
    void hasEnoughInventory_shouldThrowException_whenProductIsNull() {
        assertThrows(NullProductException.class,
                () -> gameStore.hasEnoughInventory(null, 1));
    }
}