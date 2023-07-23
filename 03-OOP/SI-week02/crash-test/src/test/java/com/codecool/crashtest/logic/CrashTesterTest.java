package com.codecool.crashtest.logic;

import com.codecool.crashtest.data.Car;

import com.codecool.crashtest.data.Seat;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


class CrashTesterTest {
    int minimumSpeedToOpenTheAirbag = 30;
    CrashTester crashTester = new CrashTester(minimumSpeedToOpenTheAirbag);

    @Test
    void crashBelowMinSpeed () {
        int belowMinSpeed = 29;
        int carSpeed = belowMinSpeed;
        Seat driverSeat = new Seat(true, false);
        Set<Seat> seats = new HashSet<>();
        seats.add(driverSeat);
        Car car = new Car(carSpeed, seats);
        crashTester.testCrash(car);

        assertFalse(driverSeat.isAirbagOpen());
    }
    @Test
    void crashAboveMinSpeed () {
        int aboveMinSpeed = 40;
        int carSpeed = aboveMinSpeed;
        Seat driverSeat = new Seat(true, false);
        Set<Seat> seats = new HashSet<>();
        seats.add(driverSeat);
        Car car = new Car(carSpeed, seats);
        crashTester.testCrash(car);

        assertTrue(driverSeat.isAirbagOpen());
    }

    @Test
    void crashAboveMinSpeedWithTwoSeats () {
        int aboveMinSpeed = 40;
        int carSpeed = aboveMinSpeed;
        Seat driverSeat = new Seat(true, false);
        Seat passengerSeat = new Seat(false, false);
        Set<Seat> seats = new HashSet<>();
        seats.add(driverSeat);
        seats.add(passengerSeat);
        Car car = new Car(carSpeed, seats);
        crashTester.testCrash(car);

        assertTrue(driverSeat.isAirbagOpen());
    }

}
