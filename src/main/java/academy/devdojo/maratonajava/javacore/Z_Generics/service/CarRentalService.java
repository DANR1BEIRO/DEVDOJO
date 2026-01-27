package academy.devdojo.maratonajava.javacore.Z_Generics.service;

import academy.devdojo.maratonajava.javacore.Z_Generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRentalService {
    private static List<Car> availableCars = new ArrayList<>(List.of(new Car("fusca"), new Car("brasilia")));

    public static Car rentCar() {
        System.out.println("Searching for an available car...");
        Car car = availableCars.remove(0);
        System.out.println("Rented car: " + car);
        System.out.println("Available cars for rent:");
        System.out.println(availableCars);
        return car;
    }

    public static void returnCar(Car car) {
        System.out.println("Returning the rental car: " + car);
        availableCars.add(car);
        System.out.println("Available cars for rent:");
        System.out.println(availableCars);
    }
}


