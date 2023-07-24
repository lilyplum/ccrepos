package com.codecool.pokemonminmax.logic.provider;

import com.codecool.pokemonminmax.data.Move;
import com.codecool.pokemonminmax.data.Pokemon;
import com.codecool.pokemonminmax.logic.provider.mapper.Mapper;
import com.codecool.pokemonminmax.logic.provider.mapper.MoveMapper;
import com.codecool.pokemonminmax.logic.provider.mapper.PokemonMapper;
import com.codecool.pokemonminmax.logic.provider.parser.CsvFileParser;
import com.codecool.pokemonminmax.logic.provider.parser.Parser;

import java.util.Collection;


public class DataProviderService {
    private Collection<Pokemon> pokemons;
    private Collection<Move> moves;

    public void init(){
        String pokemonFileName = "pokemon.csv";
        Mapper<Pokemon> pokemonMapper = new PokemonMapper();
        Parser<Pokemon> pokemonParser = new CsvFileParser<>(pokemonMapper);
        pokemons = pokemonParser.process(pokemonFileName);

        String pokemonFastMoveName = "pokemon-fast-move.csv";
        Mapper<Move> move = new MoveMapper();
        Parser<Move> moveParser = new CsvFileParser<>(move);
        moves = moveParser.process(pokemonFastMoveName);

    }

    public Collection<Pokemon> getPokemons(){
        return pokemons;
    }

    public Collection<Move> getMoves(){
        return moves;
    }


}
