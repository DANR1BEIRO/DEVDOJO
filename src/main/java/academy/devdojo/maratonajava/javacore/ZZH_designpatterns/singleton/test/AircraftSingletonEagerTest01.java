package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.singleton.test;

import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.singleton.domain.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    static void main() {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEager.getInstance());
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getInstance();
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
