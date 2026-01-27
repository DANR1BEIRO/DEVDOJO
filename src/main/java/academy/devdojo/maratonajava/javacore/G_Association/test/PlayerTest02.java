package academy.devdojo.maratonajava.javacore.G_Association.test;

import academy.devdojo.maratonajava.javacore.G_Association.domain.Player;
import academy.devdojo.maratonajava.javacore.G_Association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team = new Team("Selecão Brasileira");

        player1.setTeam(team);
        player1.print();
    }
}
