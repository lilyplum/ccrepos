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

class TypesAndMoves_PokemonFinderTest {

    private Collection<Pokemon>  pokemons;
    private Collection<Move> moves;

    @BeforeEach
    void setup(){
        DataProviderService dataProviderService = new DataProviderServiceMock();
        pokemons = dataProviderService.getPokemons();
        moves = dataProviderService.getMoves();
    }

    @Test
    void getPokemonsWithTypeAndMove_ValidTypeAndMove_ReturnsPokemon() {
        String type = "Normal";
        String move = "Dark Pulse";
        List<Pokemon> expected = List.of(new Pokemon(52, "Meowth", "Normal", "", "Kanto",
                        92d,78d, 0.5,
                        Map.of( 39d, List.of("Ghost")),
                        Map.of(160d, List.of("Fighting")),
                        List.of("Bite", "Scratch", "Dark Pulse", "Foul Play", "Night Slash", "Body Slam", "Bite", "Scratch", "Dark Pulse", "Foul Play", "Night Slash", "Metal Claw", "Scratch", "Dig", "Gyro Ball", "Night Slash"))
                );
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<Pokemon> result = finder.getPokemonWithTypeAndMove(type, move);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsWithTypeAndMove_ValidTypeAndMove_EmptyList() {
        String type = "Grass";
        String move = "Night Slash";
        List<Pokemon> expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        List<Pokemon> result = finder.getPokemonWithTypeAndMove(type, move);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsWithTypeAndMove_ValidTypeAndMoveEmptyMove_PokemonList() {
        String type = "Normal";
        String move = "Dark Pulse";
        List<Pokemon> expected = List.of(new Pokemon(52, "Meowth", "Normal", "", "Kanto",
                92d,78d, 0.5,
                Map.of( 39d, List.of("Ghost")),
                Map.of(160d, List.of("Fighting")),
                List.of("Bite", "Scratch", "Dark Pulse", "Foul Play", "Night Slash", "Body Slam", "Bite", "Scratch", "Dark Pulse", "Foul Play", "Night Slash", "Metal Claw", "Scratch", "Dig", "Gyro Ball", "Night Slash"))
        );
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<Pokemon> result = finder.getPokemonWithTypeAndMove(type, move);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsWithTypeAndMove_InvalidTypeAndValidMove_EmptyList() {
        String type = "Paper";
        String move = "Dark Pulse";
        List<Pokemon> expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<Pokemon> result = finder.getPokemonWithTypeAndMove(type, move);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsWithTypeAndMove_ValidTypeAndInvalidMove_EmptyList() {
        String type = "Normal";
        String move = "Dance";
        List<Pokemon> expected = List.of();
        PokemonFinder finder = new PokemonFinder(pokemons, List.of());

        List<Pokemon> result = finder.getPokemonWithTypeAndMove(type, move);
        Assertions.assertEquals(expected, result);
    }
}
