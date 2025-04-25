package academy.devdojo.maratonajava.javacore.M_Interface.Robotic.test;

public class Swimming implements MoverRobot {
    @Override
    public void turnOn() {
        System.out.println("swimming robot is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("swimming robot is turn off");
    }

    @Override
    public void move() {
        System.out.println("swimming robot is swim");
    }
}
