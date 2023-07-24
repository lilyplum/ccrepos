package com.codecool.marstelescope.logic;

import com.codecool.marstelescope.logic.builder.TelescopeImageBuilder;
import com.codecool.marstelescope.data.TelescopeImage;
import com.codecool.marstelescope.data.Weather;
import com.codecool.marstelescope.io.MapReader;

import java.io.FileNotFoundException;

public class TelescopeImageDirector {

    private final MapReader mapReader;
    private final CloudGenerator cloudGenerator;
    private final TelescopeImageBuilder telescopeImageBuilder;

    public TelescopeImageDirector(MapReader mapReader, CloudGenerator cloudGenerator) {
        this.mapReader = mapReader;
        this.cloudGenerator = cloudGenerator;
        this.telescopeImageBuilder = null;
    }

    public TelescopeImage createOldOcularImage(String imageFile, String mapFile, Weather weather) throws FileNotFoundException {
        telescopeImageBuilder.reset();

        // Add the building steps to get to the desired result

        return telescopeImageBuilder.getResult();
    }

    public TelescopeImage createHawkEyeImage(String imageFile, String mapFile, Weather weather) throws FileNotFoundException {
        telescopeImageBuilder.reset();

        // Add the building steps to get to the desired result

        return telescopeImageBuilder.getResult();
    }

}
