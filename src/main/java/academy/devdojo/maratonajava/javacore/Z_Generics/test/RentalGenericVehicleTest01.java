package academy.devdojo.maratonajava.javacore.Z_Generics.test;

import academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotControl.Energy;
import academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotControl.Robot;
import academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotControl.RobotType;
import academy.devdojo.maratonajava.javacore.Z_Generics.service.RentalServiceGenerics;

import java.util.ArrayList;
import java.util.List;

public class RentalGenericVehicleTest01 {
    static void main(String[] args) {
        List<Robot> availableRobot = new ArrayList<>(
                List.of(
                        new Robot("Wall-E", "000", Energy.SOLAR, RobotType.CLEANER),
                        new Robot("Eva","001", Energy.ELETRICITY, RobotType.BATTLE),
                        new Robot("Mega-man", "002", Energy.PLASMA, RobotType.BATTLE)));

        RentalServiceGenerics<Robot> rentalServiceGenerics = new RentalServiceGenerics<>(availableRobot);
        Robot robot = rentalServiceGenerics.rentVehicle();
        System.out.println("Robot rented for 2 weeks... ");
        rentalServiceGenerics.returnVehicle(robot);
    }
}
