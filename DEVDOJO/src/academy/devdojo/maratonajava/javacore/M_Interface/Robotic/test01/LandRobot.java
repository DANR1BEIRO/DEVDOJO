package academy.devdojo.maratonajava.javacore.M_Interface.Robotic.test01;

public class LandRobot implements Robot {
    @Override
    public void turnOn() {
        System.out.println("Landing robot is turn on");

    }

    @Override
    public void turnOff() {
        System.out.println("Landing robot is turn off");

    }

    @Override
    public void move() {
        System.out.println("Land robot is moving");

    }
}
