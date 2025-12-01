package academy.devdojo.maratonajava.javacore.Z_Generics.test;

import academy.devdojo.maratonajava.javacore.Z_Generics.domain.CleanerRobot;
import academy.devdojo.maratonajava.javacore.Z_Generics.domain.CombatRobot;
import academy.devdojo.maratonajava.javacore.Z_Generics.domain.Robot;

import java.util.ArrayList;
import java.util.List;

public class WildCardsTest01 {
    static void main(String[] args) {
        List<CleanerRobot> cleanerRobots = List.of(new CleanerRobot(), new CleanerRobot());
        List<CombatRobot> combatRobots = List.of(new CombatRobot(), new CombatRobot());

        printRobotSub(cleanerRobots);
        printRobotSub(combatRobots);

        List<Robot> listRobotSuper = new ArrayList<>();
        printRobotSuper(listRobotSuper);

    }

    /**
     * List<? extends Robot>
     * Produz Robots → você pode ler como Robot
     * Não recebe nada novo (não pode adicionar)
     */
    private static void printRobotSub(List<? extends Robot> robots) {
        for (Robot robot : robots) {
            robot.info();
        }
    }

    /**
     * List<? super Robot>
     * Consome Robots → você pode adicionar Robots
     * Não produz Robots → você não pode ler como Robot, só como Object
     */
    private static void printRobotSuper(List<? super Robot> robots) {
        robots.add(new CleanerRobot());
        robots.add(new CombatRobot());
        for (Object robot : robots) {
            if (robot instanceof Robot r) {
                r.info();
            }
        }
    }
}

/**
 * Regra de ouro dos wildcards:
 * <p>
 * “PECS”: Producer Extends, Consumer Super
 * <p>
 * Extends = Producer → a lista produz valores que você lê
 * Super = Consumer → a lista consome valores que você escreve
 * <p>
 * Aplicando:
 * <p>
 * List<? extends Robot>
 * Produz Robots → você pode ler como Robot
 * Não recebe nada novo (não pode adicionar)
 * <p>
 * List<? super Robot>
 * Consome Robots → você pode adicionar Robots
 * Não produz Robots → você não pode ler como Robot, só como Object
 */
