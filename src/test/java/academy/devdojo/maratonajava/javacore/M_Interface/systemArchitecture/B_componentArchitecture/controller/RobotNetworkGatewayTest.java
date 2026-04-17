package academy.devdojo.maratonajava.javacore.M_Interface.systemArchitecture.B_componentArchitecture.controller;

import academy.devdojo.maratonajava.javacore.M_Interface.systemArchitecture.B_componentArchitecture.service.ExplorationService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// isso habilita o uso do Mockito, responsável por criar objetos simulados
@ExtendWith(MockitoExtension.class)
class RobotNetworkGatewayTest {

    // @Mock: cria um objeto simulado da interface
    @Mock
    private ExplorationService explorationServiceMock;

    // cria uma instância real de RobotNetworkGateway e injeta o mock acima
    @InjectMocks
    private RobotNetworkGateway robotNetworkGateway;

    @Test
    @DisplayName("Should not execute mission when security token is not valid")
    void shouldNotExecuteMissionWhenSecurityTokenIsNotValid() {

        String command = "CMD_MAP_AREA";
        String targetZone = "Sector - 001";
        String securityToken = "INVALID_TOKEN";

        robotNetworkGateway.receiveRemoteCommand(command, targetZone, securityToken);

        Mockito.verify(explorationServiceMock, Mockito.never()).startMappingMission(Mockito.anyString());
    }

}