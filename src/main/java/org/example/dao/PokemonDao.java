package org.example.dao;

import org.example.pojo.Pokemon;

import java.sql.SQLException;
import java.util.List;

public interface PokemonDao {

    void addPokemon(Pokemon pokemon) throws SQLException;

    List<Pokemon> getAllPokemon() throws SQLException;

    Pokemon getPokemonByPrenom(String prenom) throws SQLException;

    void deletePokemon(String prenom) throws SQLException;

    void update(Pokemon pokemon, String prenom) throws SQLException;
}
