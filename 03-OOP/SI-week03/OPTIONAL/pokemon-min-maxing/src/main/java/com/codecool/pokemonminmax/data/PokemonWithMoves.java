package com.codecool.pokemonminmax.data;

import java.util.List;

public record PokemonWithMoves(
        Pokemon pokemon,
        List<Move> moves
) {
    // TODO: create supporting methods
}
