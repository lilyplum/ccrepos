package com.codecool.fengshui.logic;

import com.codecool.fengshui.data.Sign;

import java.time.LocalDate;

public class SignCalculator {
    public static Sign Sign(LocalDate date) {
        int year = date.getYear();
        int remainder = (year % 12) + 1;
        switch (remainder) {
            case 1:
                return Sign.MONKEY;
            case 2:
                return Sign.ROOSTER;
            case 3:
                return Sign.DOG;
            case 4:
                return Sign.PIG;
            case 5:
                return Sign.RAT;
            case 6:
                return Sign.OX;
            case 7:
                return Sign.TIGER;
            case 8:
                return Sign.RABBIT;
            case 9:
                return Sign.DRAGON;
            case 10:
                return Sign.SNAKE;
            case 11:
                return Sign.HORSE;
            case 12:
                return Sign.GOAT;
        }
        return null;
    }
}
