// SOFTWARE VERIFICATION AND VALIDATION HOMEWORK
// Student id: B211202404
// Student name surname: Enise Nur ÇANDİK
// Repository address:https://github.com/enisecndk/SoftwareVerificationAndValidation  
package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }
    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 5, 2.5",
            "10, 2.5, 4",
            "12.5, 2.5, 5"
    })

        //EQUALITY
    void testDivision1(double a, double b, double c) {
        assertEquals(c, Calculator.divide(a, b));
    }

        //EXCEPTION
    @Test
    void testDivision2() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected."
        );

    }
}
