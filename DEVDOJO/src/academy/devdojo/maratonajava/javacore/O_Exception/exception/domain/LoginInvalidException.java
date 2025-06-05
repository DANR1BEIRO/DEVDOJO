package academy.devdojo.maratonajava.javacore.O_Exception.exception.domain;

public class LoginInvalidException extends Exception {
    public LoginInvalidException() {
        super("Invalid Login ");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
