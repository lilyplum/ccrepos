package com.codecool.ehotel.service.guest;

import com.codecool.ehotel.model.guestData.Guest;
import com.codecool.ehotel.model.guestData.GuestType;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GuestGenerator {
    private static final String[] NAMES = {
            "Albert","Amy", "Berni", "Chen", "Chris", "Doris", "Emad", "Enes", "El", "Fleischi", "Gergo",
            "Hadi", "Imre", "Jessica", "Julia", "Jovan", "Manuela", "Nenad", "Raphi","Veronika", "Viktor"
    };

    private static final LocalDate SEASON_START = LocalDate.of(2023, 4, 1);
    private static final LocalDate SEASON_END = LocalDate.of(2023, 4, 5);
    private static final Random random = new Random();

    public String getRandomName(){
        String firstName = NAMES[random.nextInt(NAMES.length)];
        return firstName;
    }

    public GuestType getRandomGuestType(){
        GuestType[] values = GuestType.values();
        int randIndex = random.nextInt(values.length);
        return values[randIndex];
    }

    public LocalDate getRandomCheckinDate(){
        long seasonLength = ChronoUnit.DAYS.between(SEASON_START, SEASON_END) + 1;
        long randomDays = random.nextInt((int) seasonLength);
        return SEASON_START.plus(randomDays, ChronoUnit.DAYS);
    }

    public List<Guest> generateGuests(int count){
        List<Guest> guestList = new ArrayList<>();
        for (int i = 0; i < count; i++){
            String randomName = getRandomName();
            GuestType randGuestType = getRandomGuestType();
            LocalDate checkinDate = getRandomCheckinDate();
            int stayDuration = random.nextInt(7) + 1;
            LocalDate checkoutDate = checkinDate.plusDays(stayDuration);
            guestList.add(new Guest(randomName, randGuestType, checkinDate, checkoutDate, true));
        }
        return guestList;
    }





}
