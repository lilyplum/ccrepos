package com.codecool.pokemonminmax.logic;
import com.codecool.pokemonminmax.data.Move;
import com.codecool.pokemonminmax.data.Pokemon;
import com.codecool.pokemonminmax.logic.provider.DataProviderService;
import com.codecool.pokemonminmax.logic.provider.DataProviderServiceMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

class AmountOfPokePerRegionForCaptureRate_PokemonFinderTest {

    private Collection<Pokemon>  pokemons;
    private Collection<Move> moves;

    @BeforeEach
    void setup(){
        DataProviderService dataProviderService = new DataProviderServiceMock();
        pokemons = dataProviderService.getPokemons();
        moves = dataProviderService.getMoves();
    }

    @Test
    void getPokemonsCountByRegionsWithCaptureRateBelow_100PercentCapture_ReturnsEveryPokemon() {
        float rate = 1f;
        Map<String, Long>  expected = Map.of("Sinnoh",1L, "Kanto",3L);
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        Map<String, Long> result = finder.getPokemonsCountByRegionsWithCaptureRateBelow(rate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCountByRegionsWithCaptureRateBelow_20PercentCapture_ReturnsSomePokemon() {
        float rate = 0.2f;
        Map<String, Long>  expected = Map.of("Sinnoh",1L, "Kanto",2L);
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        Map<String, Long> result = finder.getPokemonsCountByRegionsWithCaptureRateBelow(rate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCountByRegionsWithCaptureRateBelow_15PercentCapture_ReturnsSomePokemon() {
        float rate = 0.15f;
        Map<String, Long>  expected = Map.of("Sinnoh",1L);
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        Map<String, Long> result = finder.getPokemonsCountByRegionsWithCaptureRateBelow(rate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCountByRegionsWithCaptureRateBelow_1PercentCapture_ReturnsEmpty() {
        float rate = 0.01f;
        Map<String, Long>  expected = Map.of();
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        Map<String, Long> result = finder.getPokemonsCountByRegionsWithCaptureRateBelow(rate);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCountByRegionsWithCaptureRateBelow_EmptyPokemon_ReturnsEmpty() {
        float rate = 1f;
        Map<String, Long>  expected = Map.of();
        PokemonFinder finder = new PokemonFinder(List.of(), moves);

        Map<String, Long> result = finder.getPokemonsCountByRegionsWithCaptureRateBelow(rate);
        Assertions.assertEquals(expected, result);
    }


}
