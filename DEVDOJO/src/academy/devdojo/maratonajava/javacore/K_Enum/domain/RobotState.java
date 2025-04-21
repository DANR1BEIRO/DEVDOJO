package academy.devdojo.maratonajava.javacore.K_Enum.domain;


public enum RobotState {
    ON("The robot is active"),
    OFF("The robot is turned off"),
    IN_MAINTENANCE("The robot is under maintenance");

    private String description;

    RobotState(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


