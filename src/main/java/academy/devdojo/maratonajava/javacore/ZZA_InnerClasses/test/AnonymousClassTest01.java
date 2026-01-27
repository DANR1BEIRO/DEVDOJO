package academy.devdojo.maratonajava.javacore.ZZA_InnerClasses.test;

/**
 * Classes que existirão por um determinado período no código
 * e que não podem ser reutilizadas em nenhum outro contexto
 */
class Animal {
    void walk() {
        System.out.println("Animal walking");
    }
}

public class AnonymousClassTest01 {
    static void main() {
        Animal animal = new Animal() {
            @Override
            void walk() {
                System.out.println("Walking na classe anonima");
                jump();
            }

            void jump() {
                System.out.println("jumping na classe anonima");
            }
        };
        animal.walk();
    }
}
