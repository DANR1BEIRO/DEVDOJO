package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MaximumFinderTest {
    Double greater;
    Double mid;
    Double smaller;

    @BeforeEach
    void setUp() {
        greater = 10.0;
        mid = 5.0;
        smaller = 1.0;
    }

    private static Stream<Arguments> provideNullScenarios() {
        return Stream.of(
                Arguments.of(null, 5.0, 2.0),
                Arguments.of(5.0, null, 2.0),
                Arguments.of(5.0, 2.0, null));
    }

    @ParameterizedTest
    @MethodSource("provideNullScenarios")
    @DisplayName("Should throw NPE with specific message when any parameter is null")
    void shouldThrowANullPointerExceptionWhenParametersAreNull(Double x, Double y, Double z) {
        Assertions.assertThrows(NullPointerException.class, () -> MaximumFinder.maximum(x, y, z));
    }

    private static Stream<Arguments> provideGreaterScenarios() {
        return Stream.of(
                Arguments.of(10.0, 5.0, 1.0, 10.0),
                Arguments.of(5.0, 10.0, 1.0, 10.0),
                Arguments.of(1.0, 5.0, 10.0, 10.0));
    }

    @ParameterizedTest
    @MethodSource("provideGreaterScenarios")
    @DisplayName("Should return the max parameter")
    void shouldReturnTheMaxParameter(Double x, Double y, Double z, Double expected) {
        Assertions.assertEquals(expected, MaximumFinder.maximum(x, y, z));
    }

    @Test
    @DisplayName("Should throw a NullPointerException if at least one of the parameters is null")
    void shouldThrowNullPointerExceptionIfOneOf() {
        Assertions.assertEquals(greater, MaximumFinder.maximum(mid, smaller, greater), "The maximum value should be the third parameter");
    }
}
