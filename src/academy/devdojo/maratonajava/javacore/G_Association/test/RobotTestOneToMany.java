package academy.devdojo.maratonajava.javacore.G_Association.test;

import academy.devdojo.maratonajava.javacore.G_Association.domain.OneToMany.RobotOneToMany;
import academy.devdojo.maratonajava.javacore.G_Association.domain.OneToMany.SupervisorOneToMany;

public class RobotTestOneToMany {
    public static void main(String[] args) {

        RobotOneToMany robot1 = new RobotOneToMany("Sonny", "NS-05");
        RobotOneToMany robot2 = new RobotOneToMany("Wall-E", "WE-002");
        RobotOneToMany robot3 = new RobotOneToMany("Vaccum Cleaner", "VC-001");

        RobotOneToMany[] robots = {robot1, robot2, robot3};

        SupervisorOneToMany supervisor = new SupervisorOneToMany("Susan Calvin", robots);
        supervisor.info();


    }
}
