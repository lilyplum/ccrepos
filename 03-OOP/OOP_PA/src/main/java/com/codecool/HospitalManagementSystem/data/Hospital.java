package com.codecool.HospitalManagementSystem.data;

import java.util.List;

public record Hospital(List<Patient> patients, List<Doctor> doctors) {
}

