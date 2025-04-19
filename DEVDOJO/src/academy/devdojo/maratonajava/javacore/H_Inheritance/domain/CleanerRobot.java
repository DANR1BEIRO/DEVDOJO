package academy.devdojo.maratonajava.javacore.H_Inheritance.domain;

public class CleanerRobot extends Robot {

    public CleanerRobot() {
    }

    public CleanerRobot(String name, String serialNumber) {
        super(name, serialNumber);
    }

    @Override
    public void powerOn() {
        System.out.println(this.name + " is powered on and activating cleaner systems.");
    }

    public void clean () {
        System.out.println(this.name + " is cleaning the area.");
    }
}
