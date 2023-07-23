package com.codecool.ehotel.service.guest;

import com.codecool.ehotel.model.guestData.Guest;

import java.time.LocalDate;
import java.util.Set;

public interface GuestService {
    Set<Guest> getGuestsForDay(LocalDate date);

}
