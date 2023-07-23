package com.codecool.HospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> someTest = new ArrayList<>(List.of(
                "N40", "N35",
                "B12", "B5",
                "G42", "G23", "G60", "G20", "g44",
                "I12", "I15", "I30",
                "O70"));

        someTest.stream()
                .map(String::toUpperCase)
                .filter(number -> number.startsWith("G"))
                .sorted()
                .forEach(System.out::println);
    }
}
