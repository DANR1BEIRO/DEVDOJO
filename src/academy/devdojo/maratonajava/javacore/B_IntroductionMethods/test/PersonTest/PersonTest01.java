package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.test.PersonTest;

import academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain.Person.Person;

public class PersonTest01 {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Jyraiya");
        person.setAge(70);
        //person.print();
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
