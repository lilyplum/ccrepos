package com.codecool.pokemonminmax.logic.provider.mapper;

import com.codecool.pokemonminmax.data.Move;

public class MoveMapper implements Mapper<Move> {
    @Override
    public Move map(String[] data) {
        return new Move(
                data[0],
                data[1],
                Integer.parseInt(getNumberAsString(data[2]))
        );
    }

    private String getNumberAsString(String data) {
        return data.isEmpty() ? "0" : data;
    }
}
