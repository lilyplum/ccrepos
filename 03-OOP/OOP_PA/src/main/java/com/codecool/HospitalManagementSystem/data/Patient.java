package com.codecool.HospitalManagementSystem.data;

import java.time.LocalDate;
import java.util.List;

public record Patient (long id, String name, LocalDate dob, List<Appointment> appointmentList) {
}
