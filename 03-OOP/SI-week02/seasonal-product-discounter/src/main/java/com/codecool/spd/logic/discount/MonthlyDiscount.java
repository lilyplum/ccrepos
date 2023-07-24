package com.codecool.spd.logic.discount;

import com.codecool.spd.data.Product;

import java.time.LocalDate;
import java.time.Month;
import java.util.Set;

public class MonthlyDiscount {
    private final String name;
    private final int rate;
    private final Set<Month> months;

    public MonthlyDiscount(String name, int rate, Set<Month> months) {
        this.name = name;
        this.rate = rate;
        this.months = months;
    }

    public boolean accepts(Product product, LocalDate date) {
        // ToDo
        return false;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }
}
