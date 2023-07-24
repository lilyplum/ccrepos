package com.codecool.pokemonminmax.logic;

import com.codecool.pokemonminmax.data.Move;
import com.codecool.pokemonminmax.data.Pokemon;
import com.codecool.pokemonminmax.data.PokemonWithMoves;

import java.util.*;

public class PokemonFinder {
    Collection<Pokemon> pokemons;
    Collection<Move> moves;

    public PokemonFinder(Collection<Pokemon> pokemons, Collection<Move> moves) {
        this.pokemons = pokemons;
        this.moves = moves;
    }

    // Return the names of the Pokemons
    public List<String> getPokemonNames() {
        throw new UnsupportedOperationException();
    }

    // Return the names of the Moves
    public List<String> getMoveNames() {
        throw new UnsupportedOperationException();
    }

    // Return the Pokemons' type names
    public List<String> getPokemonTypeNames() {
        throw new UnsupportedOperationException();
    }

    // Select the Pokemons by type name
    public List<Pokemon> getPokemonsWithType(String type) {
        throw new UnsupportedOperationException();
    }

    // Find Pokemons with type and with a specific move type
    public List<Pokemon> getPokemonWithTypeAndMove(String type, String move) {
        throw new UnsupportedOperationException();
    }

    // Get Pokemon count group by region where capture rate is below 5%
    // rate is between 0 and 1
    public Map<String, Long> getPokemonsCountByRegionsWithCaptureRateBelow(float rate) {
        throw new UnsupportedOperationException();
    }

    // Select the Pokemon with the most move
    public Optional<Pokemon> getPokemonWitMostAttackMove() {
        throw new UnsupportedOperationException();
    }

    // Get 5 Pokemons names which has the weakness of a given type
    public List<String> getPokemonNamesWithWeakness(String type) {
        throw new UnsupportedOperationException();
    }

    // Get Pokemons with Move type (eg: Ghost)
    public Optional<PokemonWithMoves> getPokemonWithMoveType(String moveType) {
        throw new UnsupportedOperationException();
    }

    // Get the top 3 Pokemons with a fast move with gym raid power above 15 (find first)
    public List<PokemonWithMoves> getPokemonWithMoveWithPowerAbove(int power) {
        throw new UnsupportedOperationException();
    }

    // Find name of the best 3 counters for a specific Pokemon
    // check the weaknesses, type_rate * move_power * attack =
    public List<String> getBestPokemonCountersAgainst(String name) {
        throw new UnsupportedOperationException();
    }

    // Find the names of 6 pokemons that can be countered by a specific Pokemon
    // check the, type_rate * move_power * attack =
    public List<String> getPokemonsCanBeBestEncounteredBy(String name) {
        throw new UnsupportedOperationException();
    }

    // Best team against enemy team
    public List<String> getBestTeamCompositionAgainst(List<String> enemyTeam){
        throw new UnsupportedOperationException();
    }
}
