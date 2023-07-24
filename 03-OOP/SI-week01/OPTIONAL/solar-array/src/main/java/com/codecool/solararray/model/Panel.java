package com.codecool.solararray.model;

import java.time.LocalDate;
import java.util.Random;

public class Panel {

    public static final double POWER_LOWER_BOUND = 0.2;
    public static final double POWER_UPPER_BOUND = 1.1;
    private long id;
    private PanelType type;
    private double area;
    private double angle;
    private LocalDate lastCheckedAt;
    private double currentPower;
    private Random random;

    public Panel(long id, PanelType type, double area) {
        this.id = id;
        this.type = type;
        this.area = area;
        this.random = new Random(id);
    }

    public long getId() {
        return id;
    }

    public PanelType getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public LocalDate getLastCheckedAt() {
        return lastCheckedAt;
    }

    public void setLastCheckedAt(LocalDate lastCheckedAt) {
        this.lastCheckedAt = lastCheckedAt;
    }

    public double getCurrentPower() {
        return currentPower;
    }

    public void refreshCurrentPower() {
        currentPower = PanelType.BASE_POWER * area * type.getEfficiency() *
                random.nextDouble(POWER_LOWER_BOUND, POWER_UPPER_BOUND);
    }

    @Override
    public String toString() {
        return "Panel " + id + " (" + type.getShortName() + ')';
    }
}
