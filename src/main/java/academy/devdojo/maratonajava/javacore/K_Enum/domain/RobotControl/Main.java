package academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotControl;

public class Main {
    public static void main(String[] args) {

        BattleRobot megaman = new BattleRobot("Mega man", "MM-001", Energy.PLASMA, RobotType.BATTLE);
        BattleRobot eva = new BattleRobot("Eva", "EV-345", Energy.SOLAR, RobotType.BATTLE);
        BattleRobot optimusPrime = new BattleRobot("Optimus Prime", "OP-0001", Energy.ELETRICITY, RobotType.BATTLE);
        BattleRobot[] battleRobots = {megaman, eva, optimusPrime};

        Supervisor light = new Supervisor("Dr. Light", battleRobots);
        light.printRobots();
    }
}
