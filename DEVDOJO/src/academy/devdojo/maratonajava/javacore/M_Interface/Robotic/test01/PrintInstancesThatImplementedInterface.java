package academy.devdojo.maratonajava.javacore.M_Interface.Robotic.test01;

public class PrintInstancesThatImplementedInterface {

    /**
     * Call all methods from MoverRobot interface
     * @param robot: A object whose class implements the MoverRobot interface
     */
    public void testRobot(MoverRobot robot) {

        System.out.println("__________________________");
        robot.turnOn();
        robot.move();
        robot.turnOff();
        System.out.println("__________________________");
    }
}
