package com.codecool.marstelescope.logic.builder;

import com.codecool.marstelescope.data.TelescopeType;
import com.codecool.marstelescope.data.TerrainElement;
import com.codecool.marstelescope.data.Weather;
import com.codecool.marstelescope.data.TelescopeImage;

import java.awt.*;
import java.util.List;

public interface TelescopeImageBuilder {

    void reset();
    void setImageFile(String imageFile);
    void setTelescopeType(TelescopeType telescopeType);
    void setMapData(List<String> mapData);
    void setTerrainElementColor(TerrainElement terrainElement);
    void setTerrainElementColor(TerrainElement terrainElement, Color color);
    void setUnitSize(int unitSize);
    void setBlurPatchSize(int blurPatchRadius);
    void setNoiseAmplitude(double noiseAmplitude);
    void setWeather(Weather weather);
    void addPixelFault(int x, int y);
    TelescopeImage getResult();
}
