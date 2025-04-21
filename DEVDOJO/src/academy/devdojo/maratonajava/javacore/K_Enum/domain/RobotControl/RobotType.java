package academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotControl;

public enum RobotType {
    BATTLE("Battle robot"),
    CLEANER("Cleaner robot");

    private final String description;

    RobotType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

