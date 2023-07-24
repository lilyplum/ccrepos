package com.codecool.solararray.service;

import java.security.spec.EdECPoint;
import java.time.LocalDate;

public class SunManager {

    public static final int DAY_OF_AUTUMN_EQUINOX = 284;
    public static final  double TILT_OF_EARTH_AXIS = 23.45;
    public static final double DAYS_IN_A_YEAR = 365.25;
    public static final double SOLAR_CONSTANT = 1365.2;  //  W/m2
    private final double latitude;

    public SunManager(double latitude) {
        this.latitude = latitude;
    }

    public double getLatitude() {
        return latitude;
    }

    /**
     *
      * @param dayOfYear
     * @return the angle between the equatorial plane and the ecliptic plane (the plane of Earth's orbit)
     */
    private double getDeclination(int dayOfYear) {
        return TILT_OF_EARTH_AXIS * Math.sin((DAY_OF_AUTUMN_EQUINOX + dayOfYear) / DAYS_IN_A_YEAR * 2.0 * Math.PI);
    }

    /**
     *
     * @param date
     * @return the maximum elevation angle of the Sun (at noon) measured from the horizon
     */
    public double getMaxElevationAngle(LocalDate date) {
        return 90.0 - Math.abs(latitude - getDeclination(date.getDayOfYear()));
    }

    /**
     *
     * @param date
     * @return the number of sunny hours at a specific day of year (hour angle / PI * 24h)
     */
    public double getSunnyHours(LocalDate date) {
        int dayOfYear = date.getDayOfYear();
        double cosOmega = - Math.tan(Math.toRadians(latitude)) * Math.tan(Math.toRadians(getDeclination(dayOfYear)));
        return (cosOmega < -1) ? 24.0 : (cosOmega > 1) ? 0.0 : Math.acos(cosOmega) / Math.toRadians(15) * 2.0;
    }

    /**
     *
     * @param date
     * @return daily insolation in kWh/m2
     */
    public double getDailyInsolation(LocalDate date) {
        double hourAngleRad = (getSunnyHours(date) / 24.0 * Math.PI);
        double declinationRad = Math.toRadians(getDeclination(date.getDayOfYear()));
        double latitudeRad = Math.toRadians(latitude);
        return SOLAR_CONSTANT * (Math.sin(latitudeRad) * Math.sin(declinationRad) * hourAngleRad +
                                 Math.cos(latitudeRad) * Math.cos(declinationRad) * Math.sin(hourAngleRad)) / Math.PI * 24.0 / 1000;
    }

}
