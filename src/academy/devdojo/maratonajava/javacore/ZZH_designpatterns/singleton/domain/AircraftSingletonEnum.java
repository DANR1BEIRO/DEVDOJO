package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.singleton.domain;

import java.util.HashSet;
import java.util.Set;

// enum por padrão é thread safe
// Não existe a opcao de utilizar reflection para alterar o construtor do enum

public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> availableSeats;

    AircraftSingletonEnum() {
        this.availableSeats = new HashSet<>();
        this.availableSeats.add("1A");
        this.availableSeats.add("1B");
    }

    // em uma situacão real o metodo bookSeat deveria ser sincronizado, do contrário
    // duas threads poderiam acessar a instancia desse enum ao mesmo tempo

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
