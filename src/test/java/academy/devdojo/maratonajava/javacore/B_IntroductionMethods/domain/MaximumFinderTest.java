package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(expected, MaximumFinder.maximum(x, y, z));
    }

    @Test
    @DisplayName("Should throw a NullPointerException if at least one of the parameters is null")
    void shouldThrowNullPointerExceptionIfOneOf() {
        assertEquals(greater, MaximumFinder.maximum(mid, smaller, greater), "The maximum value should be the third parameter");
    }

    private static Stream<Arguments> provideNegativeParameters() {
        return Stream.of(
                Arguments.of(-10.0, -5.0, -1.0, -1.0),
                Arguments.of(-10.0, -1.0, -5.0, -1.0),
                Arguments.of(-1.0, -10.0, -5.0, -1.0));
    }

    @ParameterizedTest
    @MethodSource("provideNegativeParameters")
    @DisplayName("Should return the value closest to zero when all parameters are negative")
    void shouldReturnTheGreatestValueWhenAllParametersAreNegative(Double x, Double y, Double z, Double expected) {
        assertEquals(expected, MaximumFinder.maximum(x, y, z));
    }

    private static Stream<Arguments> providePrecisionScenarios() {
        return Stream.of(
                Arguments.of(1.0000003, 1.0000002, 1.0000004, 1.0000004),
                Arguments.of(1.234567, 1.234568, 1.234569, 1.234569),
                Arguments.of(0.00000001, 0.00000002, 0.00000003, 0.00000003));
    }

    @ParameterizedTest
    @MethodSource("providePrecisionScenarios")
    @DisplayName("Should return the correct maximum even with very small decimal differences")
    void shouldHandleSmallDecimalDiferences(Double x, Double y, Double z, Double expected) {
        assertEquals(expected, MaximumFinder.maximum(x, y, z));
    }

    private static Stream<Arguments> provideInfiniteNumber() {
        return Stream.of(
                Arguments.of(8000.0, 1_000_000.0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY),
                Arguments.of(10.0, Double.NEGATIVE_INFINITY, 5.0, 10.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideInfiniteNumber")
    @DisplayName("Should return Double.POSITIVE_INFINITY if is in parameters list")
    void shouldReturnInfinityNumberIfIsInParameterList(Double x, Double y, Double z, Double expected) {
        assertEquals(expected, MaximumFinder.maximum(x, y, z));
    }

    private static Stream<Arguments> provideNaNScenario() {
        return Stream.of(
                Arguments.of(Double.NaN, 10.0, 5.0, Double.NaN),
                Arguments.of(10.0, Double.NaN, 5.0, 10.0),
                Arguments.of(10.0, 20.0, Double.NaN, 20.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNaNScenario")
    @DisplayName("Should handle NaN scenarios correctly")
    void shouldHandleNaNScenarios(Double x, Double y, Double z, Double expected) {
        assertEquals(expected, MaximumFinder.maximum(x, y, z));
    }
}
