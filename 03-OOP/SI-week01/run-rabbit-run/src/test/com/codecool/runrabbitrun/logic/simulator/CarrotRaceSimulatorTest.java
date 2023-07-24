package com.codecool.runrabbitrun.logic.simulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrotRaceSimulatorTest {
    @Test
    void raceSimulator_smallValues_secondRabbitWins() {
        CarrotRaceSimulator simulator = new CarrotRaceSimulator(10, 1,11, 2);
        int expected = 2;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void raceSimulator_smallValues_firstRabbitWins() {
        CarrotRaceSimulator simulator = new CarrotRaceSimulator(10, 3,11, 2);
        int expected = 1;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void raceSimulator_firstRabbitBigDistance_secondRabbitWins() {
        CarrotRaceSimulator simulator = new CarrotRaceSimulator(25678, 1234,11, 2);
        int expected = 2;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void raceSimulator_firstRabbitBigDistance_firstRabbitWins() {
        CarrotRaceSimulator simulator = new CarrotRaceSimulator(25678, 9234,11, 2);
        int expected = 1;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void raceSimulator_sameDistance_firstRabbitWins() {
        CarrotRaceSimulator simulator = new CarrotRaceSimulator(100, 5,100, 2);
        int expected = 1;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void raceSimulator_sameDistance_secondRabbitWins() {
        CarrotRaceSimulator simulator = new CarrotRaceSimulator(100, 3,100, 6);
        int expected = 2;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void raceSimulator_sameDistance_draw() {
        CarrotRaceSimulator simulator = new CarrotRaceSimulator(100, 18,100, 18);
        int expected = -1;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }

    @Test
    void raceSimulator_differentDistance_draw() {
        CarrotRaceSimulator simulator = new CarrotRaceSimulator(200, 10 ,100, 5);
        int expected = -1;
        int actual = simulator.simulate();

        assertEquals(expected, actual);
    }


}
