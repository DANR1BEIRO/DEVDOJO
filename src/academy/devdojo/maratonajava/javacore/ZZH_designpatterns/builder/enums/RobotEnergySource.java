package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.builder.enums;

public enum RobotEnergySource {
    ELETRIC("Eletric Robot"),
    SOLAR("Solar Robot"),
    STEAM("Steam Robot");

    private String description;

    RobotEnergySource(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
