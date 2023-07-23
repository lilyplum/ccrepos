package com.codecool.fengshui.logic;

import java.time.LocalDate;
import java.util.Scanner;

public class FengShuiUI {
    public static void UI() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Put in details in yyyy-mm-dd format");
        System.out.println("Person One enter your birthdate:");
        LocalDate person_one = LocalDate.parse(scanner.nextLine());

        System.out.println("Person Two enter your birthday:");
        LocalDate person_two = LocalDate.parse(scanner.nextLine());

        String match = MathCalculator.Math(SignCalculator.Sign(person_one), SignCalculator.Sign(person_two));
        System.out.println(match + " match");
    }
}
