package com.codecool.pokemonminmax;

import com.codecool.pokemonminmax.logic.MenuController;
import com.codecool.pokemonminmax.logic.PokemonFinder;
import com.codecool.pokemonminmax.logic.provider.DataProviderService;
import com.codecool.pokemonminmax.ui.Display;
import com.codecool.pokemonminmax.ui.Input;

public class Application {

    public static void main(String[] args) {
        DataProviderService providerService = new DataProviderService();
        providerService.init();
        var pokemons = providerService.getPokemons();
        var moves = providerService.getMoves();

        PokemonFinder finder = new PokemonFinder(pokemons, moves);
        Display display = new Display();
        Input input = new Input(display);

        MenuController application = new MenuController(finder, input, display);
        application.run();
    }
}
