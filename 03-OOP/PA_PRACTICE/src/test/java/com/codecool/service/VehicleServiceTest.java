package com.codecool.service;

import com.codecool.data.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VehicleServiceTest {
    private final VehicleService vehicleService = new VehicleService();

    private static VehicleManager vehicleManager;
    private static Car ford;
    private static Motorcycle yamaha;
    private static Truck mercedes;

    @BeforeAll
    static void setup() {
        ford = new Car(30000, 1000, 2018, 0, Engine.GASOLINE);
        yamaha = new Motorcycle(10000, 1000, 2020, 1, Engine.PETROL);
        mercedes = new Truck(40000, 35000, 2023, 2, Engine.GASOLINE);

        vehicleManager = new VehicleManager(
                List.of(ford, yamaha, mercedes)
        );
    }

    @Test
    void getAllVehiclesBefore2019() {
        List<Vehicle> expected = new ArrayList<>(
                List.of(ford)
        );
        List<Vehicle> actual = vehicleService.getAllVehiclesBefore2019(vehicleManager);
        assertEquals(expected, actual);
    }

    @Test
    void getVehiclesTypeGasoline() {
        List<Vehicle> expected = new ArrayList<>(
                List.of(ford, mercedes)
        );
        List<Vehicle> actual = vehicleService.getVehiclesTypeGasoline(vehicleManager);
        assertEquals(expected, actual);
    }

    @Test
    void getMostExpensiveVehicle() {
        Vehicle expected = mercedes;
        Vehicle actual = vehicleService.getMostExpensiveVehicle(vehicleManager);
        assertEquals(expected,actual);
    }
}