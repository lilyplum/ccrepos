package com.codecool.spd.data;

import java.time.Month;
import java.util.Set;

public enum Season {
    SPRING(Set.of(Month.MARCH, Month.APRIL, Month.MAY)),
    SUMMER(Set.of(Month.JUNE, Month.JULY, Month.AUGUST)),
    AUTUMN(Set.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER)),
    WINTER(Set.of(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY));

    Set<Month> months;

    Season(Set<Month> months) {
        this.months = months;
    }

    public Set<Month> getMonths() {
        return months;
    }
}
