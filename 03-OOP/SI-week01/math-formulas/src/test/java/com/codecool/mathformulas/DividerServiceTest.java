package com.codecool.mathformulas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividerServiceTest {

    private final DividerService dividerService = new DividerService();

    @Test
    void isDivisible() {
        int dividend = 42;
        int divisor = 7;
        boolean result = dividerService.isDivisible(dividend, divisor);
        assertTrue(result);
    }

    @Test
    void isNotDivisible() {
        int dividend = 42;
        int divisor = 8;
        boolean result = dividerService.isDivisible(dividend, divisor);
        assertFalse(result);
    }

    @Test
    void hasTheSameReminder() {
        int dividend1 = 42;
        int dividend2 = 72;
        int divisor = 10;
        boolean result = dividerService.hasTheSameReminder(dividend1, dividend2, divisor);
        assertTrue(result);
    }

    @Test
    void hasDifferentReminder() {
        int dividend1 = 42;
        int dividend2 = 73;
        int divisor = 10;
        boolean result = dividerService.hasTheSameReminder(dividend1, dividend2, divisor);
        assertFalse(result);
    }

    @Test
    void numberOf3MultiplesUpTo9() {
        int n = 3;
        int limit = 9;
        int result = dividerService.numberOfMultiples(n, limit);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void numberOf3MultiplesUpTo10() {
        int n = 3;
        int limit = 10;
        int result = dividerService.numberOfMultiples(n, limit);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void numberOf3MultiplesUpTo11() {
        int n = 3;
        int limit = 11;
        int result = dividerService.numberOfMultiples(n, limit);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void numberOf3MultiplesUpTo12() {
        int n = 3;
        int limit = 12;
        int result = dividerService.numberOfMultiples(n, limit);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    void relativePrimes() {
        int a = 42;
        int b = 55;
        boolean result = dividerService.areRelativePrimes(a, b);
        assertTrue(result);
    }

    @Test
    void notRelativePrimes() {
        int a = 42;
        int b = 550;
        boolean result = dividerService.areRelativePrimes(a, b);
        assertFalse(result);
    }

    @Test
    void lcmOfRelativePrimes() {
        int a = 42;
        int b = 55;
        int result = dividerService.getLCM(a, b);
        int expected = 2310;
        assertEquals(expected, result);
    }

    @Test
    void lcmOfNotRelativePrimes() {
        int a = 42;
        int b = 63;
        int result = dividerService.getLCM(a, b);
        int expected = 126;
        assertEquals(expected, result);
    }


}
