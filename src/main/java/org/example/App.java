package org.example;

import org.example.pojo.Pokemon;
import org.example.pojo.Salameche;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String maString = "toto"; //String maString = new String("toto");
        List<String> mesCapacites = new ArrayList<>(Arrays.asList(
                "griffe",
                "rugissement"
        ));
        Salameche monPokemon = new Salameche("feu");
        System.out.println(monPokemon);

    }
}
