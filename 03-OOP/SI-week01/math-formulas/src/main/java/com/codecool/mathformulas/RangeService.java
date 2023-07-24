package com.codecool.mathformulas;

public class RangeService {

    public boolean isWithin(double value, double target, double percent) {
        double rangeSize = target * (percent / 100.0); // size of the percent range
        double lowerBound = target - rangeSize;
        double upperBound = target + rangeSize;
        return (value >= lowerBound && value <= upperBound);
    }

    public double diffInPercentage(double value, double target) {
        double absoluteDifference = Math.abs(value - target);
        double percentageDifference = (absoluteDifference / target) * 100.0;
        return percentageDifference;
    }
}
