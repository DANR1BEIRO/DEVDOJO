package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.singleton.test;

import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.singleton.domain.Aircraft;

public class AircraftTest01 {
    static void main() {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        Aircraft airCraft = new Aircraft("787");
        System.out.println(airCraft.bookSeat(seat));
    }
}
