package com.codecool.mightytextadventure.logic;

public class Utilities {
    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
