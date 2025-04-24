package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public class CleaningRobot extends ServiceRobot {

    public CleaningRobot(String name, String serialNumber, int batteryLevel, int batteryConsumption, Status status) {
        super(name, serialNumber, batteryLevel, batteryConsumption, status);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void performTask() {
        if (batteryIsGreaterThan10()) {
            System.out.println(name + " is cleaning the room!");
            consumeBattery();
            System.out.println("This task consumed " + batteryConsumption + " units of the battery!" +
                    "\nCurrent battery level: " + batteryLevel + " units");
        } else {
            System.out.println(name + " doesn't have enough battery to complete this task! needs a recharge!");
        }
    }

    @Override
    public void runDiagnostic() {
        super.runDiagnostic();
    }

    @Override
    public String toString() {
        return "CleaningRobot{" +
                "name='" + name + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", batteryLevel=" + batteryLevel +
                ", MAX_BATTERY_LEVEL=" + MAX_BATTERY_LEVEL +
                ", batteryConsumption=" + batteryConsumption +
                '}';
    }
}
