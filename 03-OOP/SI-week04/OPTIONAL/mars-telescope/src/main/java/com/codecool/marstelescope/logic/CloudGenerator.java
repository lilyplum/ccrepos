package com.codecool.marstelescope.logic;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class CloudGenerator {

    private final Random random;

    public CloudGenerator(Random random) {
        this.random = random;
    }

    public Image create(int width, int height, double coverage) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        // Todo
        return image;
    }
}
