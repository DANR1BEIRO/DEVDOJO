package academy.devdojo.maratonajava.javacore.Z_Generics.test;

import academy.devdojo.maratonajava.javacore.Z_Generics.domain.Car;
import academy.devdojo.maratonajava.javacore.Z_Generics.service.CarRentalService;

public class GenericClassRentalCarTest01 {
    static void main() {
        Car rentCar = CarRentalService.rentCar();
        System.out.println("Using the car for 1 month...");
        CarRentalService.returnCar(rentCar);
    }
}
