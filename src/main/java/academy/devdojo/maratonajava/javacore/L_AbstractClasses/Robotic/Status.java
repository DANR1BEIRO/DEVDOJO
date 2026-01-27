package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public enum Status {
    ON("Robot is active and ready to perform tasks!"),
    OFF("Robot is powered down and not operational."),
    MAINTENANCE("Robot is temporarily unavailable for maintanace work.");

    protected String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


