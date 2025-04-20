package academy.devdojo.maratonajava.javacore.G_Association.domain;

public class Robot {
    public String name;
    public Supervisor supervisor;
    public RobotEnergy energy;

    public void info() {
        System.out.println("______________________________________________________");
        String energyType = this.energy.getEnergy();
        String energyPhrase = energyType.equalsIgnoreCase("electricity")
                ? "electricity"
                : energyType + " energy";

        System.out.println("Robot " + this.name + " is powered by " + energyPhrase + "." +
                "\nSupervisedy by " + this.supervisor.getName());
    }

    public Robot(String name, Supervisor supervisor) {
        this.name = name;
        this.supervisor = supervisor;
    }

    public Robot(String name, Supervisor supervisor, RobotEnergy energy) {
        this.name = name;
        this.supervisor = supervisor;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }
}




