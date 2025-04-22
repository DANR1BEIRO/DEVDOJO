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
        super.performTask();
    }

    @Override
    public void consumeBattery() {
        super.consumeBattery();
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
