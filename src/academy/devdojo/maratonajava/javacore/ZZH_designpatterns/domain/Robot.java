package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.domain;

import academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotControl.RobotType;
import academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotState;
import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.enums.RobotEnergySource;

public class Robot {
    private final long id;
    private final String name;
    private final RobotEnergySource robotEnergySource;
    private final RobotType robotType;
    private final RobotState robotState;

    private Robot(Builder builder) {
        id = builder.id;
        name = builder.name;
        robotEnergySource = builder.robotEnergySource;
        robotType = builder.robotType;
        robotState = builder.robotState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Robot\n").append("ID: " + id).append("\nName: " + name);
        appendIfNotNull(sb, "\nEnergy source: ", robotEnergySource != null ? robotEnergySource.getDescription() : null);
        appendIfNotNull(sb, "\nRobot Type: ", robotType != null ? robotType.getDescription() : null);
        appendIfNotNull(sb, "\nRobot state: ", robotState != null ? robotState.getDescription() : null);
        return sb.toString();
    }

    private void appendIfNotNull(StringBuilder sb, String prefix, String description) {
        if (description != null) {
            sb.append(prefix).append(description);
        }
    }

    public static class Builder {
        private final long id;
        private final String name;
        private RobotEnergySource robotEnergySource;
        private RobotType robotType;
        private RobotState robotState;

        public Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder robotEnergySource(RobotEnergySource robotEnergySource) {
            this.robotEnergySource = robotEnergySource;
            return this;
        }

        public Builder robotType(RobotType robotType) {
            this.robotType = robotType;
            return this;
        }

        public Builder robotState(RobotState robotState) {
            this.robotState = robotState;
            return this;
        }

        public Robot build() {
            return new Robot(this);
        }
    }
}
