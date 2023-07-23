package com.codecool.HospitalManagementSystem.data;

import java.time.LocalDateTime;

public record Appointment (long id, LocalDateTime date, Doctor doctor) {
}
