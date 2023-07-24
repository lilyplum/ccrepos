package com.codecool.solararray.model;

public enum PanelType {
    MONOCRYSTALLINE("MONO", 0.2),
    POLYCRYSTALLINE("POLY", 0.15),
    THIN_FILM("THIN", 0.1);

    public static final double BASE_POWER = 250.0;
    private String shortName;
    private double efficiency;

    PanelType(String shortName, double efficiency) {
        this.shortName = shortName;
        this.efficiency = efficiency;
    }

    public String getShortName() {
        return shortName;
    }

    public double getEfficiency() {
        return efficiency;
    }
}
