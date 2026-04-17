package academy.devdojo.maratonajava.javacore.M_Interface.systemArchitecture.A_systemComponent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SonarComponent implements VisionSensor {
    @Override
    public double scanDistance(String direction) {
        log.info("Emmiting ultrasonic sound waves");
        log.info("Measuring echo delay for direction: {}", direction);

        return 11;
    }
}
