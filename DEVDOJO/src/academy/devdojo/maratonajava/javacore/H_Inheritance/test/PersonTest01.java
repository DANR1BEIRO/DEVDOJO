package academy.devdojo.maratonajava.javacore.H_Inheritance.test;

import academy.devdojo.maratonajava.javacore.H_Inheritance.domain.Address;
import academy.devdojo.maratonajava.javacore.H_Inheritance.domain.Employee;
import academy.devdojo.maratonajava.javacore.H_Inheritance.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {

        Address address = new Address();
        address.setStreet("Rua dos bobos");
        address.setZipCode("1234-56");

        Person person = new Person();
        person.setName("Vegeta");
        person.setAge(15);
        person.setAddress(address);
        person.info();

        System.out.println("_____________________");

        Employee employee = new Employee();
        employee.setName("Goku");
        employee.setAge(15);
        employee.setAddress(address);
        employee.setSalary(2500);
        employee.info();
    }
}
