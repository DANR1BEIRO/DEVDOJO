package academy.devdojo.maratonajava.javacore.L_AbstractClasses.domain.Animal;

public class StrayCat extends Cat {
    public StrayCat(String name) {
        super(name);
    }

    @Override
    void hunt() {
        System.out.println(name + ", the stray cat, is using its instincts to hunt.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ", the stray cat, is meowing");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
