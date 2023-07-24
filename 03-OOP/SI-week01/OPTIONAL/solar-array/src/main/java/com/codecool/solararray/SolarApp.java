package com.codecool.solararray;

import com.codecool.solararray.model.Panel;
import com.codecool.solararray.model.SolarArray;
import com.codecool.solararray.service.SolarArrayManager;
import com.codecool.solararray.service.SunManager;

import java.time.LocalDate;
import java.util.List;

public class SolarApp {

    public static final int YEAR = 2022;
    public static final double LATITUDE = 45.0;

    public static void main(String[] args) {
        SunManager sunManager = new SunManager(LATITUDE);
        SolarArrayManager solarArrayManager = new SolarArrayManager(sunManager);
        LocalDate firstDay = LocalDate.of(YEAR, 6, 21);

        SolarArray solarArray = new SolarArray(8, 5, firstDay, new int[]{3, 4, 2});
        System.out.println(solarArray);

        double maxEnergyForADay = solarArrayManager.getMaxEnergyForDate(solarArray, firstDay);
        System.out.println(String.format("Theoretical maximum of solar energy production for day %s is %.2f kWh.", firstDay, maxEnergyForADay));

        double maxEnergyPerYearFixedHorizontal = solarArrayManager.getMaxEnergyPerYearFixedAngle(solarArray, YEAR, 0.0);
        System.out.println(String.format("Theoretical maximum of solar energy production for year %d is %.2f kWh (zero angle panels).", YEAR, maxEnergyPerYearFixedHorizontal));

        double maxEnergyPerYearFixedOptimalAngle = solarArrayManager.getMaxEnergyPerYearFixedOptimalAngle(solarArray, YEAR);
        System.out.println(String.format("Theoretical maximum of solar energy production for year %d is %.2f kWh (optimal angle panels).", YEAR, maxEnergyPerYearFixedOptimalAngle));

        double maxEnergyPerYearChangingAngleQuarterly = solarArrayManager.getMaxEnergyPerYearChangingAngleQuarterly(solarArray, YEAR);
        System.out.println(String.format("Theoretical maximum of solar energy production for year %d is %.2f kWh (quarterly adjusted panels).", YEAR, maxEnergyPerYearChangingAngleQuarterly));

        double maxEnergyPerYearChangingAngleDaily = solarArrayManager.getMaxEnergyPerYearChangingAngleDaily(solarArray, YEAR);
        System.out.println(String.format("Theoretical maximum of solar energy production for year %d is %.2f kWh (daily adjusted panels).", YEAR, maxEnergyPerYearChangingAngleDaily));

        System.out.println(" --- Checks after 50 days --- ");
        solarArrayManager.checkPanels(solarArray, firstDay.plusDays(50));

        solarArrayManager.refreshCurrentPower(solarArray);
        List<Panel> outlierPanels = solarArrayManager.checkForPowerOutliers(solarArray, 2, 0.85);
        System.out.println("Panels with extreme low power output: " + outlierPanels);
    }
}
