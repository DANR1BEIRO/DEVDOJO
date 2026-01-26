package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.singleton.test;

import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.singleton.domain.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    static void main() {

        bookSeat("1A");
        bookSeat("1A");

    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
