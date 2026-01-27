package academy.devdojo.maratonajava.javacore.K_Enum.domain;

public class RobotTest01 {
    public static void main(String[] args) {

        Robot robot1 = new Robot("Wall-E", RobotState.ON);
        Robot robot2 = new Robot("Eva", RobotState.IN_MAINTENANCE);
        Robot robot3 = new Robot("Optmus Prime", RobotState.OFF);

        System.out.println(robot1.state.getDescription());
        // output: The robot is active

        robot1.showStatus();
        robot2.showStatus();
        robot3.showStatus();
    }
}

