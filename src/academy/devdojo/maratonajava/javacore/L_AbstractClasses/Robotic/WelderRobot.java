package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public class WelderRobot extends IndustrialRobot {
    protected int systemTemperature;
    protected final int MAX_SYSTEM_TEMPERATURE = 100;

    public WelderRobot(String name, String serialNumber, int batteryLevel, int batteryConsumption, Status status) {
        super(name, serialNumber, batteryLevel, batteryConsumption, status);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    /**
     * A safety method to check the temperature level
     *
     * @return true if temperature is greater than max temperature, else false
     */
    @Override
    public boolean checkSafety() {
        boolean result = (systemTemperature >= MAX_SYSTEM_TEMPERATURE) ? true : false;
        return result;
    }

    @Override
    public void performTask() {
        if (!batteryIsGreaterThan10()) {
            System.out.println(name + " doesn't have enough battery to complete this task! needs a recharge!");
            return;
        }
        if (checkSafety()) {
            System.out.println(name + " is overheated! Cooling is required!");
            return;
        }
        System.out.println(name + " is welding metal parts!");
        consumeBattery();

        System.out.println("This task consumed " + batteryConsumption + " units of the battery!" +
                "\nCurrent battery level: " + batteryLevel + " units");
    }

    @Override
    public void runDiagnostic() {
        super.runDiagnostic();
    }

    @Override
    public String toString() {
        return "WelderRobot{" +
                "name='" + name + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", batteryLevel=" + batteryLevel +
                ", MAX_BATTERY_LEVEL=" + MAX_BATTERY_LEVEL +
                ", batteryConsumption=" + batteryConsumption +
                ", sector='" + sector + '\'' +
                '}';
    }
}
