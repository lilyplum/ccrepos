package com.codecool.HospitalManagementSystem.service;

import com.codecool.HospitalManagementSystem.data.*;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public class HospitalManager {

    public List<Patient> retrievePatientsWithFutureAppointment(Hospital hospital, Specialisation specialisation) {
        List<Patient> patients = hospital.patients();

        return patients.stream()
                .filter(el -> el.appointmentList().stream()
                        .anyMatch(
                                appointment -> appointment.date().isAfter(LocalDateTime.now()) &&
                                        appointment.doctor().specialisation().equals(specialisation)
                        ))
                .toList();
//                immutable
//                .collect(Collectors.toList());
//                mutable
    }

    public Patient getPatientWithMostAppointments(Hospital hospital) {
        List<Patient> patients = hospital.patients();
        LocalDateTime last30Days = LocalDateTime.now().minusDays(30);

        return patients.stream()
                .filter(patient -> patient.appointmentList().stream()
                        .anyMatch(appointment -> isAppointmentInLast30Days(last30Days, appointment)))
                .max(Comparator.comparingInt(patient -> (int) patient.appointmentList().stream()
                        .filter(appointment -> isAppointmentInLast30Days(last30Days, appointment))
                        .count()))
                .orElse(null);
//                .orElseThrow(()-> new RuntimeException("no Patient returned"));
    }

    private boolean isAppointmentInLast30Days(LocalDateTime last30Days, Appointment appointment) {
        return appointment.date().isAfter(last30Days) && appointment.date().isBefore(LocalDateTime.now());
    }

    public Doctor getDocWithMostExp(Hospital hospital) {
        List<Doctor> doctors = hospital.doctors();
        return doctors.stream()
                .max(Comparator.comparingInt(Doctor::yearsOfExp))
                .orElse(null);
    }

}
