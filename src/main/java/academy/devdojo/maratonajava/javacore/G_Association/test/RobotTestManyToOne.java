package academy.devdojo.maratonajava.javacore.G_Association.test;

import academy.devdojo.maratonajava.javacore.G_Association.domain.ManyToOne.RobotManyToOne;
import academy.devdojo.maratonajava.javacore.G_Association.domain.ManyToOne.RobotEnergy;
import academy.devdojo.maratonajava.javacore.G_Association.domain.ManyToOne.Supervisor;

public class RobotTestManyToOne {
    public static void main(String[] args) {

        RobotEnergy solar = new RobotEnergy("solar");
        RobotEnergy eletric = new RobotEnergy("electricity");

        Supervisor supervisor = new Supervisor("Dra. Susan Calvin");

        RobotManyToOne robot1 = new RobotManyToOne("Wall-E", supervisor, solar);
        RobotManyToOne robot2 = new RobotManyToOne("Sonny", supervisor, solar);
        RobotManyToOne robot3 = new RobotManyToOne("Optmus Prime", supervisor, eletric);

        robot1.info();
        robot2.info();
        robot3.info();



    }
}


