package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.singleton.domain;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    // Singleton: sempre deixar o construtor privado
    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    // Utilizar synchronized na assinatura do metodo pode afetar a performance
    // aon invés disso, recomenda-se que se faca um double lock
    public static AircraftSingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("SINGLETONLAZY");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}