package academy.devdojo.maratonajava.javacore.L_AbstractClasses.domain.Animal;

public abstract class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    abstract void hunt();
}
