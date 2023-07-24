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

class TypeNames_PokemonFinderTest {

    private Collection<Pokemon> pokemons;
    private Collection<Move> moves;

    @BeforeEach
    void setup(){
        DataProviderService dataProviderService = new DataProviderServiceMock();
        pokemons = dataProviderService.getPokemons();
        moves = dataProviderService.getMoves();
    }

    @Test
    void getTypeNames_ValidPokemonAndMove_MoveNames() {
        List<String> expected = List.of("Rock", "Fire", "Grass", "Normal");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getPokemonTypeNames();
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getTypeNames_NoPokemonsAndMoves_EmptyList() {
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), List.of());

        List<String> result = finder.getPokemonTypeNames();
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getTypeNames_NoMoves_EmptyList() {
        List<String> expected = List.of("Rock", "Fire", "Grass", "Normal");
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<String> result = finder.getPokemonTypeNames();
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getTypeNames_NoPokemons_EmptyList() {
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), moves);

        List<String> result = finder.getPokemonTypeNames();
        Assertions.assertIterableEquals(expected, result);
    }

}
