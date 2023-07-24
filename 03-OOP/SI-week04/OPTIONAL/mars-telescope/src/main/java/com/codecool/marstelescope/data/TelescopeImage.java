package com.codecool.marstelescope.data;

import java.awt.image.BufferedImage;

public record TelescopeImage (String imageFile, TelescopeType telescopeType, Weather weather, BufferedImage image) {

    @Override
    public String toString() {
        return "Telescope Image " + '\n' +
                "Metadata: \n" +
                "  Source: " + imageFile + '\n' +
                "  Telescope: " + telescopeType + '\n' +
                "  Weather: " + weather + '\n';
    }
}
