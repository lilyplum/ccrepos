package com.codecool.marstelescope;

import com.codecool.marstelescope.data.Weather;
import com.codecool.marstelescope.io.ImageWriter;
import com.codecool.marstelescope.io.MapReader;
import com.codecool.marstelescope.logic.CloudGenerator;
import com.codecool.marstelescope.data.TelescopeImage;
import com.codecool.marstelescope.logic.TelescopeImageDirector;

import java.io.FileNotFoundException;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Random random = new Random();
        TelescopeImageDirector telescopeImageDirector = new TelescopeImageDirector(
                new MapReader(),
                new CloudGenerator(random)
        );

        ImageWriter imageWriter = new ImageWriter();
        try {
            TelescopeImage image1 = telescopeImageDirector.createOldOcularImage(
                    "src/main/resources/image-1.png",
                    "src/main/resources/exploration-1.map",
                    Weather.CLEAR);
            imageWriter.write(image1.image(), image1.imageFile(), "png");
            System.out.println(image1);

            TelescopeImage image2 = telescopeImageDirector.createHawkEyeImage(
                    "src/main/resources/image-2.png",
                    "src/main/resources/exploration-2.map",
                    Weather.CLEAR);
            imageWriter.write(image2.image(), image2.imageFile(), "png");
            System.out.println(image2);

            TelescopeImage image3 = telescopeImageDirector.createHawkEyeImage(
                    "src/main/resources/image-3.png",
                    "src/main/resources/exploration-3.map",
                    Weather.OVERCAST);
            imageWriter.write(image3.image(), image3.imageFile(), "png");
            System.out.println(image3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
