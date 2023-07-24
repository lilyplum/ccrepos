package com.codecool.pokemonminmax.logic.provider;

import com.codecool.pokemonminmax.data.Move;
import com.codecool.pokemonminmax.data.Pokemon;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class DataProviderServiceMock extends DataProviderService {

    @Override
    public Collection<Pokemon> getPokemons() {
        return pokemons;
    }

    @Override
    public Collection<Move> getMoves() {
        return moves;
    }

    static final Collection<Pokemon> pokemons =
            List.of(
                    new Pokemon(1, "Bulbasaur", "Grass", "Poison", "Kanto",
                            118d,111d, 0.2,
                            Map.of(62.5d, List.of("Electric", "Fairy", "Fighting", "Water"), 39d, List.of("Grass")),
                            Map.of(160d, List.of("Fire", "Flying", "Ice", "Psychic")),
                            List.of("Tackle", "Vine Whip", "Power Whip", "Seed Bomb", "Sludge Bomb")),
                    new Pokemon(52, "Meowth", "Normal", "", "Kanto",
                            92d,78d, 0.5,
                            Map.of( 39d, List.of("Ghost")),
                            Map.of(160d, List.of("Fighting")),
                            List.of("Bite", "Scratch", "Dark Pulse", "Foul Play", "Night Slash", "Body Slam", "Bite", "Scratch", "Dark Pulse", "Foul Play", "Night Slash", "Metal Claw", "Scratch", "Dig", "Gyro Ball", "Night Slash")),
                    new Pokemon(142, "Aerodactyl", "Rock", "Flying", "Kanto",
                            221d,159d, 0.2,
                            Map.of( 62.5d, List.of("Bug", "Fire", "Flying", "Ground", "Normal", "Poison")),
                            Map.of(160d, List.of("Electric", "Ice", "Rock", "Steel", "Water")),
                            List.of("Bite", "Rock Throw", "Steel Wing", "Ancient Power", "Earth Power", "Hyper Beam", "Iron Head", "Rock Slide")),
                    new Pokemon(467, "Magmortar", "Fire", "", "Sinnoh",
                            247d,172d, 0.15,
                            Map.of( 62.5d, List.of("Bug", "Fairy", "Fire", "Grass", "Ice", "Steel")),
                            Map.of(160d, List.of("Ground", "Rock", "Water")),
                            List.of("Fire Spin", "Karate Chop", "Brick Break", "Fire Blast", "Fire Punch", "Psychic", "Thunderbolt"))

            );


    static final Collection<Move> moves = List.of(
            new Move("Tackle", "Normal", 5),
            new Move("Vine Whip", "Grass", 7),
            new Move("Karate Chop", "Fighting", 8),
            new Move("Fire Spin", "Fire", 14),
            new Move("Bite", "Dark", 6),
            new Move("Steel Wing", "Steel",11)
    );
}
