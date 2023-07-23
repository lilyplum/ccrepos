package com.codecool.datadrivencalculator.logic.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionTest {
    Operation operation = new Division();

    @ParameterizedTest
    @CsvSource({
            "0, 1, 0",
            "1, 1, 1",
            "-1, 1, -1",
            "1, -1, -1"
    })
    void divide(int dividend, int divisor, int expectedResult) {
        int result = operation.operate(dividend, divisor);
        assertEquals(expectedResult, result);
    }

    @Test
    void divideByZero() {
        int dividend = 1;
        int divisor = 0;
        try {
            operation.operate(dividend, divisor);
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }
}
