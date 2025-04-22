package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public class Main {
    public static void main(String[] args) {

        DeliveryRobot deliveryRobot = new DeliveryRobot("Hermes", "HE-0102", -3999, 10);
        CleaningRobot cleaningRobot = new CleaningRobot("Wall-E", "WE-0001", 50, 25);

        deliveryRobot.turnOn();
        deliveryRobot.performTask();
        deliveryRobot.rechargeBattery(20);

        System.out.println("");

        cleaningRobot.turnOn();
        cleaningRobot.performTask();
    }
}
