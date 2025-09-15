package academy.devdojo.maratonajava.javacore.L_AbstractClasses.domain.Animal;

public abstract class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    abstract void takeTheBall();
}
