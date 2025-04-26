package academy.devdojo.maratonajava.javacore.M_Interface.Robotic.test01;

public class FlyingRobot implements MoverRobot {
    @Override
    public void turnOn() {
        System.out.println("flying robot is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("flying robot is turn off");
    }

    @Override
    public void move() {
        System.out.println("flying robot is flying");
    }
}
