package academy.devdojo.maratonajava.javacore.F_StaticModifier.domain;

public class Robot {
    private String name;
    private String color;
    private String serialNumber;
    private static int totalRobotCreated = 0;
    private static final String ESPECIE = "helper robot";
    // final usado para definir uma CONSTANTE (seu valor nunca poderá ser modificado)

    public Robot() {
    }

    public Robot(String name, String color, String serialNumber) {
        this.name = name;
        this.color = color;
        this.serialNumber = serialNumber;
        // Toda vez que um objeto é criado, a variável totalRobotCreated é incrementada
        Robot.totalRobotCreated++;
    }

    public void info() {
        System.out.println("____________________________");
        System.out.println("Robot name: " + this.name);
        System.out.println("Robot color: " + this.color);
        System.out.println("Robot serial number: " + this.serialNumber);
        System.out.println("Robot especie: " + ESPECIE);

    }

    public static String totalRobotCreated() {
        return "____________________________\nTotal robot created: " + totalRobotCreated;
    }

    public static int getTotalRobotCreated() {
        return totalRobotCreated;
    }

    public static String getEspecie() {
        return ESPECIE;

    }

}
