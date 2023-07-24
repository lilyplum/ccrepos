package com.codecool.mathformulas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeServiceTest {

    private final RangeService rangeService = new RangeService();
    private final double target = 42.0;
    private final double percent = 8.0;
    private final static double DELTA = 1e-6;

    @Test
    void isWithin8FromBelow() {
        double value = 39.0;
        boolean result = rangeService.isWithin(value, target, percent);
        assertTrue(result);
    }

    @Test
    void isWithin8FromAbove() {
        double value = 45.0;
        boolean result = rangeService.isWithin(value, target, percent);
        assertTrue(result);
    }

    @Test
    void isNotWithin8FromBelow() {
        double value = 38.0;
        boolean result = rangeService.isWithin(value, target, percent);
        assertFalse(result);
    }

    @Test
    void isNotWithin8FromAbove() {
        double value = 46.0;
        boolean result = rangeService.isWithin(value, target, percent);
        assertFalse(result);
    }

    @Test
    void zeroDiffInPercentage() {
        double value = 42.0;
        double result = rangeService.diffInPercentage(value, target);
        double expected = 0.0;
        assertEquals(expected, result, DELTA);
    }

    @Test
    void nonZeroDiffInPercentageFromBelow() {
        double value = 39.0;
        double result = rangeService.diffInPercentage(value, target);
        double expected = 7.1428571;
        assertEquals(expected, result, DELTA);
    }

    @Test
    void nonZeroDiffInPercentageFromAbove() {
        double value = 45.0;
        double result = rangeService.diffInPercentage(value, target);
        double expected = 7.1428571;
        assertEquals(expected, result, DELTA);
    }

}