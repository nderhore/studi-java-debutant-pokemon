package org.example.dao.impl;

import org.example.dao.PokemonDao;
import org.example.database.DatabaseConnection;
import org.example.pojo.Pokemon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PokemonDaoImpl implements PokemonDao {

    Connection connection = DatabaseConnection.getConnection();

    @Override
    public void addPokemon(Pokemon pokemon) throws SQLException {
        String query = "insert into pokemon (prenom,niveau,isShiny,nature) VALUES" +
                "(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1,pokemon.getPrenom());
        ps.setInt(2,pokemon.getNiveau());
        ps.setBoolean(3,pokemon.getShiny());
        ps.setString(4,pokemon.getNature());
        ps.executeUpdate();

    }

    @Override
    public List<Pokemon> getAllPokemon() throws SQLException {
        String query = "select * from pokemon";
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Pokemon> pokemonList = new ArrayList<>();
        while(rs.next()){
            Pokemon pokemon = new Pokemon();
            pokemon.setPrenom(rs.getString("prenom"));
            pokemon.setNiveau(rs.getInt("niveau"));
            pokemon.setNature(rs.getString("nature"));
            pokemon.setShiny(rs.getBoolean("isShiny"));
            pokemonList.add(pokemon);
        }
        return pokemonList;
    }

    @Override
    public Pokemon getPokemonByPrenom(String prenom) throws SQLException{
        String query = "select * from pokemon where prenom = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1,prenom);
        ResultSet rs = ps.executeQuery();
        Pokemon pokemon = new Pokemon();
        boolean check = false;

        while(rs.next()){
            check = true;
            pokemon.setPrenom(rs.getString("prenom"));
            pokemon.setNiveau(rs.getInt("niveau"));
            pokemon.setNature(rs.getString("nature"));
            pokemon.setShiny(rs.getBoolean("isShiny"));
        }
        if(check){
            return pokemon;
        } else{
            return null;
        }
    }

    @Override
    public void deletePokemon(String prenom) throws SQLException{
        String query = "delete from pokemon where prenom = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1,prenom);
        ps.executeUpdate();

    }

    @Override
    public void update(Pokemon pokemon,String prenom) throws SQLException{
        String query = "update pokemon set prenom = ?,niveau = ?,isShiny = ?,nature = ? where prenom = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1,pokemon.getPrenom());
        ps.setInt(2,pokemon.getNiveau());
        ps.setBoolean(3,pokemon.getShiny());
        ps.setString(4,pokemon.getNature());
        ps.setString(5,prenom);
        ps.executeUpdate();
    }
}
