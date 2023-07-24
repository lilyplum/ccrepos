package com.codecool.solararray.service;

import com.codecool.solararray.model.Panel;
import com.codecool.solararray.model.SolarArray;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SolarArrayManager {
    private SunManager sunManager;

    /**
     * @param latitude
     * @return the optimal fixed panel angle for the given latitude
     * see https://solarpaneltilt.com/
     */
    public static double getOptimalPanelAngle(double latitude) {
        return latitude < 25.0 ? latitude * 0.87 : latitude * 0.76 + 3.1;
    }

    public SolarArrayManager(SunManager sunManager) {
        this.sunManager = sunManager;
    }

    public void setPanelAngles(SolarArray solarArray, double angle) {
        // TODO
    }

    public double getMaxEnergyForDate(SolarArray solarArray, LocalDate date) {
        double maxEnergy = 0.0;
        // TODO
        return maxEnergy;
    }

    public double getMaxEnergyPerYearFixedAngle(SolarArray solarArray, int year, double angle) {
        // TODO
        return 0.0;
    }

    public double getMaxEnergyPerYearFixedOptimalAngle(SolarArray solarArray, int year) {
        // TODO
        return 0.0;
    }

    public double getMaxEnergyPerYearChangingAngleQuarterly(SolarArray solarArray, int year) {
        // TODO
        return 0.0;
    }

    public double getMaxEnergyPerYearChangingAngleDaily(SolarArray solarArray, int year) {
        // TODO
        return 0.0;
    }

    public void checkPanels(SolarArray solarArray, LocalDate date) {
        // TODO
    }

    public void refreshCurrentPower(SolarArray solarArray) {
        // TODO
    }

    public List<Panel> checkForPowerOutliers(SolarArray solarArray, int distance, double threshold) {
        List<Panel> outliers = new ArrayList<>();
        // TODO - use outliers.add(panel) to
        return outliers;
    }
}
