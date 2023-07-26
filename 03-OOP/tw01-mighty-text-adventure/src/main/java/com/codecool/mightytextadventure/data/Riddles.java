package com.codecool.mightytextadventure.data;

public enum Riddles {

    RIDDLE1("What can travel all around the world without leaving its corner?"),
    RIDDLE2("What building has the most stories?"),
    RIDDLE3("What can you catch, but not throw?");

    private final String riddle;

    Riddles(String riddle) {
        this.riddle = riddle;
    }

    public String getRiddle() {
        return riddle;
    }
}
