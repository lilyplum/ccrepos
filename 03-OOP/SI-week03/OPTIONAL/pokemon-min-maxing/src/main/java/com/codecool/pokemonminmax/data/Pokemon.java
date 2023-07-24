package com.codecool.pokemonminmax.data;

import java.util.List;
import java.util.Map;

public record Pokemon(
        int number,
        String name,
        String mainType,
        String secondaryType,
        String region,
        Double attack,
        Double defense,
        Double captureRate,
        Map<Double, List<String>> resistance,
        Map<Double, List<String>> weakness,
        List<String> moves

) {
    // TODO: create supporting methods
}
