package com.codecool.pokemonminmax.ui;

import java.util.Arrays;

public enum MenuItem {
    POKEMON_NAMES(1, "List all Pokemon names"),
    MOVE_NAMES(2, "List all move names"),
    LIST_TYPES(3, "List all Pokemon type"),
    POKEMON_BY_TYPE(4, "List Pokemons by type"),
    FILTER_BY_TYPE_AND_MOVE(5, "List pokemons with type and move"),
    REGION_CAPTURE(6, "Pokemon names for region with smaller capture rate"),
    MOST_MOVES(7, "Pokemon with most move"),
    WEAK_AGAINST(8, "Top 5 Pokemon names that weak against move type"),
    POKEMON_WITH_MOVE_TYPE(9, "List Pokemons with specific type of move"),
    POWERFUL_MOVE(10, "Top 3 Pokemon with moves power above a specific value"),
    BEST_COUNTERS(11, "Best 3 counter Pokemons against"),
    ENCOUNTER(12, "Top 5 Pokemons can be encountered by specific Pokemon"),
    ASSEMBLE_TEAM(13, "Assemble best team against enemy team"),
    EXIT(0, "Exit");

    private int menuNumber;
    private String menuText;

    MenuItem(int menuNumber, String menuText) {
        this.menuNumber = menuNumber;
        this.menuText = menuText;
    }

    public static MenuItem selectItem(int menuItemIndex) {
        return Arrays.stream(values())
                .filter( e-> e.menuNumber == menuItemIndex)
                .findFirst().get();
    }

    public String getMenuNumber() {
        return String.valueOf(menuNumber);
    }

    public String getMenuText() {
        return menuText;
    }
}
