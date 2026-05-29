package academy.devdojo.maratonajava.OOP.hierarchical_abstraction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ninjutsu {
    private Chakra chakra;
    private HandSeal handSeal;

    public Ninjutsu() {
        this.chakra = new Chakra();
        this.handSeal = new HandSeal();
    }

    public void castFireBall() {
        log.info("Fire style: Fire ball jutsu");

        String[] requiredSeals = {"Serpent", "Ram", "Monkey", "Boar", "Horse", "Tiger"};
        handSeal.performHandSeal(requiredSeals);

        if (chakra.extractChakra(30)) {
            log.info("SUCCESS: massive fireball released!");
        } else {
            log.warn("FAILED: Jutstu doesn't work");
        }
    }
}
