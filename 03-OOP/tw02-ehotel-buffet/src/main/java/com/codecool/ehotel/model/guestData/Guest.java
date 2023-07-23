package com.codecool.ehotel.model.guestData;

import com.codecool.ehotel.model.buffetData.MealType;

import java.time.LocalDate;
import java.util.Date;

public class Guest {

    private String name;
    private GuestType guestType;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private boolean isHappy;

    public Guest(String name, GuestType guestType, LocalDate checkIn, LocalDate checkOut, boolean isHappy) {
        this.name = name;
        this.guestType = guestType;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.isHappy = isHappy;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public MealType getPreferredMeal() {
        return this.guestType.getMealPreferences().get(0);
    }

    public void goHungry() {
        this.isHappy = false;
    }

    public Object checkIn() {
        return this.checkIn = checkIn;
    }

    public Object name() {
        return this.name = name;
    }

    public Object guestType() {
        return this.guestType = guestType;
    }

    public Object checkOut() {
        return this.checkOut = checkOut;
    }
}
