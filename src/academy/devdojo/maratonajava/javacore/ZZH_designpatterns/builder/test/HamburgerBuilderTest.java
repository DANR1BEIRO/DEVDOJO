package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.builder.test;

import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.builder.domain.Hamburger;

public class HamburgerBuilderTest {
    static void main() {
        Hamburger hamburger = Hamburger.Builder.builder("pão de forma", "carne de camelo")
                .cheese("mussarela")
                .lettuce("alface do himalaia")
                .build();

        System.out.println(hamburger);
    }
}