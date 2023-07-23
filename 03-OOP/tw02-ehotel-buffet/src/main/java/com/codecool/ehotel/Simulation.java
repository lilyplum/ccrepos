package com.codecool.ehotel;

import com.codecool.ehotel.model.guestData.Guest;
import com.codecool.ehotel.service.breakfast.Breakfast;
import com.codecool.ehotel.service.breakfast.BreakfastManager;
import com.codecool.ehotel.service.guest.GuestGenerator;
import com.codecool.ehotel.service.guest.GuestServiceImpl;
import com.codecool.ehotel.ui.Input;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.lang.Integer.parseInt;

public class Simulation {

    public void printGuestList(List<Guest> guestList){

        for (Guest guest: guestList) {
            String guestInfo = String.format("Name: %s, Type: %s, Check-in: %s, Check-out: %s, Happy: %b",
                    guest.name(), guest.guestType(), guest.checkIn(), guest.checkOut(), guest.isHappy());
            System.out.println(guestInfo);
        }
    }

    public void runSimulation(){

        //TODO: Single-response-principle: Put user input to separate class
        Input userInput = new Input();
        System.out.println("Welcome to Hospitality Hackers");
        System.out.println("How many guests do you want to generate");
        int guestsNum = parseInt(userInput.getInput());
        System.out.println("guestsNum = " + guestsNum);
        System.out.println();
        //TODO: add this to init function and pass it to runSimulation
        GuestGenerator guestGenerator = new GuestGenerator();
        List<Guest> guestList = guestGenerator.generateGuests(guestsNum);

        printGuestList(guestList);
        //TODO: add to init
        Breakfast breakfast = new Breakfast();
        List<Guest> guestListEmpty = new ArrayList<>();
        GuestServiceImpl guestService = new GuestServiceImpl(guestListEmpty, guestList);
        System.out.println();
        System.out.println("Provide a specific day between SEASON START and SEASON END to get the guests for that day in a yyyy-mm-dd format");
        LocalDate userDate = LocalDate.parse(userInput.getInput());
        Set<Guest> guestsForDay = guestService.getGuestsForDay(userDate);
        if (guestsForDay.isEmpty()) {
            System.out.println("No guests for that day.");
        } else {
            System.out.println("Guests for that day:");
            for (Guest guest : guestsForDay) {
                System.out.printf("Name: %s, Type: %s, Check-in: %s, Check-out: %s, Happy: %b%n",
                        guest.name(), guest.guestType(), guest.checkIn(), guest.checkOut(), guest.isHappy());
            }
        }
        System.out.println();

        List<List<Guest>> breakFastCycles = breakfast.splitGuestsIntoBreakfastCycles(guestList);
        BreakfastManager breakfastManager = new BreakfastManager(breakFastCycles);
        breakfastManager.serve();

        printGuestList(guestList);
    }

}
