package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.test;

import academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotControl.RobotType;
import academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotState;
import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.domain.Robot;
import academy.devdojo.maratonajava.javacore.ZZH_designpatterns.enums.RobotEnergySource;

public class RobotBuilderTest {
    static void main() {
        Robot ns5 = new Robot.Builder(123, "Nestor 5")
                .robotEnergySource(RobotEnergySource.ELETRIC)
                .robotState(RobotState.ON)
                .robotType(RobotType.BATTLE)
                .build();

        Robot wallE = new Robot.Builder(002, "Wall-E")
                .robotEnergySource(RobotEnergySource.SOLAR)
                .robotState(RobotState.OFF)
                .build();

        System.out.println(ns5);
        System.out.println("--------------------");
        System.out.println(wallE);
    }
}
