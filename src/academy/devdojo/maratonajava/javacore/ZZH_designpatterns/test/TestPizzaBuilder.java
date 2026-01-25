package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.domain.Calzone;
import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.domain.NyPizza;

import static academy.devdojo.maratonajava.javacore.ZZH_designpatterns.domain.NyPizza.Size.SMALL;
import static academy.devdojo.maratonajava.javacore.ZZH_designpatterns.domain.Pizza.Topping.*;

public class TestPizzaBuilder {
    static void main() {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}
