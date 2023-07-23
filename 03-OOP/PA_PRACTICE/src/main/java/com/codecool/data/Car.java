package com.codecool.data;

public class Car implements Vehicle {
    private double price;
    private double distanceInKm;
    private double distanceInMiles;
    private int yearOfAdmission;
    private int id;
    private Engine engine;

    public Car(double price, double distanceInKm, int yearOfAdmission, int id, Engine engine) {
        this.price = price;
        this.distanceInKm = distanceInKm;
        this.distanceInMiles = distanceInKm / 1.6;
        this.yearOfAdmission = yearOfAdmission;
        this.id = id;
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public double getDistanceInMiles() {
        return distanceInMiles;
    }

    public void setDistanceInMiles(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
