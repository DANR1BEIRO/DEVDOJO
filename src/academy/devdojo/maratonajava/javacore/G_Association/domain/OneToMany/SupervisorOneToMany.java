package academy.devdojo.maratonajava.javacore.G_Association.domain.OneToMany;

public class SupervisorOneToMany {
    private String name;
    private RobotOneToMany[] robotSupervised;

    public SupervisorOneToMany(String name, RobotOneToMany[] robotSupervised) {
        this.name = name;
        this.robotSupervised = robotSupervised;
    }

    public void info() {
        System.out.println("Dr. " + this.name + " supervises the robots:");
        for (RobotOneToMany robots : robotSupervised) {
            System.out.println(robots.getName() + " - " + robots.getSerialNumber());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RobotOneToMany[] getRobotSupervised() {
        return robotSupervised;
    }

    public void setRobotSupervised(RobotOneToMany[] robotSupervised) {
        this.robotSupervised = robotSupervised;
    }
}
