package academy.devdojo.maratonajava.javacore.M_Interface.systemArchitecture.B_componentArchitecture.controller;

import academy.devdojo.maratonajava.javacore.M_Interface.systemArchitecture.B_componentArchitecture.service.ExplorationService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RequiredArgsConstructor
@Slf4j
@Builder
public class RobotNetworkGateway {

    private final ExplorationService explorationService;

    public void receiveRemoteCommand(String command, String targetZone, String securityToken) {
        log.info("[SYSTEM LAYER] signal received. Validating protocols");

        if (securityToken == null || !securityToken.equals("VALID_SECURITY_TOKEN")) {
            log.error("[SYSTEM LAYER] Access denied. token {} unauthorized.", securityToken);
            return;
        }
        log.info("[SYSTEM LAYER] Network authentication successful");

        if ("CMD_MAP_AREA".equals(command)) {
            explorationService.startMappingMission(targetZone);
        } else {
            log.error("[SYSTEM LAYER] Command {} not reconized", command);
        }
    }
}
