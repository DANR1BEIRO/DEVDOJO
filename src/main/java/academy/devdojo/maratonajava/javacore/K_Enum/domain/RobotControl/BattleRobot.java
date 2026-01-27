package academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotControl;

public class BattleRobot extends Robot {
    public BattleRobot(String name, String serialNumber, Energy energy, RobotType type) {
        super(name, serialNumber, energy, type);
    }

    public BattleRobot(String name, String serialNumber, Energy energy) {
        super(name, serialNumber, energy);
    }
}
