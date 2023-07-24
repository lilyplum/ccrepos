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

class CounterAgainstPokemon_PokemonFinderTest {

    private Collection<Pokemon>  pokemons;
    private Collection<Move> moves;

    @BeforeEach
    void setup(){
        DataProviderService dataProviderService = new DataProviderServiceMock();
        pokemons = dataProviderService.getPokemons();
        moves = dataProviderService.getMoves();
    }

    @Test
    void getBestPokemonCountersAgainst_Bulbasaur_ReturnsCounterPokemons() {
        String name = "Bulbasaur";
        List<String> expected = List.of("Magmortar", "Bulbasaur", "Aerodactyl");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getBestPokemonCountersAgainst(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getBestPokemonCountersAgainst_Aerodactyl_ReturnsCounterPokemons() {
        String name = "Aerodactyl";
        List<String> expected = List.of("Aerodactyl", "Magmortar", "Bulbasaur");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getBestPokemonCountersAgainst(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getBestPokemonCountersAgainst_NonExistentPokemon_EmptyList() {
        String name = "Paper";
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getBestPokemonCountersAgainst(name);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getBestPokemonCountersAgainst_ValidPokemonAndEmptyPokemons_EmptyList() {
        String name = "Aerodactyl";
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), moves);

        List<String> result = finder.getBestPokemonCountersAgainst(name);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getBestPokemonCountersAgainst_ValidPokemonAndEmptyMoves_ReturnFirst3OfPokemonList() {
        String name = "Aerodactyl";
        List<String> expected = List.of("Bulbasaur", "Meowth", "Aerodactyl");
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<String> result = finder.getBestPokemonCountersAgainst(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getBestPokemonCountersAgainst_InvalidPokemonAndEmptyMoves_EmptyList() {
        String name = "Paper";
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<String> result = finder.getBestPokemonCountersAgainst(name);
        Assertions.assertEquals(expected, result);
    }
}
