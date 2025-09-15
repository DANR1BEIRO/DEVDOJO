package academy.devdojo.maratonajava.javacore.O_Exception.exception.test;

import academy.devdojo.maratonajava.javacore.O_Exception.exception.domain.Employee;
import academy.devdojo.maratonajava.javacore.O_Exception.exception.domain.LoginInvalidException;
import academy.devdojo.maratonajava.javacore.O_Exception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverridingWithExceptionsTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.save();
        } catch (LoginInvalidException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Employee employee = new Employee();
        employee.save();
    }
}
