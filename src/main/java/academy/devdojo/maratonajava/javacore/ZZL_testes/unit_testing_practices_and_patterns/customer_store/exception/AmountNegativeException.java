package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.exception;

public class AmountNegativeException extends RuntimeException {

    public AmountNegativeException() {
        super("Amount can't be negative");
    }

    public AmountNegativeException(String message) {
        super(message);
    }
}
