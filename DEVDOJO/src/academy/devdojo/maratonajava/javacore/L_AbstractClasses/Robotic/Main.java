package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public class Main {
    public static void main(String[] args) {

        Robot deliveryRobot = new DeliveryRobot("Hermes", "HE-0102", 50, 15);
        Robot cleaningRobot = new CleaningRobot("Wall-E", "WE-0001", 50, 10);
        Robot welderRobot = new WelderRobot("Sonny", "NS-5", 80, 30, "NASA", 90);
        Robot assemblerRobot = new AssemblerRobot("Optmus Prime", "OP-9922", 80, 30, "Tesla Brazil");

        Robot[] robots = {deliveryRobot, cleaningRobot, welderRobot, assemblerRobot};
        for (Robot robot : robots) {
            robot.turnOn();
            robot.performTask();
            robot.rechargeBattery(20);
        }
    }
}
