package academy.devdojo.maratonajava.javacore.K_Enum.domain;

public class Robot {
    public String name;
    public RobotState state; // The robot's state is of enum                                           type

    public Robot(String name, RobotState state) {
        this.name = name;
        this.state = state;
    }

    public void showStatus() {
        switch (state) {
            case ON:
                System.out.println("Robot is working!");
                break;
            case OFF:
                System.out.println("Robot is turned off.");
                break;
            case IN_MAINTENANCE:
                System.out.println("Robot is under maintenance.");
                break;
        }
    }
}



