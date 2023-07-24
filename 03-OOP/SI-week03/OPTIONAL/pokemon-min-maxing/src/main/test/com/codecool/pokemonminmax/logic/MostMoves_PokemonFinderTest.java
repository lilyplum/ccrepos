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
import java.util.Optional;

class MostMoves_PokemonFinderTest {

    private Collection<Pokemon>  pokemons;
    private Collection<Move> moves;

    @BeforeEach
    void setup(){
        DataProviderService dataProviderService = new DataProviderServiceMock();
        pokemons = dataProviderService.getPokemons();
        moves = dataProviderService.getMoves();
    }

    @Test
    void getPokemonsWithMostMoves_ValidPokemonAndMove_ReturnsPokemon() {
        Optional<Pokemon> expected = Optional.of(new Pokemon(52, "Meowth", "Normal", "", "Kanto",
                        92d,78d, 0.5,
                        Map.of( 39d, List.of("Ghost")),
                        Map.of(160d, List.of("Fighting")),
                        List.of("Bite", "Scratch", "Dark Pulse", "Foul Play", "Night Slash", "Body Slam", "Bite", "Scratch", "Dark Pulse", "Foul Play", "Night Slash", "Metal Claw", "Scratch", "Dig", "Gyro Ball", "Night Slash"))
                );
        PokemonFinder finder = new PokemonFinder(pokemons, moves);

        Optional<Pokemon> result = finder.getPokemonWitMostAttackMove();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsWithMostMoves_EmptyPokemon_OptionalEmpty() {
        Optional<Pokemon> expected = Optional.empty();
        PokemonFinder finder = new PokemonFinder(List.of(), moves);

        Optional<Pokemon> result = finder.getPokemonWitMostAttackMove();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPokemonsWithMostMoves_EmptyPokemonAndMoves_OptionalEmpty() {
        Optional<Pokemon> expected = Optional.empty();
        PokemonFinder finder = new PokemonFinder(List.of(), List.of());

        Optional<Pokemon> result = finder.getPokemonWitMostAttackMove();
        Assertions.assertEquals(expected, result);
    }
}
