package com.codecool.fizzbuzzbehavioural.logic.check;


import com.codecool.fizzbuzzbehavioural.logic.check.Check;
import com.codecool.fizzbuzzbehavioural.logic.check.DivisibleBy3And5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleBy3And5Test {

    Check check = new DivisibleBy3And5();

    @Test
    void validatesDoesNotAccept3() {
        int number = 3;

        boolean result = check.validates(number);

        assertFalse(result);
    }
    @Test
    void validatesDoesNotAccept5() {
        int number = 5;

        boolean result = check.validates(number);

        assertFalse(result);
    }
    @Test
    void validatesAccepts15() {
        int number = 15;

        boolean result = check.validates(number);

        assertTrue(result);
    }

    @Test
    void getKeyword() {
        String result = check.getKeyword();

        String expected = "FizzBuzz";
        assertEquals(expected, result);
    }
}
