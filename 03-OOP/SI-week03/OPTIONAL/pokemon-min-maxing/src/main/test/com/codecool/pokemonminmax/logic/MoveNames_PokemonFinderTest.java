package com.codecool.pokemonminmax.logic;
import com.codecool.pokemonminmax.data.Move;
import com.codecool.pokemonminmax.data.Pokemon;
import com.codecool.pokemonminmax.logic.provider.DataProviderService;
import com.codecool.pokemonminmax.logic.provider.DataProviderServiceMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

class MoveNames_PokemonFinderTest {

    private Collection<Pokemon> pokemons;
    private Collection<Move> moves;

    @BeforeEach
    void setup(){
        DataProviderService dataProviderService = new DataProviderServiceMock();
        pokemons = dataProviderService.getPokemons();
        moves = dataProviderService.getMoves();
    }

    @Test
    void getMoveNames_ValidPokemonAndMove_MoveNames() {
        List<String> expected = List.of("Tackle", "Vine Whip", "Karate Chop", "Fire Spin", "Bite", "Steel Wing");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getMoveNames();
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getMoveNames_NoPokemonsAndMoves_EmptyList() {
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), List.of());

        List<String> result = finder.getMoveNames();
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getMoveNames_NoMoves_EmptyList() {
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<String> result = finder.getMoveNames();
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getMoveNames_NoPokemons_EmptyList() {
        List<String> expected = List.of("Tackle", "Vine Whip", "Karate Chop", "Fire Spin", "Bite", "Steel Wing");
        PokemonFinder finder = new PokemonFinder(List.of(), moves);

        List<String> result = finder.getMoveNames();
        Assertions.assertIterableEquals(expected, result);
    }

}
