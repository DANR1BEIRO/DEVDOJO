package academy.devdojo.maratonajava.OOP.hierarchical_abstraction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Shinobi {
    private String name;
    private Ninjutsu ninjutsu;

    public Shinobi(String name) {
        this.name = name;
        this.ninjutsu = new Ninjutsu();
    }

    public void attackEnemy() {
        log.info("{} is entering in combat!", this.name);
        ninjutsu.castFireBall();
    }
}
