package academy.devdojo.maratonajava.javacore.F_StaticModifier.test;

import academy.devdojo.maratonajava.javacore.F_StaticModifier.domain.Robot;

public class RobotTest01 {
    public static void main(String[] args) {

        System.out.println("Default Species: " + Robot.getEspecie());
        System.out.println("Initial total robots: " + Robot.getTotalRobotCreated());

        System.out.println("\n-----Creating Robots-----");
        Robot robot1 = new Robot("R2D2", "white and blue", "R2-1138");
        Robot robot2 = new Robot("Wall-E", "Rusty brown", "WE-9910");
        Robot robot3 = new Robot("Nestor", "Gray", "NS-5");
        Robot robot4 = new Robot("Ultron", "Silver", "UT-3345");

        String total = Robot.totalRobotCreated();

        robot1.info();
        robot2.info();
        robot3.info();
        robot4.info();

        System.out.println(total);

    }
}
