package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

import java.util.ArrayList;
import java.util.List;

public class ControlCenter {
    protected List<Robot> robots;

    public ControlCenter() {
        this.robots = new ArrayList<>();
    }

    public void addRobots(Robot robot) {
        robots.add(robot);
        System.out.println("Robot added successfully!");
        System.out.println(robot.toString());
    }

    public void turnAllRobotsOn() {
        System.out.println("_________________________________________");
        System.out.println("Turning on all robots:");
        for (Robot robot : robots) {
            robot.turnOn();
        }
        System.out.println("All robots have been turned on!");
    }

    public void turnAllRobotsOff() {
        System.out.println("__________________________________________");
        System.out.println("Turning off all robots:");
        for (Robot robot : robots) {
            robot.turnOff();
        }
        System.out.println("All robots have been turned off!");
    }

    public void performTaskOnAll() {
        System.out.println("__________________________________________");
        System.out.println("\nPerforming tasks:");
        for (Robot robot : robots) {
            System.out.println(" ");
            robot.performTask();
        }
    }

    public void showAllRobotsStatus() {
        System.out.println("__________________________________________");
        for (Robot robot : robots) {
            System.out.println(robot.name + " status: " + robot.status.getDescription());
        }
    }
}
