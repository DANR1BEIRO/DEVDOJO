package academy.devdojo.maratonajava.javacore.ZZB_BehaviorParameterization.test;

import academy.devdojo.maratonajava.javacore.ZZB_BehaviorParameterization.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterizationTest01 {
    static List<Car> carList = new ArrayList<>(List.of(new Car("green", 1991), new Car("red", 2000), new Car("black", 2025)));


    static void main() {
        List<Car> greenCars = filter(carList, car -> car.getColor().equals("green"));
        System.out.println(greenCars);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }
}
