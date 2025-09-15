package academy.devdojo.maratonajava.javacore.L_AbstractClasses.Robotic;

public abstract class ServiceRobot extends Robot {
    public ServiceRobot(String name, String serialNumber, int batteryLevel, int batteryConsumption, Status status) {
        super(name, serialNumber, batteryLevel, batteryConsumption, status);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public void rechargeBattery(int recharge) {
        super.rechargeBattery(recharge);
    }

    @Override
    public void performTask() {

    }

    @Override
    public void runDiagnostic() {
        System.out.println("Robot diagnostic: " + status);
    }
}
