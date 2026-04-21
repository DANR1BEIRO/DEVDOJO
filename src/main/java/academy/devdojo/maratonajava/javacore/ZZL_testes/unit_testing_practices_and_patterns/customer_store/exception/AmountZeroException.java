package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.exception;

public class AmountZeroException extends RuntimeException {


    public AmountZeroException() {
        super("Amount can't be zero");
    }

    public AmountZeroException(String message) {
        super(message);
    }
}
