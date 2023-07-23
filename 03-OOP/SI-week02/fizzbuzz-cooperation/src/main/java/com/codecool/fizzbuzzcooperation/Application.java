package com.codecool.fizzbuzzcooperation;


import com.codecool.fizzbuzzcooperation.logic.FizzBuzz;
import com.codecool.fizzbuzzcooperation.logic.check.Check;
import com.codecool.fizzbuzzcooperation.logic.check.DivisibleBy3;
import com.codecool.fizzbuzzcooperation.logic.check.DivisibleBy3And5;
import com.codecool.fizzbuzzcooperation.logic.check.DivisibleBy5;
import com.codecool.fizzbuzzcooperation.ui.NumberProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        List<Check> checks = new ArrayList<>();
        checks.add(new DivisibleBy3());
        checks.add(new DivisibleBy5());
        checks.add(new DivisibleBy3And5());

        NumberProvider input = new NumberProvider();
        FizzBuzz fizzBuzz = new FizzBuzz(checks);
        fizzBuzz.process(input.provide());


//        FizzBuzz fizzBuzz = new FizzBuzz();
//        fizzBuzz.process(3);
    }
}
