package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public class DeliveryRobot extends Robot {

    public DeliveryRobot(String name, String serialNumber, int batteryLevel, int batteryConsumption) {
        super(name, serialNumber, batteryLevel, batteryConsumption);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void performTask() {
        if (batteryIsGreaterThan10()) {
            System.out.println(name + " is going to deliver a package!");
            consumeBattery();
            System.out.println("This task consumed " + batteryConsumption + " units of the battery!" +
                    "\nCurrent battery level: " + batteryLevel + " units");
        } else {
            System.out.println(name + " doesn't have enough battery to complete this task! needs a recharge!");
        }
    }

    @Override
    public String toString() {
        return "DeliveryRobot{" +
                "name='" + name + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", batteryLevel=" + batteryLevel +
                ", MAX_BATTERY_LEVEL=" + MAX_BATTERY_LEVEL +
                ", batteryConsumption=" + batteryConsumption +
                '}';
    }
}
