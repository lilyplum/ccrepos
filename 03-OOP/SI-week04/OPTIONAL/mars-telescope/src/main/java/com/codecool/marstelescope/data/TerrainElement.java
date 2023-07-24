package com.codecool.marstelescope.data;

import java.awt.Color;

public enum TerrainElement {
    BACKGROUND(' ', new Color(255, 70, 25)),
    MOUNTAIN('^', new Color(200, 40, 0)),
    PIT('#', new Color(200, 100, 0)),
    MINERAL('*', new Color(159, 23, 23)),
    WATER('~', new Color(0, 44, 166));

    private final char sign;
    private final Color defaultColor;

    TerrainElement(char sign, Color defaultColor) {
        this.sign = sign;
        this.defaultColor = defaultColor;
    }

    public char getSign() {
        return sign;
    }

    public Color getDefaultColor() {
        return defaultColor;
    }
}
