package academy.devdojo.maratonajava.javacore.M_Interface.Robotic.test01;

public class Main {
    public static void main(String[] args) {

        Robot[] robots = {
                new FlyingRobot(),
                new LandRobot(),
                new SwimmingRobot()
        };

        for (Robot robot : robots) {
            System.out.println("______________________");
            robot.turnOn();
            robot.move();
            robot.turnOff();
        }
    }
}
