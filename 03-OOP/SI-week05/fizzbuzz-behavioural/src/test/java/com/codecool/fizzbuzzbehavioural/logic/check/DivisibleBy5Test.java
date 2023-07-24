package com.codecool.fizzbuzzbehavioural.logic.check;


import com.codecool.fizzbuzzbehavioural.logic.check.Check;
import com.codecool.fizzbuzzbehavioural.logic.check.DivisibleBy5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleBy5Test {

    Check check = new DivisibleBy5();

    @Test
    void validatesAccepts5() {
        int number = 5;

        boolean result = check.validates(number);

        assertTrue(result);
    }

    @Test
    void validatesAccepts10() {
        int number = 10;

        boolean result = check.validates(number);

        assertTrue(result);
    }

    @Test
    void validatesDoesNotAccept7() {
        int number = 7;

        boolean result = check.validates(number);

        assertFalse(result);
    }


    @Test
    void getKeyword() {
        String result = check.getKeyword();

        String expected = "Buzz";
        assertEquals(expected, result);
    }
}
