package academy.devdojo.maratonajava.javacore.M_Interface.systemArchitecture.A_systemComponent;

public interface VisionSensor {

    // the contract requires only scanning for distance
    // it doesn't matter how the physics of the sensor works
    double scanDistance(String direction);
}
