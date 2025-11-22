package academy.devdojo.maratonajava.javacore.Z_Generics.service;

import academy.devdojo.maratonajava.javacore.Z_Generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentalServiceGenerics<T> {
    private List<T> availableVehicle;

    public RentalServiceGenerics(List<T> availableVehicle) {
        this.availableVehicle = availableVehicle;
    }

    public T rentVehicle() {
        System.out.println("Searching for an available vehicle...");
        T t = availableVehicle.remove(0);
        System.out.println("Rented vehicle: " + t);
        System.out.println("\nAvailable vehicles for rent:");
        System.out.println(availableVehicle);
        return t;
    }

    public void returnVehicle(T t) {
        System.out.println("\nReturning the rental vehicle: " + t);
        availableVehicle.add(t);
        System.out.println("Available vehicle for rent:");
        System.out.println(availableVehicle);
    }
}
