package academy.devdojo.maratonajava.javacore.H_Inheritance.domain;

public class Robot {
    private String name;
    private String serialNumber;

    public Robot() {
    }

    public Robot(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public void info() {
        System.out.println("______________");
        System.out.println("Robot created:");
        System.out.println("Name: " + this.name);
        System.out.println("Serial number: " + this.serialNumber);

    }

    public void powerOn() {
        System.out.println(this.name + " powered on!");
    }

    public void powerOff() {
        System.out.println(this.name + " powered off!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
