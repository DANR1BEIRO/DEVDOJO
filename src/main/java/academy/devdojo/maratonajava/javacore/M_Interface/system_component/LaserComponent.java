package academy.devdojo.maratonajava.javacore.M_Interface.system_component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LaserComponent implements VisionSensor {

    @Override
    public double scanDistance(String direction) {
        log.info("Activating LiDAR laser emitter..");
        log.info("Calculating light return time for direction: {}", direction);

        return 4;
    }
}
