package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public class Main {
    public static void main(String[] args) {

        ControlCenter center = new ControlCenter();

        Robot deliveryRobot = new DeliveryRobot("Hermes", "HE-0102", 50, 15, Status.OFF);
        Robot cleaningRobot = new CleaningRobot("Wall-E", "WE-0001", 50, 10, Status.MAINTENANCE);
        Robot welderRobot = new WelderRobot("Sonny", "NS-5", 80, 30, Status.OFF);
        Robot assemblerRobot = new AssemblerRobot("Optmus Prime", "OP-9922", 80, 30, Status.MAINTENANCE);

        Robot[] robots = {deliveryRobot, cleaningRobot, welderRobot, assemblerRobot};

        System.out.println("Adding robots:");
        for (Robot robot : robots) {
            center.addRobots(robot);
        }
        center.showAllRobotsStatus();
        center.turnAllRobotsOn();
        center.showAllRobotsStatus();
        center.performTaskOnAll();
        center.turnAllRobotsOff();
        center.showAllRobotsStatus();
    }
}

