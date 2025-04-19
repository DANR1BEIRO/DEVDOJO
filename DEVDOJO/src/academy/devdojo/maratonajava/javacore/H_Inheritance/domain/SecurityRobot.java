package academy.devdojo.maratonajava.javacore.H_Inheritance.domain;

public class SecurityRobot extends Robot {

    public SecurityRobot() {
    }

    public SecurityRobot(String name, String serialNumber) {
        super(name, serialNumber);
    }

    @Override
    public void powerOn() {
        System.out.println(this.name +  " is powered on and activating security systems.");
    }

    public void patrol(){
        System.out.println(this.name + " is patrolling the area.");
    }
}
