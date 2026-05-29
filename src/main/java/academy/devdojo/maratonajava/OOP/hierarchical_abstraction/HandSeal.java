package academy.devdojo.maratonajava.OOP.hierarchical_abstraction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HandSeal {
    public void performHandSeal(String[] seals) {
        log.info("Perform sequence: ");
        for (String seal : seals) {
            log.info("{} -> ", seal);
        }
        log.info("Release!");
    }
}
