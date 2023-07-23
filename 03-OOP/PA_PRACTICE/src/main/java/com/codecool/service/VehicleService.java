package com.codecool.service;

import com.codecool.data.Engine;
import com.codecool.data.Vehicle;
import com.codecool.data.VehicleManager;

import java.util.Comparator;
import java.util.List;

public class VehicleService {
    public List<Vehicle> getAllVehiclesBefore2019 (VehicleManager vehicleManager) {
        List<Vehicle> vehicles = vehicleManager.vehicles();

        return vehicles.stream()
                .filter(el -> el.getYearOfAdmission() < 2019)
                .toList();
    }

    public List<Vehicle> getVehiclesTypeGasoline (VehicleManager vehicleManager) {
        List<Vehicle> vehicles = vehicleManager.vehicles();

        return vehicles.stream()
                .filter(VehicleService::isGasolineAndLessThanGivenPrice)
                .toList();
    }

    private static boolean isGasolineAndLessThanGivenPrice(Vehicle vehicle) {
        return vehicle.getEngine().equals(Engine.GASOLINE) && vehicle.getPrice() < 50000.00;
    }

    public Vehicle getMostExpensiveVehicle (VehicleManager vehicleManager) {
        List<Vehicle> vehicles = vehicleManager.vehicles();
        return vehicles.stream()
                .max(Comparator.comparingInt(vehicle -> (int) vehicle.getPrice()))
                .orElse(null);
    }

}
