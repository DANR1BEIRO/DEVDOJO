package academy.devdojo.maratonajava.javacore.O_Exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Inside ArithmeticException");
        } catch (RuntimeException e) { // The most generic exception must be in the final catch
            System.out.println("Inside RuntimeException");
        }

        try {
            mayThrowException();
        } catch (SQLException e) {

        } catch (FileNotFoundException e) {

        }
    }

    private static void mayThrowException() throws SQLException, FileNotFoundException {

    }
}

/**
 * The multiple catches are useful when we have to handle the exceptions differently.
 * Otherwise, we can have the most generic one.
 */
