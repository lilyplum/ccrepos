package com.codecool.fizzbuzzbehavioural;


import com.codecool.fizzbuzzbehavioural.logic.FizzBuzz;
import com.codecool.fizzbuzzbehavioural.logic.check.Check;
import com.codecool.fizzbuzzbehavioural.logic.check.DivisibleBy3;
import com.codecool.fizzbuzzbehavioural.logic.check.DivisibleBy3And5;
import com.codecool.fizzbuzzbehavioural.logic.check.DivisibleBy5;
import com.codecool.fizzbuzzbehavioural.ui.NumberProvider;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberProvider numberProvider = new NumberProvider(scanner);
        int number = numberProvider.provide();
        List<Check> checks = List.of(
                new DivisibleBy3And5(), new DivisibleBy3(), new DivisibleBy5());
        FizzBuzz fizzBuzz = new FizzBuzz(checks);
        String result = fizzBuzz.process(number);
        System.out.println("result = " + result);
    }
}
