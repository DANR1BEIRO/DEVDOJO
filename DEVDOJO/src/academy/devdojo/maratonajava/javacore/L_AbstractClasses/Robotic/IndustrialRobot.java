package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public abstract class IndustrialRobot extends Robot {
    protected String sector;

    public IndustrialRobot(String name, String serialNumber, int batteryLevel, int batteryConsumption, Status status) {
        super(name, serialNumber, batteryLevel, batteryConsumption, status);
    }

    @Override
    public void runDiagnostic() {
        System.out.println("Robot diagnostic: " + status.ON.description);
    }

    public abstract boolean checkSafety();
}
