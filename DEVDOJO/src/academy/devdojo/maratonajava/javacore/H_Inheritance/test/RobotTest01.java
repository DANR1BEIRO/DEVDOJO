package academy.devdojo.maratonajava.javacore.H_Inheritance.test;

import academy.devdojo.maratonajava.javacore.H_Inheritance.domain.CleanerRobot;
import academy.devdojo.maratonajava.javacore.H_Inheritance.domain.Robot;
import academy.devdojo.maratonajava.javacore.H_Inheritance.domain.SecurityRobot;

public class RobotTest01 {
    public static void main(String[] args) {

        SecurityRobot securityRobot = new SecurityRobot("Sonny", "NS-5");
        securityRobot.info();
        securityRobot.powerOn();
        securityRobot.patrol();

        CleanerRobot cleanerRobot = new CleanerRobot("Vaccum cleaner", "VC-001");
        cleanerRobot.info();
        cleanerRobot.powerOn();
        cleanerRobot.clean();

    }
}
