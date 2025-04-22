package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public class Main {
    public static void main(String[] args) {

        DeliveryRobot deliveryRobot = new DeliveryRobot("Hermes", "HE-0102", 50, 15);
        CleaningRobot cleaningRobot = new CleaningRobot("Wall-E", "WE-0001", 50, 10);
        WelderRobot welderRobot = new WelderRobot("Sonny", "NS-5", 80, 30, "NASA", 90);
        AssemblerRobot assemblerRobot = new AssemblerRobot("Optmus Prime", "OP-9922", 80,30, "Tesla Brazil");

        Robot[] robots = {deliveryRobot, cleaningRobot, welderRobot,assemblerRobot};
        for(Robot robot : robots){
            robot.turnOn();
            robot.performTask();
            robot.rechargeBattery(20);
        }
    }
}
