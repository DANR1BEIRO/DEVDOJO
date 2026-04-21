package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.exception;

public class NullProductException extends RuntimeException {

    public NullProductException() {
        super("Product can't be null");
    }

    public NullProductException(String message) {
        super(message);
    }
}
