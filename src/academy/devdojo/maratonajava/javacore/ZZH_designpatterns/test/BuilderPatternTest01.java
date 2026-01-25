package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.domain.Person;

public class BuilderPatternTest01 {
    static void main() {
        /**
         * Builder Pattern is used when we have several attributes to be initialize
         */
        Person person = Person.Builder
                .builder()
                .firstName("Goku")
                .lastName("son")
                .username("ssjgod")
                .email("ssjgod@gmail.com")
                .build();

        System.out.println(person);
    }
}
