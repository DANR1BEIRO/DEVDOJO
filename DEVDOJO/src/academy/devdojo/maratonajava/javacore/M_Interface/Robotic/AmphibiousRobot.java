package academy.devdojo.maratonajava.javacore.M_Interface.Robotic;

public class AmphibiousRobot implements Flyer, Swimmer {

    @Override
    public void move() {
        System.out.println("Can fly and swim");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }
}
