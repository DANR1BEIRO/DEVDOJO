package academy.devdojo.maratonajava.javacore.G_Association.test;

import academy.devdojo.maratonajava.javacore.G_Association.domain.Ninja;
import academy.devdojo.maratonajava.javacore.G_Association.domain.Team7;

public class Team7Test01 {
    public static void main(String[] args) {
        Team7 team7 = new Team7("Team 7", "Kakashi Hatake");

        Ninja naruto = new Ninja("Naruto Uzumaki", "Wind", team7);
        Ninja sasuke = new Ninja("Sasuke Uchiha", "Fire", team7);
        Ninja sakura = new Ninja("Sakura Haruno", "Ground", team7);

        naruto.setTeam7(team7);
        sasuke.setTeam7(team7);
        sakura.setTeam7(team7);

        naruto.info();
        sasuke.info();
        sakura.info();
    }
}



