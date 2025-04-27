package academy.devdojo.maratonajava.javacore.M_Interface.Robotic.test01;

public class Main {
    public static void main(String[] args) {

        Robot flyingRobot = new FlyingRobot();
        Robot swimmingRobot = new SwimmingRobot();
        Robot landRobot = new LandRobot();

        Robot[] robots = {
                flyingRobot,
                swimmingRobot,
                landRobot
        };

        for (Robot robot : robots) {
            System.out.println("______________________");
            System.out.println("Inside the for loop:");
            robot.turnOn();
            robot.move();
            robot.turnOff();
        }
    }
}
