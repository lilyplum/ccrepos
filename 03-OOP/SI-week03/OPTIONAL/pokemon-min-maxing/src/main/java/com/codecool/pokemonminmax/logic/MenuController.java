package com.codecool.pokemonminmax.logic;

import com.codecool.pokemonminmax.data.Pokemon;
import com.codecool.pokemonminmax.data.PokemonWithMoves;
import com.codecool.pokemonminmax.ui.Display;
import com.codecool.pokemonminmax.ui.Input;
import com.codecool.pokemonminmax.ui.MenuItem;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MenuController {
    private final PokemonFinder finder;
    private final Input input;
    private final Display display;

    public MenuController(PokemonFinder finder, Input input, Display display) {
        this.finder = finder;
        this.input = input;
        this.display = display;
    }

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            display.printMenu();
            int menuItemIndex = input.getNumericUserInput("Please select a menu item!");
            MenuItem item = MenuItem.selectItem(menuItemIndex);
            isRunning = invokeMenuItem(item);
        }
    }

    private boolean invokeMenuItem(MenuItem selectedMenu) {
        switch (selectedMenu) {
            case EXIT -> {
                return false;
            }
            case POKEMON_NAMES -> getPokemonNames();
            case MOVE_NAMES -> getMoveNames();
            case LIST_TYPES -> getPokemonTypes();
            case POKEMON_BY_TYPE -> getPokemonsByType();
            case FILTER_BY_TYPE_AND_MOVE -> getPokemonWithTypeAndMove();
            case REGION_CAPTURE -> getPokemonsCountByRegionsWithCaptureRateBelow();
            case MOST_MOVES -> getPokemonWitMostAttackMove();
            case WEAK_AGAINST -> getPokemonNamesWithWeakness();
            case POKEMON_WITH_MOVE_TYPE -> getPokemonWithMoveType();
            case POWERFUL_MOVE -> getPokemonWithMoveWithPowerAbove();
            case BEST_COUNTERS -> getBestCounterForPokemon();
            case ENCOUNTER -> getPokemonsThatCanBeCounteredBy();
            case ASSEMBLE_TEAM -> getBestTeamAgainstTeam();
            default -> display.errorMessage("Invalid menu item selection!\n");
        }
        return true;
    }

    private void getPokemonNames() {
        List<String> pokemons = finder.getPokemonNames();
        display.printStrings(pokemons);
    }

    private void getMoveNames() {
        List<String> moves = finder.getMoveNames();
        display.printStrings(moves);
    }

    private void getPokemonTypes() {
        List<String> types = finder.getPokemonTypeNames();
        display.printStrings(types);
    }

    private void getPokemonsByType() {
        String type = input.getStringUserInput("Enter a type");
        List<Pokemon> pokemons = finder.getPokemonsWithType(type);
        display.printPokemons(pokemons);
    }

    private void getPokemonWitMostAttackMove() {
        Optional<Pokemon> pokemon = finder.getPokemonWitMostAttackMove();
        if (pokemon.isPresent())
            display.printData(pokemon.get());
        else
            display.errorMessage("There is no pokemon!");
    }


    private void getPokemonWithTypeAndMove() {
        String type = input.getStringUserInput("Enter a type:");
        String moveName = input.getStringUserInput("Enter a move name:");
        List<Pokemon> pokemons = finder.getPokemonWithTypeAndMove(type, moveName);
        display.printPokemons(pokemons);
    }

    private void getPokemonNamesWithWeakness() {
        String type = input.getStringUserInput("Enter a type:");
        List<String> pokemons = finder.getPokemonNamesWithWeakness(type);
        display.printStrings(pokemons);
    }

    private void getPokemonWithMoveWithPowerAbove() {
        int power = input.getNumericUserInput("Enter a power value:");
        List<PokemonWithMoves> pokemon = finder.getPokemonWithMoveWithPowerAbove(power);
        if(!pokemon.isEmpty())
            display.printCollectionsOfData(pokemon);
        else
            display.errorMessage("There is no pokemon!");
    }

    private void getPokemonWithMoveType() {
        String moveType = input.getStringUserInput("Enter a move type:");
        Optional<PokemonWithMoves> pokemon = finder.getPokemonWithMoveType(moveType);
        if (pokemon.isPresent())
            display.printData(pokemon.get());
        else
            display.errorMessage("There is no pokemon!");
    }

    private void getPokemonsCountByRegionsWithCaptureRateBelow() {
        float rate = input.getFloatNumericUserInput("Enter a rate (0-1):");
        Map<String, Long> pokemons = finder.getPokemonsCountByRegionsWithCaptureRateBelow(rate);
        display.printMapOfLong(pokemons);
    }


    private void getBestCounterForPokemon() {
        String pokemonName = input.getStringUserInput("Enter a pokemon name:");
        var pokemons = finder.getBestPokemonCountersAgainst(pokemonName);
        display.printStrings(pokemons);
    }

    private void getPokemonsThatCanBeCounteredBy() {
        String pokemonName = input.getStringUserInput("Enter a pokemon name:");
        var pokemons = finder.getPokemonsCanBeBestEncounteredBy(pokemonName);
        display.printStrings(pokemons);
    }

    private void getBestTeamAgainstTeam() {
        int teamSize = input.getNumericUserInput("Define team size:");
        List<String> enemyTeam = new LinkedList<>();
        for (int i = 0; i < teamSize; i++) {
            String pokemonName = input.getStringUserInput("Enter a pokemon name:");
            enemyTeam.add(pokemonName);
        }
        var pokemons = finder.getBestTeamCompositionAgainst(enemyTeam);
        display.printStrings(pokemons);
    }
}
