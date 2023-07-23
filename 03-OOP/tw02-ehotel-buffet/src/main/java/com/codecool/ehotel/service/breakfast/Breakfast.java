package com.codecool.ehotel.service.breakfast;

import com.codecool.ehotel.model.guestData.Guest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Breakfast {
    public List<List<Guest>> splitGuestsIntoBreakfastCycles(List<Guest> guests){

        //TODO: Magic numbers + Dependency injection
        List<List<Guest>> breakfastCycles = new ArrayList<>(8);
        for (int i = 0; i < 8; i++) {
            breakfastCycles.add(new ArrayList<>());
        }
        Random random = new Random();
        for (Guest guest : guests) {
            int cycle = random.nextInt(8);
            breakfastCycles.get(cycle).add(guest);
        }

        return breakfastCycles;
    }
}
