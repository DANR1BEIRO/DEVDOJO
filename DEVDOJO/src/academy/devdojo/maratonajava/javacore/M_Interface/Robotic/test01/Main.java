package academy.devdojo.maratonajava.javacore.M_Interface.Robotic.test01;

public class Main {
    public static void main(String[] args) {

        FlyingRobot flyingRobot = new FlyingRobot();
        SwimmingRobot swimmingRobot = new SwimmingRobot();
        PrintInstancesThatImplementedInterface printInstancesThatImplementedInterface = new PrintInstancesThatImplementedInterface();

        printInstancesThatImplementedInterface.testRobot(flyingRobot);
        printInstancesThatImplementedInterface.testRobot(swimmingRobot);
    }
}
