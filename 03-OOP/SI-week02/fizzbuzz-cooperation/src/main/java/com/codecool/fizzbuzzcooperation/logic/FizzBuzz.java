package com.codecool.fizzbuzzcooperation.logic;

import com.codecool.fizzbuzzcooperation.logic.check.Check;
import org.w3c.dom.ls.LSOutput;


import java.util.List;

public class FizzBuzz {
    List <Check> checks;

    public FizzBuzz(List<Check> checks) {
        this.checks = checks;
    }

    public void process(int num) {

        for (Check check : checks) {
            if (check.validates(num)) {
                System.out.println(check.getKeyword());
            }
        }

        System.out.println(num);
    }
}
