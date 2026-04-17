package academy.devdojo.maratonajava.javacore.M_Interface.systemArchitecture.B_componentArchitecture;

import academy.devdojo.maratonajava.javacore.M_Interface.systemArchitecture.B_componentArchitecture.controller.RobotNetworkGateway;
import academy.devdojo.maratonajava.javacore.M_Interface.systemArchitecture.B_componentArchitecture.service.CoreExplorationService;
import academy.devdojo.maratonajava.javacore.M_Interface.systemArchitecture.B_componentArchitecture.service.ExplorationService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RobotSystemSetup {
    public static void main(String[] args) {

        ExplorationService businessLayer = CoreExplorationService.builder().build();

        RobotNetworkGateway systemLayer = RobotNetworkGateway.builder().explorationService(businessLayer).build();

        log.info("---- Simulating incoming network request ----");
        systemLayer.receiveRemoteCommand("CMD_MAP_AREA", "Sector - 001", "VALID_SECURITY_TOKEN");
    }
}
