package academy.devdojo.maratonajava.javacore.M_Interface.Robotic.test01;

public class PrintInstancesThatImplementedInterface {

    /**
     * Call all methods from MoverRobot interface
     * @param robot: A object whose class implements the MoverRobot interface
     */
    public static void generateFlyingReport(Robot robot) {
        System.out.println("Report for Flying");
        robot.turnOn();
        robot.move();
        robot.turnOff();
    }

    public static void generateSwimmingReport(Robot robot) {
        System.out.println("Report for Swimming");
        robot.turnOn();
        robot.move();
        robot.turnOff();
    }
}
