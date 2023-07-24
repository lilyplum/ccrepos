package com.codecool.fizzbuzzbehavioural.logic.check;


import com.codecool.fizzbuzzbehavioural.logic.check.Check;
import com.codecool.fizzbuzzbehavioural.logic.check.DivisibleBy3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleBy3Test {

    Check check = new DivisibleBy3();

    @Test
    void validatesAccepts3() {
        int number = 3;

        boolean result = check.validates(number);

        assertTrue(result);
    }

    @Test
    void validatesAccepts6() {
        int number = 6;

        boolean result = check.validates(number);

        assertTrue(result);
    }

    @Test
    void validatesDoesNotAccept5() {
        int number = 5;

        boolean result = check.validates(number);

        assertFalse(result);
    }


    @Test
    void getKeyword() {
        String result = check.getKeyword();

        String expected = "Fizz";
        assertEquals(expected, result);
    }
}
