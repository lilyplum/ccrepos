package com.codecool.pokemonminmax.ui;

import com.codecool.pokemonminmax.data.Pokemon;
import com.codecool.pokemonminmax.data.PokemonWithMoves;

import java.util.List;
import java.util.Map;


public class Display {
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_DEFAULT = "\u001B[0m";
    private final List<MenuItem> menu;

    public Display() {
        this.menu = List.of(
                MenuItem.POKEMON_NAMES,
                MenuItem.MOVE_NAMES,
                MenuItem.LIST_TYPES,
                MenuItem.POKEMON_BY_TYPE,
                MenuItem.FILTER_BY_TYPE_AND_MOVE,
                MenuItem.REGION_CAPTURE,
                MenuItem.MOST_MOVES,
                MenuItem.WEAK_AGAINST,
                MenuItem.POKEMON_WITH_MOVE_TYPE,
                MenuItem.POWERFUL_MOVE,
                MenuItem.BEST_COUNTERS,
                MenuItem.ENCOUNTER,
                MenuItem.ASSEMBLE_TEAM,
                MenuItem.EXIT
        );
    }

    public void printMenu() {
        for (MenuItem entry : menu) {
            System.out.println(entry.getMenuNumber() + "-" + entry.getMenuText());
        }
    }

    public void printPokemons(List<Pokemon> pokemons) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < pokemons.size(); ++i) {
            Pokemon pokemon = pokemons.get(i);
            int rowIdx = i + 1;
            builder.append(rowIdx);
            builder.append(": ");
            builder.append(pokemon);
            builder.append("\n");
        }
        System.out.println(builder);
    }

    public void errorMessage(String message) {
        System.out.println(ANSI_RED + message + ANSI_DEFAULT);
    }

    public void message(String message) {
        System.out.println(message);
    }

    public void printData(Record record) {
        System.out.println(record);
    }

    public void printCollectionsOfData(List<PokemonWithMoves> records) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < records.size(); ++i) {
            Record record = records.get(i);
            int rowIdx = i + 1;
            builder.append(rowIdx);
            builder.append(": ");
            builder.append(record);
            builder.append("\n");
        }
        System.out.println(builder);
    }


    public void printMapOfLong(Map<String, Long> mappedData) {
        for (Map.Entry<String, Long> pokemon : mappedData.entrySet()) {
            System.out.println(pokemon.getKey() + " : " + pokemon.getValue());
        }
    }

    public void printStrings(List<String> texts) {
        System.out.println(String.join(",", texts));
    }


}
