package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// MethodName_State_ExpectedBehavior
@ExtendWith(MockitoExtension.class)
class CustomerTest {

    @Mock
    Store storeMock;

    @InjectMocks
    Customer customer;

    @Test
    void purchase_succeeds_whenEnoughInvetory() {
        GameProduct playstation = GameProduct.PLAYSTATION;
        int quantity = 1;

        Mockito.when(storeMock.hasEnoughInventory(playstation, quantity)).thenReturn(true);

        boolean result = customer.purchase(playstation, 1);

        Assertions.assertTrue(result);
        Mockito.verify(storeMock, Mockito.times(1)).removeInventory(playstation, quantity);
    }
}