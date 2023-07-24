package com.codecool.pokemonminmax.logic.provider.parser;

import java.util.Collection;

public interface Parser<T> {
    Collection<T> process(String file);
}
