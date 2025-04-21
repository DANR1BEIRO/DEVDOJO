package academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotControl;

import java.util.Arrays;

public class Supervisor {
    private String name;
    private Robot[] robot;

    public Supervisor(String name) {
        this.name = name;
    }

    public Supervisor(String name, Robot[] robot) {
        this.name = name;
        this.robot = robot;
    }

    public void info() {
        System.out.println(this.name + " supervises the current robots:");
        for (Robot robots : robot) {
            System.out.println("____________________________");
            System.out.println("Robot type: " + robots.getType().getDescription());
            System.out.println("Name: " + robots.getName());
            System.out.println("Serial Number: " + robots.getSerialNumber());
            System.out.println("Energy source: " + robots.getEnergy().getDescription());
        }
    }

    public void printRobots() {
        System.out.println(this.name + " supervises the current robots:");
        for (Robot robots : robot) {
            System.out.println("____________________________");
            System.out.printf("""
                            Type: %s
                            Name: %s
                            Serial Number: %s
                            Energy source: %s%n""",
                    robots.getType().getDescription(),
                    robots.getName(),
                    robots.getSerialNumber(),
                    robots.getEnergy().getDescription());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robot[] getRobot() {
        return robot;
    }

    public void setRobot(Robot[] robot) {
        this.robot = robot;
    }
}
