package academy.devdojo.maratonajava.OOP.hierarchical_abstraction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Chakra {

    private int currentChakra = 100;

    public boolean extractChakra(int cost) {
        if (currentChakra >= cost) {
            currentChakra -= cost;
            log.info("Extracted {} chakra units. Remaining: {}", cost, currentChakra);
            return true;
        }
        log.warn("Chakra exhaustion!");
        return false;
    }
}




