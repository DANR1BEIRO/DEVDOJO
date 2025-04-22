package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public abstract class Robot {
    protected String name;
    protected String serialNumber;
    protected int batteryLevel;
    protected final int MAX_BATTERY_LEVEL = 100;
    protected int batteryConsumption;

    public Robot() {
    }

    public Robot(String name, String serialNumber, int batteryLevel, int batteryConsumption) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.batteryLevel = (batteryLevel < 0) ? 0 : batteryLevel;
        this.batteryConsumption = batteryConsumption;
    }

    public void turnOn() {
        if (batteryLevel <= 0) {
            System.out.println("Can't turn on! " + name + "'s battery has run out!");
        } else {
            System.out.println("_______________________");
            System.out.println(name + " turned on!");
        }
    }

    public final boolean batteryIsGreaterThan10() {
        boolean result = (batteryLevel > 10) ? true : false;
        return result;
    }

    public void rechargeBattery(int recharge) {
        if (batteryLevel == MAX_BATTERY_LEVEL) {
            System.out.println(name + "'s battery is already charged! ");
            return;
        }

        int previousBatteryLevel = batteryLevel;
        batteryLevel += recharge;

        if (batteryLevel > MAX_BATTERY_LEVEL) {
            batteryLevel = MAX_BATTERY_LEVEL;
        }

        int totalRecharged = batteryLevel - previousBatteryLevel;

        if (batteryLevel == MAX_BATTERY_LEVEL) {
            System.out.println(name + "'s battery has been fully recharged!");
        } else {
            System.out.println(name + "'s battery recharged by " + totalRecharged +
                    " units. Current battery level: " + batteryLevel + "/" + MAX_BATTERY_LEVEL);
        }
    }

    public abstract void performTask();

    public final void consumeBattery() {
        batteryLevel -= batteryConsumption;
        batteryLevel = (batteryLevel < 0) ? 0 : batteryLevel;
    }
}
