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

class BestTeamComposition_PokemonFinderTest {

    private Collection<Pokemon>  pokemons;
    private Collection<Move> moves;

    @BeforeEach
    void setup(){
        DataProviderService dataProviderService = new DataProviderServiceMock();
        pokemons = dataProviderService.getPokemons();
        moves = dataProviderService.getMoves();
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_OnePokemonTeam_ReturnsCounterPokemons() {
        List<String> team = List.of("Bulbasaur");
        List<String> expected = List.of("Magmortar");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getBestTeamCompositionAgainst(team);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_TwoPokemonTeam_ReturnsCounterPokemons() {
        List<String> team = List.of("Bulbasaur", "Magmortar");
        List<String> expected = List.of("Magmortar", "Magmortar");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getBestTeamCompositionAgainst(team);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_FourPokemonTeam_ReturnsCounterPokemons() {
        List<String> team = List.of("Aerodactyl", "Meowth", "Magmortar");
        List<String> expected = List.of("Aerodactyl", "Magmortar", "Magmortar");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getBestTeamCompositionAgainst(team);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_ThreePokemonTeam_ReturnsCounterPokemons() {
        List<String> team = List.of("Meowth", "Magmortar", "Aerodactyl", "Bulbasaur");
        List<String> expected = List.of("Magmortar", "Magmortar", "Aerodactyl", "Magmortar");
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getBestTeamCompositionAgainst(team);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_InvalidPokemonTeam_EmptyList() {
        List<String> team = List.of("Rock", "Paper", "Scissors");
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<String> result = finder.getBestTeamCompositionAgainst(team);
        Assertions.assertEquals(expected, result);
    }


    @Test
    void getPokemonsCanBeBestEncounteredBy_ValidTeamEmptyPokemon_EmptyList() {
        List<String> team = List.of("Meowth", "Magmortar", "Aerodactyl");
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), moves);

        List<String> result = finder.getBestTeamCompositionAgainst(team);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsCanBeBestEncounteredBy_ValidTeamEmptyMove_ReturnsFirstPokemon() {
        List<String> team = List.of("Meowth", "Magmortar", "Aerodactyl");
        List<String> expected = List.of("Bulbasaur", "Bulbasaur", "Bulbasaur");
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<String> result = finder.getBestTeamCompositionAgainst(team);
        Assertions.assertEquals(expected, result);
    }

}
