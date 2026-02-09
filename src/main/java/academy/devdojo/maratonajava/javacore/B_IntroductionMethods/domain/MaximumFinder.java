package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain;

import java.util.Objects;

public class MaximumFinder {
    public static void main(String[] args) {
        System.out.println(MaximumFinder.maximum(5.0, 6.0, 4.0));
    }

    public static Double maximum(Double x, Double y, Double z) {

        Objects.requireNonNull(x, "Parameter cannot be null");
        Objects.requireNonNull(y, "Parameter cannot be null");
        Objects.requireNonNull(z, "Parameter cannot be null");

        return Math.max(x, Math.max(y, z));
    }
}
