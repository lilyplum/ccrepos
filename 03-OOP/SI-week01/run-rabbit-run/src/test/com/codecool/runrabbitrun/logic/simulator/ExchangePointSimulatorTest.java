package com.codecool.runrabbitrun.logic.simulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangePointSimulatorTest {

    @Test
    void exchangePointSimulator_simplePositions_expected7() {
        ExchangePointSimulator simulator = new ExchangePointSimulator(0, 10,100, 5);
        int expected = 7;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void exchangePointSimulator_simplePositionsBigSpeed_expected2() {
        ExchangePointSimulator simulator = new ExchangePointSimulator(0, 30,100, 20);
        int expected = 2;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void exchangePointSimulator_simplePositionsBigSpeed_expected1() {
        ExchangePointSimulator simulator = new ExchangePointSimulator(0, 40,100, 70);
        int expected = 1;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void exchangePointSimulator_closePositionSmallSpeed_expected7() {
        ExchangePointSimulator simulator = new ExchangePointSimulator(30, 2,50, 1);
        int expected = 7;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void exchangePointSimulator_closePositionBigSpeed_expected1() {
        ExchangePointSimulator simulator = new ExchangePointSimulator(30, 10,50, 20);
        int expected = 1;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void exchangePointSimulator_samePosition_expected0() {
        ExchangePointSimulator simulator = new ExchangePointSimulator(1, 10,1, 20);
        int expected = 0;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void exchangePointSimulator_bigDistance_expected0() {
        ExchangePointSimulator simulator = new ExchangePointSimulator(0, 40,1019384, 55);
        int expected = 10731;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

}
