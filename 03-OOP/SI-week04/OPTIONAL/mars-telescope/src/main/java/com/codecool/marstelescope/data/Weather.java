package com.codecool.marstelescope.data;

public enum Weather {
    CLEAR(0.0),
    MOSTLY_SUNNY(0.1),
    CLOUDY(0.5),
    OVERCAST(0.8);

    private double coverage;

    Weather(double coverage) {
        this.coverage = coverage;
    }

    public double getCoverage() {
        return coverage;
    }
}
