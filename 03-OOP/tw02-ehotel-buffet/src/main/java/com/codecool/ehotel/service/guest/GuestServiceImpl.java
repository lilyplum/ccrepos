package com.codecool.ehotel.service.guest;

import com.codecool.ehotel.model.guestData.Guest;
import com.codecool.ehotel.service.guest.GuestService;

import java.time.LocalDate;
import java.util.*;

public class GuestServiceImpl implements GuestService {

    private List<Guest> guestList;
    private List<Guest> reservationList;

    public GuestServiceImpl(List<Guest> guestList, List<Guest> reservationList) {
        this.guestList = guestList;
        this.reservationList = reservationList;
    }

    @Override
    public Set<Guest> getGuestsForDay(LocalDate date) {
        //TODO: stream it :D
        Set<Guest> guests = new HashSet<>();
        for (Guest reservation : reservationList) {
            if (reservation.checkIn().equals(date)) {
                guests.add(reservation);
            }
        }
        return guests;
    }
}
