package com.codecool.datadrivencalculator.logic.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "1, 0, 1",
            "0, 1, -1",
            "1, 1, 0",
            "0, -1, 1",
            "-1, -1, 0"
    })
    void testSubtraction(int minuend, int subtrahend, int expectedResult) {
        Operation operation = new Subtraction();
        int result = operation.operate(minuend, subtrahend);
        assertEquals(expectedResult, result);
    }

    @Test
    void testSubtractionSymbol() {
        Operation operation = new Subtraction();
        assertEquals("-", operation.getSymbol());
    }
}
