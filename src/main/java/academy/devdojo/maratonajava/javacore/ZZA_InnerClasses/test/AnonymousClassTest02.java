package academy.devdojo.maratonajava.javacore.ZZA_InnerClasses.test;

import academy.devdojo.maratonajava.javacore.Z_Generics.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassTest02 {
    static void main() {
        List<Car> carList = new ArrayList<>(List.of(new Car("fusca"), new Car("Brasilia")));

        carList.sort(new Comparator<Car>() {
            @Override
            public int compare(Car car, Car t1) {
                return car.getName().compareTo(t1.getName());
            }
        });

        System.out.println(carList);
    }
}
