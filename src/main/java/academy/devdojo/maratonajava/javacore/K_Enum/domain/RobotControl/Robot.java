package academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotControl;

public class Robot {
    private String name;
    private final String serialNumber;
    private Energy energy;
    private RobotType type;

    public Robot(String name, String serialNumber, Energy energy, RobotType type) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.energy = energy;
        this.type = type;
    }

    public Robot(String name, String serialNumber, Energy energy) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.energy = energy;
    }

    @Override
    public String toString() {
        return String.format("""
                        \n----------------------
                        Name: %s
                        Type: %s                 
                        Serial Number: %s
                        Energy source: %s
                        ----------------------\n""",
                name, type, serialNumber, energy);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Energy getEnergy() {
        return energy;
    }

    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    public RobotType getType() {
        return type;
    }
}
