package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public class AssemblerRobot extends IndustrialRobot {
    public AssemblerRobot(String name, String serialNumber, int batteryLevel, int batteryConsumption, Status status) {
        super(name, serialNumber, batteryLevel, batteryConsumption, status);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    public final boolean toolsAreReady() {
        return true;
    }

    /**
     * Safety method to check if the area is clear
     *
     * @return true if area is clear and safe to work, else false
     */
    @Override
    public boolean checkSafety() {
        boolean areaIsClear = true;
        return areaIsClear;
    }

    @Override
    public void performTask() {
        boolean allChecksPassed = true;

        if (batteryIsGreaterThan10()) {
            System.out.println("Battery level: PASSED");
        } else {
            System.out.println("Battery level: FAILED\n" + name + " doesn't have enough battery to complete this task! needs a recharge!");
            allChecksPassed = false;
        }

        if (checkSafety()) {
            System.out.println("Area is clear: PASSED");
        } else {
            System.out.println("Area is clear: FAILED");
            allChecksPassed = false;
        }
        if (toolsAreReady()) {
            System.out.println("Tools ready: PASSED");
        } else {
            System.out.println("Tools ready: FAILED");
            allChecksPassed = false;
        }

        if (allChecksPassed) {
            System.out.println("\nAll safety checks passed. Ready to assemble!");
            consumeBattery();

            System.out.println("This task consumed " + batteryConsumption + " units of the battery!" + "\nCurrent battery level: " + batteryLevel + " units");
        } else {
            System.out.println("Cannot start the task!");
        }
    }

    @Override
    public void runDiagnostic() {
        super.runDiagnostic();
    }

    @Override
    public String toString() {
        return "AssemblerRobot{" +
                "name='" + name + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", batteryLevel=" + batteryLevel +
                ", MAX_BATTERY_LEVEL=" + MAX_BATTERY_LEVEL +
                ", batteryConsumption=" + batteryConsumption +
                ", sector='" + sector + '\'' +
                '}';
    }
}
