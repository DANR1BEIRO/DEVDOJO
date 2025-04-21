package academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotControl;

public enum Energy {
    SOLAR("uses solar energy."),
    ELETRICITY("uses eletricity."),
    PLASMA("uses plasma energy.");

    private final String description;

    Energy(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
