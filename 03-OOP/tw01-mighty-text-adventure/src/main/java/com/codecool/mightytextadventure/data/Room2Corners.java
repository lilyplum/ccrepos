package com.codecool.mightytextadventure.data;

public enum Room2Corners {
    UPPER_LEFT("Upper Left"),
    UPPER_RIGHT("Upper Right"),
    LOWER_LEFT("Lower Left"),
    LOWER_RIGHT("Lower Right");

    private String corner;

    Room2Corners (String corner) {
        this.corner = corner;
    }

    public String getCorner() {
        return corner;
    }



}
