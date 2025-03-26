package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;
/*
 * Create a class Car with the following attributes:
 *
 * name
 * model
 * year
 *
 * Then, create two distincts objects and print their value
 *
 * */

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Car;

public class Exercise01Car {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Toyota";
        car1.model = "Supra MK4";
        car1.year = 1994;

        car2.name = "Mustang";
        car2.model = "GT500 Eleanor";
        car2.year = 1967;

        System.out.println("Car 1:\nName: " + car1.name+"\nModel: "+car1.model+"\nYear: "+car1.year);
        System.out.println("\nCar 2:\nName: " + car2.name+"\nModel: "+car2.model+"\nYear: "+car2.year);
    }
}
