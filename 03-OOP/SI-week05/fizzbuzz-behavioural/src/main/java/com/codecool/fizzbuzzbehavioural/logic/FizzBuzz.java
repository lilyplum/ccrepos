package com.codecool.fizzbuzzbehavioural.logic;


import com.codecool.fizzbuzzbehavioural.logic.check.Check;

import java.util.List;

public class FizzBuzz {
    private final List<Check> checks;

    public FizzBuzz(List<Check> checks) {
        this.checks = checks;
    }

    public String process(int number) {
        for (Check check : checks) {
            if (check.validates(number)) {
                return check.getKeyword();
            }
        }
        return String.valueOf(number);
    }
}
