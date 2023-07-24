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

class EncountersForPokemon_PokemonFinderTest {

    private Collection<Pokemon>  pokemons;
    private Collection<Move> moves;

    @BeforeEach
    void setup(){
        DataProviderService dataProviderService = new DataProviderServiceMock();
        pokemons = dataProviderService.getPokemons();
        moves = dataProviderService.getMoves();
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_Bulbasaur_ReturnsCounterPokemons() {
        String name = "Bulbasaur";
        List<String> expected = List.of("Magmortar", "Aerodactyl", "Bulbasaur", "Meowth");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getPokemonsCanBeBestEncounteredBy(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_Aerodactyl_ReturnsCounterPokemons() {
        String name = "Aerodactyl";
        List<String> expected = List.of("Aerodactyl", "Magmortar", "Bulbasaur", "Meowth");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getPokemonsCanBeBestEncounteredBy(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_Magmortar_ReturnsCounterPokemons() {
        String name = "Magmortar";
        List<String> expected = List.of("Bulbasaur", "Meowth", "Aerodactyl", "Magmortar");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getPokemonsCanBeBestEncounteredBy(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_Meowth_ReturnsCounterPokemons() {
        String name = "Meowth";
        List<String> expected = List.of("Bulbasaur", "Meowth", "Aerodactyl", "Magmortar");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getPokemonsCanBeBestEncounteredBy(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_InvalidName_ReturnsCounterPokemons() {
        String name = "Paper";
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getPokemonsCanBeBestEncounteredBy(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_ValidNameEmptyPokemons_EmptyList() {
        String name = "Meowth";
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), moves);

        List<String> result = finder.getPokemonsCanBeBestEncounteredBy(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_ValidNameEmptyMoves_ReturnsPokemonsInOrder() {
        String name = "Meowth";
        List<String> expected = List.of("Bulbasaur", "Meowth", "Aerodactyl", "Magmortar");
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<String> result = finder.getPokemonsCanBeBestEncounteredBy(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_ValidNameEmptyPokemonsAndMoves_EmptyList() {
        String name = "Meowth";
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), List.of());

        List<String> result = finder.getPokemonsCanBeBestEncounteredBy(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_InvalidNameAndEmptyPokemon_ReturnsCounterPokemons() {
        String name = "Paper";
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), moves);

        List<String> result = finder.getPokemonsCanBeBestEncounteredBy(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_InvalidNameAndEmptyPokemonAndMove_ReturnsCounterPokemons() {
        String name = "Paper";
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), List.of());

        List<String> result = finder.getPokemonsCanBeBestEncounteredBy(name);
        Assertions.assertEquals(expected, result);
    }
}
