package academy.devdojo.maratonajava.javacore.L_AbstractClasses.test;

import academy.devdojo.maratonajava.javacore.L_AbstractClasses.domain.Developer;
import academy.devdojo.maratonajava.javacore.L_AbstractClasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {

        Developer developer = new Developer("Kaneda", 5000);
        Manager manager = new Manager("Tetsuo", 10000);

        developer.CalculateSalaryBonus();
        manager.CalculateSalaryBonus();

        System.out.println(developer.toString());
        System.out.println(manager.toString());

        developer.test();
        manager.test();

    }
}
