package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns;

import academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.algorithms.StringLength;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringLengthTest {

    // MethodName_State_ExpectedBehavior

    @Test
    @DisplayName("Should return false when input length is smaller than 5")
    void isStringLengthGreaterThanFive_WhenLengthIsSmallerThan5_ShouldReturnFalse() {

        boolean result = StringLength.isStringLengthGreaterThanFive("123");
        assertEquals(false, result);
    }

    @Test
    @DisplayName("Should retyr  false when input length is equal to 5")
    void isStringLengthGreaterThanFive_WhenLengthIsEqualTo5_ShouldReturnFalse() {

        boolean result = StringLength.isStringLengthGreaterThanFive("12345");
        assertFalse(result);
    }

    @Test
    @DisplayName("Should return true when input length is greater than 5")
    void isStringLengthGreaterThanFive_WhenLengthIsGreatherThan5_ShouldReturnTrue() {

        boolean result = StringLength.isStringLengthGreaterThanFive("123456");
        assertTrue(result);
    }
}