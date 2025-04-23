package academy.devdojo.maratonajava.javacore.L_AbstractClasses.domain.Animal;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Rottweiler("Costela");
        Cat cat = new StrayCat("Gato");

        dog.makeSound();
        dog.sleep();

        cat.makeSound();
        cat.sleep();
    }
}
