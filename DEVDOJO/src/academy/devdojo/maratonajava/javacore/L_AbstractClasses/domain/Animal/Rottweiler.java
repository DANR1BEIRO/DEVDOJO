package academy.devdojo.maratonajava.javacore.L_AbstractClasses.domain.Animal;

public class Rottweiler extends Dog {
    public Rottweiler(String name) {
        super(name);
    }

    @Override
    public void takeTheBall() {
        System.out.println(name + ", the rotweiler, run faster and take the ball");

    }

    @Override
    public void makeSound() {
        System.out.println(name + ", the rottweiler, let out a scared bark!");

    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
