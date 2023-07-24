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
import java.util.Map;

class PokemonsByType_PokemonFinderTest {

    private Collection<Pokemon>  pokemons;
    private Collection<Move> moves;

    @BeforeEach
    void setup(){
        DataProviderService dataProviderService = new DataProviderServiceMock();
        pokemons = dataProviderService.getPokemons();
        moves = dataProviderService.getMoves();
    }

    @Test
    void getPokemonsWithType_RockType_RockPokemons() {
        String type = "Rock";
        List<Pokemon> expected = List.of(new Pokemon(142, "Aerodactyl", "Rock", "Flying", "Kanto",
                        221d,159d, 0.2,
                        Map.of( 62.5d, List.of("Bug", "Fire", "Flying", "Ground", "Normal", "Poison")),
                        Map.of(160d, List.of("Electric", "Ice", "Rock", "Steel", "Water")),
                        List.of("Bite", "Rock Throw", "Steel Wing", "Ancient Power", "Earth Power", "Hyper Beam", "Iron Head", "Rock Slide"))
                );
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<Pokemon> result = finder.getPokemonsWithType(type);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonsWithType_GrassType_GrassPokemons() {
        String type = "Grass";
        List<Pokemon> expected = List.of(new Pokemon(1, "Bulbasaur", "Grass", "Poison", "Kanto",
                118d,111d, 0.2,
                Map.of(62.5d, List.of("Electric", "Fairy", "Fighting", "Water"), 39d, List.of("Grass")),
                Map.of(160d, List.of("Fire", "Flying", "Ice", "Psychic")),
                List.of("Tackle", "Vine Whip", "Power Whip", "Seed Bomb", "Sludge Bomb")));
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<Pokemon> result = finder.getPokemonsWithType(type);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonsWithTyp_RockTypeAndNoMoves_RockPokemons() {
        String type = "Rock";
        List<Pokemon> expected = List.of(new Pokemon(142, "Aerodactyl", "Rock", "Flying", "Kanto",
                221d,159d, 0.2,
                Map.of( 62.5d, List.of("Bug", "Fire", "Flying", "Ground", "Normal", "Poison")),
                Map.of(160d, List.of("Electric", "Ice", "Rock", "Steel", "Water")),
                List.of("Bite", "Rock Throw", "Steel Wing", "Ancient Power", "Earth Power", "Hyper Beam", "Iron Head", "Rock Slide"))
        );
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<Pokemon> result = finder.getPokemonsWithType(type);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getTypeNames_InvalidType_EmptyList() {
        String type = "Paper";
        List<Pokemon> expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<Pokemon> result = finder.getPokemonsWithType(type);
        Assertions.assertIterableEquals(expected, result);
    }


    @Test
    void getTypeNames_NoPokemonsValidType_EmptyList() {
        String type = "Rock";
        List<String> expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), moves);

        List<Pokemon> result = finder.getPokemonsWithType(type);
        Assertions.assertIterableEquals(expected, result);
    }

}
