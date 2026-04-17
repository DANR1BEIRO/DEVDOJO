package academy.devdojo.maratonajava.javacore.M_Interface.system_component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class NavigationSystem {

    private final VisionSensor visionSensor;

    public void calculatePath() {
        log.info("Requesting environment data");

        double distanceToObstacle = visionSensor.scanDistance("west");

        if (distanceToObstacle > 5) {
            log.info("Path clear. Distance: {}", distanceToObstacle);
        } else {
            log.error("Obstacle detected. calculating new route");
        }
    }

    public static void main(String[] args) {
        LaserComponent laserComponent = new LaserComponent();
        SonarComponent sonarComponent = new SonarComponent();

        NavigationSystem navigationSystem1 = new NavigationSystem(sonarComponent);
        navigationSystem1.calculatePath();
    }
}
