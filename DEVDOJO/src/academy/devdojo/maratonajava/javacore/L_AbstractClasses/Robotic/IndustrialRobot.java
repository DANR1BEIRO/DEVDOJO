package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public abstract class IndustrialRobot extends Robot {
    protected String sector;

    public IndustrialRobot(String sector) {
        this.sector = sector;
    }

    public IndustrialRobot(String name, String serialNumber, int batteryLevel, int batteryConsumption, String sector) {
        super(name, serialNumber, batteryLevel, batteryConsumption);
        this.sector = sector;
    }

    public abstract boolean checkSafety();
}
