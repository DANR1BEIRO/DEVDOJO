package academy.devdojo.maratonajava.javacore.M_Interface.systemArchitecture.B_componentArchitecture.service;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Builder
public class CoreExplorationService implements ExplorationService {
    @Override
    public void startMappingMission(String zoneId) {
        log.info("[BUSINESS LAYER] business rules validated");
        log.info("[BUSINESS LAYER] activating sensors and navigation to zone: {}", zoneId);
    }
}
