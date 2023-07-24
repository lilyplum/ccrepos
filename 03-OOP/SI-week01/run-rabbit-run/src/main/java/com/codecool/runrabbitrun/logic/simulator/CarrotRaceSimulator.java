package com.codecool.runrabbitrun.logic.simulator;

public class CarrotRaceSimulator {
    private int carrotDistanceFirstRabbit;
    private int speedFirstRabbit;
    private int carrotDistanceSecondRabbit;
    private int speedSecondRabbit;

    public CarrotRaceSimulator(int carrotDistanceFirstRabbit, int speedFirstRabbit,
                               int secondRabbitCarrotDistance, int speedSecondRabbit) {
        this.carrotDistanceFirstRabbit = carrotDistanceFirstRabbit;
        this.speedFirstRabbit = speedFirstRabbit;
        this.carrotDistanceSecondRabbit = secondRabbitCarrotDistance;
        this.speedSecondRabbit = speedSecondRabbit;
    }

    public int simulate(){
        throw new UnsupportedOperationException();
    }
}
