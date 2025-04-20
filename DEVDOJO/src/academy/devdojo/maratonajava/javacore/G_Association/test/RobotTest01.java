package academy.devdojo.maratonajava.javacore.G_Association.test;

import academy.devdojo.maratonajava.javacore.G_Association.domain.Robot;
import academy.devdojo.maratonajava.javacore.G_Association.domain.Supervisor;

public class RobotTest01 {
    public static void main(String[] args) {

        Supervisor supervisor = new Supervisor("Dra. Susan Calvin");

        Robot robot1 = new Robot("Wall-E", supervisor);
        Robot robot2 = new Robot("Sonny", supervisor);
        Robot robot3 = new Robot("Optmus Prime", supervisor);

        robot1.info();
        robot2.info();
        robot3.info();



    }
}


