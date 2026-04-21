package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store;

import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.model.Customer;
import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.model.GameProduct;
import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.store.Store;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;

// MethodName_State_ExpectedBehavior
@Slf4j
@ExtendWith(MockitoExtension.class)
class CustomerTest {

    @Mock
    Store<GameProduct> storeMock;

    @InjectMocks
    Customer<GameProduct> customer;

    @Test
    void purchase_succeeds_whenEnoughInvetory() {
        GameProduct playstation = GameProduct.PLAYSTATION;
        int quantity = 1;

        Mockito.when(storeMock.hasEnoughInventory(playstation, quantity)).thenReturn(true);

        boolean result = customer.purchase(playstation, 1);

        assertTrue(result);
        Mockito.verify(storeMock, Mockito.times(1)).removeInventory(playstation, quantity);
    }

    @Test
    void purchase_fails_WhenNotEnoughInventory() {
        GameProduct xbox = GameProduct.XBOX;
        int quantity = 10;

        Mockito.when(storeMock.hasEnoughInventory(xbox, quantity)).thenReturn(false);

        boolean result = customer.purchase(xbox, quantity);

        assertFalse(result);

        Mockito.verify(storeMock, Mockito.never()).removeInventory(xbox, quantity);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -10, -100})
    void purchase_returnFalse_whenQuantityIsZeroOrNegative(int invalidQuantity) {

        boolean result = customer.purchase(GameProduct.PLAYSTATION, invalidQuantity);

        assertFalse(result);

        Mockito.verify(storeMock, Mockito.never()).removeInventory(any(), anyInt());
    }

    @Test
    void purchase_Fails_WhenProductIsNull() {

        boolean result = customer.purchase(null, 10);

        assertFalse(result);

        Mockito.verify(storeMock, Mockito.never()).removeInventory(any(), anyInt());
    }
}