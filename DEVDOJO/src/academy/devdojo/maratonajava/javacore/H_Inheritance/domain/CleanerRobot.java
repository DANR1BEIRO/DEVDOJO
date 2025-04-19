package academy.devdojo.maratonajava.javacore.H_Inheritance.domain;

public class CleanerRobot extends Robot {

    public CleanerRobot() {
    }

    public CleanerRobot(String name, String serialNumber) {
        super(name, serialNumber);
    }

    public void clean () {
        System.out.println(this.getName() + " is cleaning the area.");
    }
}
