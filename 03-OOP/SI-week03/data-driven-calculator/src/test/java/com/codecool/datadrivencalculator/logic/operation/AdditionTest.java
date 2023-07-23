package com.codecool.datadrivencalculator.logic.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {
    Operation operation = new Addition();

    @Test
    void getSymbol() {
        String result = operation.getSymbol();

        String expected = "+";
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "1, 1, 0",
            "1, 0, 1",
            "2, 1, 1",
            "-1, -1, 0",
            "-1, 0, -1",
            "0, 1, -1"
    })
    void operate(int expected, int number1, int number2) {
        int result = operation.operate(number1, number2);

        assertEquals(expected, result);
    }
}
