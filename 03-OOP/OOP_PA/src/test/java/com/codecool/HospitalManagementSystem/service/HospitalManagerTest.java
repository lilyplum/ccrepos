package com.codecool.HospitalManagementSystem.service;

import com.codecool.HospitalManagementSystem.data.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HospitalManagerTest {
    private final HospitalManager hospitalManager = new HospitalManager();
    private static Hospital hospital;
    private static Patient jack;
    private static Patient john;
    private static Patient lily;
    private static Doctor sarah;

    @BeforeAll
    static void setup() {
        sarah = new Doctor("Sarah", 20, Specialisation.SURGERY);
        Doctor oscar = new Doctor("Oscar", 10, Specialisation.INTERNAL);
        Doctor martin = new Doctor("Martin", 10, Specialisation.INTERNAL);

        Appointment futureAppointment1 = new Appointment(
                0,
                LocalDateTime.of(2023, 12, 2, 15, 0, 0),
                oscar
        );

        Appointment futureAppointment2 = new Appointment(
                1,
                LocalDateTime.of(2023, 10, 7, 10, 0, 0),
                martin
        );

        Appointment pastAppointment = new Appointment(
                2,
                LocalDateTime.of(2023, 4, 10, 10, 0, 0),
                sarah
        );

        jack = new Patient(
                0,
                "jack",
                LocalDate.of(1999, 10, 12),
                List.of(futureAppointment1, futureAppointment2));

        john = new Patient(
                1,
                "john",
                LocalDate.of(1999, 10, 12),
                List.of(futureAppointment1, pastAppointment));

        lily = new Patient(
                2,
                "lily",
                LocalDate.of(1998, 7, 27),
                List.of(pastAppointment, pastAppointment)
        );
        List<Patient> patients = new ArrayList<>(List.of(jack, john, lily));
        List<Doctor> doctors = new ArrayList<>(List.of(sarah, oscar, martin));
        hospital = new Hospital(patients, doctors);

    }


    public static Stream<Arguments> patientWithFutureAppointmentParams() {
        List<Patient> expected = new ArrayList<>(List.of(jack, john));
        return Stream.of(
                Arguments.of(hospital, Specialisation.INTERNAL, expected)
        );
    }

    public static Stream<Arguments> patientWithMostAppointmentsParams() {
        Patient expected = lily;
        return Stream.of(
                Arguments.of(hospital, expected)
        );
    }

    public static Stream<Arguments> docWithMostExpParams() {
        Doctor expected = sarah;
        return Stream.of(
                Arguments.of(hospital, expected)
        );
    }

    @ParameterizedTest
    @MethodSource("patientWithFutureAppointmentParams")
    void retrievePatientsWithFutureAppointment(Hospital hospital, Specialisation specialisation, List<Patient> expected) {
        List<Patient> actual = hospitalManager.retrievePatientsWithFutureAppointment(hospital, specialisation);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("patientWithMostAppointmentsParams")
    void getPatientsWithMostAppointments(Hospital hospital, Patient expected) {
        Patient actual = hospitalManager.getPatientWithMostAppointments(hospital);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("docWithMostExpParams")
    void getDocWithMostExp(Hospital hospital, Doctor expected) {
        Doctor actual = hospitalManager.getDocWithMostExp(hospital);
        assertEquals(expected, actual);
    }
}