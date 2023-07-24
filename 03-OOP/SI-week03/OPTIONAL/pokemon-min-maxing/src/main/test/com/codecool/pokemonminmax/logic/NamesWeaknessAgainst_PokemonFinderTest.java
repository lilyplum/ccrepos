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

class NamesWeaknessAgainst_PokemonFinderTest {

    private Collection<Pokemon>  pokemons;
    private Collection<Move> moves;

    @BeforeEach
    void setup(){
        DataProviderService dataProviderService = new DataProviderServiceMock();
        pokemons = dataProviderService.getPokemons();
        moves = dataProviderService.getMoves();
    }

    @Test
    void getPokemonNamesWithWeakness_WeaknessIsRock_ReturnsTwoPokemons() {
        String type = "Rock";
        List<String>  expected = List.of("Aerodactyl", "Magmortar");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getPokemonNamesWithWeakness(type);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonNamesWithWeakness_WeaknessIsFighting_ReturnsPokemons() {
        String type = "Fighting";
        List<String>  expected = List.of("Meowth");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getPokemonNamesWithWeakness(type);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonNamesWithWeakness_NonExistentWeakness_EmptyList() {
        String type = "Scissors";
        List<String>  expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getPokemonNamesWithWeakness(type);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonNamesWithWeakness_ValidWeaknessAndEmptyPokemons_EmptyList() {
        String type = "Rock";
        List<String>  expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), moves);

        List<String> result = finder.getPokemonNamesWithWeakness(type);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonNamesWithWeakness_ValidWeaknessAndEmptyMoves_ReturnsPokemons() {
        String type = "Water";
        List<String>  expected = List.of("Aerodactyl", "Magmortar");
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<String> result = finder.getPokemonNamesWithWeakness(type);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonNamesWithWeakness_InvalidWeaknessAndEmptyMoves_EmptyList() {
        String type = "Scissors";
        List<String>  expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<String> result = finder.getPokemonNamesWithWeakness(type);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonNamesWithWeakness_InvalidWeaknessAndEmptyPokemon_EmptyList() {
        String type = "Scissors";
        List<String>  expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), moves);

        List<String> result = finder.getPokemonNamesWithWeakness(type);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonNamesWithWeakness_ValidWeaknessAndEmptyPokemonAndMoves_EmptyList() {
        String type = "Water";
        List<String>  expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), List.of());

        List<String> result = finder.getPokemonNamesWithWeakness(type);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonNamesWithWeakness_InvalidWeaknessAndEmptyPokemonAndMoves_EmptyList() {
        String type = "Scissors";
        List<String>  expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), List.of());

        List<String> result = finder.getPokemonNamesWithWeakness(type);
        Assertions.assertIterableEquals(expected, result);
    }
}
