package com.codecool.runrabbitrun.logic.simulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunToCarrotSimulatorTest {

    @Test
    void runSimulator_fromZeroWithSmallDistance_timeIsAboveZero() {
        RunToCarrotSimulator simulator = new RunToCarrotSimulator(10, 0,10);
        int expected = 1;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void runSimulator_fromZeroWithSmallObscureDistance_timeIsAboveZero() {
        RunToCarrotSimulator simulator = new RunToCarrotSimulator(22, 0,7);
        int expected = 4;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void runSimulator_fromZeroWithSmallDistanceBigSpeed_timeIsAboveZero() {
        RunToCarrotSimulator simulator = new RunToCarrotSimulator(10, 0,100);
        int expected = 1;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void runSimulator_fromDistanceWithSmallDistanceBigSpeed_timeIsAboveZero() {
        RunToCarrotSimulator simulator = new RunToCarrotSimulator(10, 10,100);
        int expected = 0;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void runSimulator_fromNonZeroWithSmallDistanceBigSpeed_timeIsAboveZero() {
        RunToCarrotSimulator simulator = new RunToCarrotSimulator(100, 10,8);
        int expected = 12;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void runSimulator_fromZeroWithBigRoundDistance_timeIsAboveZero() {
        RunToCarrotSimulator simulator = new RunToCarrotSimulator(1000000, 0,10);
        int expected = 100000;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void runSimulator_fromZeroWithBigObscureDistance_timeIsAboveZero() {
        // it might run for quite a while
        RunToCarrotSimulator simulator = new RunToCarrotSimulator(49817247, 0,7);
        int expected = 7116750;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }
}
