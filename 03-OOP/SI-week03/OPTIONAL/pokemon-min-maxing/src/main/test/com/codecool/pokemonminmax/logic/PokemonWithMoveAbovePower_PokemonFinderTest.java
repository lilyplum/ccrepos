package com.codecool.pokemonminmax.logic;

import com.codecool.pokemonminmax.data.Move;
import com.codecool.pokemonminmax.data.Pokemon;
import com.codecool.pokemonminmax.data.PokemonWithMoves;
import com.codecool.pokemonminmax.logic.provider.DataProviderService;
import com.codecool.pokemonminmax.logic.provider.DataProviderServiceMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;

class PokemonWithMoveAbovePower_PokemonFinderTest {

    private Collection<Pokemon> pokemons;
    private Collection<Move> moves;

    @BeforeEach
    void setup() {
        DataProviderService dataProviderService = new DataProviderServiceMock();
        pokemons = dataProviderService.getPokemons();
        moves = dataProviderService.getMoves();
    }

    @Test
    void getPokemonWithMoveWithPowerAbove_0Power_ReturnsFirst3Pokemons() {
        int rate = 0;
        List<PokemonWithMoves> expected = List.of(
                new PokemonWithMoves(new Pokemon(1, "Bulbasaur", "Grass", "Poison", "Kanto",
                        118d, 111d, 0.2,
                        Map.of(62.5d, List.of("Electric", "Fairy", "Fighting", "Water"), 39d, List.of("Grass")),
                        Map.of(160d, List.of("Fire", "Flying", "Ice", "Psychic")),
                        List.of("Tackle", "Vine Whip", "Power Whip", "Seed Bomb", "Sludge Bomb")),
                        List.of(new Move("Tackle", "Normal", 5),
                                new Move("Vine Whip", "Grass", 7))),
                new PokemonWithMoves(new Pokemon(52, "Meowth", "Normal", "", "Kanto",
                        92d, 78d, 0.5,
                        Map.of(39d, List.of("Ghost")),
                        Map.of(160d, List.of("Fighting")),
                        List.of("Bite", "Scratch", "Dark Pulse", "Foul Play", "Night Slash", "Body Slam", "Bite", "Scratch", "Dark Pulse", "Foul Play", "Night Slash", "Metal Claw", "Scratch", "Dig", "Gyro Ball", "Night Slash")),
                        List.of(new Move("Bite", "Dark", 6))),
                new PokemonWithMoves(new Pokemon(142, "Aerodactyl", "Rock", "Flying", "Kanto",
                        221d, 159d, 0.2,
                        Map.of(62.5d, List.of("Bug", "Fire", "Flying", "Ground", "Normal", "Poison")),
                        Map.of(160d, List.of("Electric", "Ice", "Rock", "Steel", "Water")),
                        List.of("Bite", "Rock Throw", "Steel Wing", "Ancient Power", "Earth Power", "Hyper Beam", "Iron Head", "Rock Slide")),
                        List.of(new Move("Bite", "Dark", 6),
                                new Move("Steel Wing", "Steel", 11)))

        );
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<PokemonWithMoves> result = finder.getPokemonWithMoveWithPowerAbove(rate);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonWithMoveWithPowerAbove_7Power_ReturnsTwoPokemon() {
        int rate = 7;
        List<PokemonWithMoves> expected = List.of(
                new PokemonWithMoves(new Pokemon(142, "Aerodactyl", "Rock", "Flying", "Kanto",
                        221d, 159d, 0.2,
                        Map.of(62.5d, List.of("Bug", "Fire", "Flying", "Ground", "Normal", "Poison")),
                        Map.of(160d, List.of("Electric", "Ice", "Rock", "Steel", "Water")),
                        List.of("Bite", "Rock Throw", "Steel Wing", "Ancient Power", "Earth Power", "Hyper Beam", "Iron Head", "Rock Slide")),
                        List.of(new Move("Bite", "Dark", 6),
                                new Move("Steel Wing", "Steel", 11))),
                new PokemonWithMoves(new Pokemon(467, "Magmortar", "Fire", "", "Sinnoh",
                        247d, 172d, 0.15,
                        Map.of(62.5d, List.of("Bug", "Fairy", "Fire", "Grass", "Ice", "Steel")),
                        Map.of(160d, List.of("Ground", "Rock", "Water")),
                        List.of("Fire Spin", "Karate Chop", "Brick Break", "Fire Blast", "Fire Punch", "Psychic", "Thunderbolt")),
                        List.of(new Move("Karate Chop", "Fighting", 8),
                                new Move("Fire Spin", "Fire", 14)))
        );
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<PokemonWithMoves> result = finder.getPokemonWithMoveWithPowerAbove(rate);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonWithMoveWithPowerAbove_13Power_ReturnsOnePokemon() {
        int rate = 13;
        List<PokemonWithMoves> expected = List.of(
                new PokemonWithMoves(new Pokemon(467, "Magmortar", "Fire", "", "Sinnoh",
                        247d, 172d, 0.15,
                        Map.of(62.5d, List.of("Bug", "Fairy", "Fire", "Grass", "Ice", "Steel")),
                        Map.of(160d, List.of("Ground", "Rock", "Water")),
                        List.of("Fire Spin", "Karate Chop", "Brick Break", "Fire Blast", "Fire Punch", "Psychic", "Thunderbolt")),
                        List.of(new Move("Karate Chop", "Fighting", 8),
                                new Move("Fire Spin", "Fire", 14)))
        );
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<PokemonWithMoves> result = finder.getPokemonWithMoveWithPowerAbove(rate);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonWithMoveWithPowerAbove_15Power_EmptyList() {
        int rate = 15;
        List<PokemonWithMoves> expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<PokemonWithMoves> result = finder.getPokemonWithMoveWithPowerAbove(rate);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonWithMoveWithPowerAbove_ValidPowerAndEmptyPokemons_EmptyList() {
        int rate = 2;
        List<PokemonWithMoves> expected = List.of();
        PokemonFinder finder = new PokemonFinder(List.of(), moves);

        List<PokemonWithMoves> result = finder.getPokemonWithMoveWithPowerAbove(rate);
        Assertions.assertIterableEquals(expected, result);
    }

    @Test
    void getPokemonWithMoveWithPowerAbove_ValidPowerAndEmptyMoves_EmptyList() {
        int rate = 2;
        List<PokemonWithMoves> expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<PokemonWithMoves> result = finder.getPokemonWithMoveWithPowerAbove(rate);
        Assertions.assertIterableEquals(expected, result);
    }
}
