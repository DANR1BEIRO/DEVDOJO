package academy.devdojo.maratonajava.javacore.Z_Generics.test;

import java.util.List;

public class GenericMethodsTest02 {
    static void main() {
        System.out.println("Maior int: " + retornaOMaior(5, 1000));
        System.out.println("Maior double: " + retornaOMaior(5.23, 6.01));
        System.out.println("Maior String: " + retornaOMaior("Goku", "Vegeta"));
        System.out.println("---------------------");

        animalMakeSound(List.of(new Dog(), new Cat(), new Animal()));
    }

    /**
     * Exercício 1 – Bounded Generics
     * <p>
     * Crie um metodo genérico <T extends Comparable<T>> que receba dois
     * elementos e retorne o maior deles.
     */
    public static <T extends Comparable<T>> T retornaOMaior(T t1, T t2) {
        return t1.compareTo(t2) > 0 ? t1 : t2;
    }

    /**
     * Exercício 2 – ? extends
     * <p>
     * Crie:
     * Uma classe Animal
     * Subclasses Dog e Cat
     * Um metodo que receba List<? extends Animal> e imprima ações de todos os animais.
     */

    public static void animalMakeSound(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

}


class Animal {
    public void makeSound() {
        System.out.println("Animal making sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("cachorro latindo");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("gato miando");
    }
}
