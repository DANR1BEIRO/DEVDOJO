package academy.devdojo.maratonajava.javacore.J_FinalModifier.test;

import academy.devdojo.maratonajava.javacore.J_FinalModifier.domain.Buyer;
import academy.devdojo.maratonajava.javacore.J_FinalModifier.domain.Car;
import academy.devdojo.maratonajava.javacore.J_FinalModifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);
        car.BUYER.setName("Goku");
        System.out.println(car.BUYER);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo");
        ferrari.info();
    }
}
