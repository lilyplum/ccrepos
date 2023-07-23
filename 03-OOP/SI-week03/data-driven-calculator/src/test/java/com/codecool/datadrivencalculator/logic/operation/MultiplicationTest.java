package com.codecool.datadrivencalculator.logic.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTest {
    Operation operation = new Multiplication();
    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "1, 0, 0",
            "0, 1, 0",
            "1, 1, 1",
            "-1, 1, -1",
            "1, -1, -1",
            "-1, -1, 1"
    })
    void multiply(int multiplicand, int multiplier, int expectedResult) {
        int result = operation.operate(multiplicand, multiplier);

        assertEquals(expectedResult, result);
    }

    @Test
    void multiplicationSymbol() {
        assertEquals("*", operation.getSymbol());
    }
}
