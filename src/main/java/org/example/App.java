package org.example;

import org.example.pojo.Capacite;
import org.example.pojo.Pokemon;
import org.example.pojo.Salameche;
import org.example.stateType.Type;

import java.util.*;

/**
 * Hello world!
 *
 */

public class App
{
    public static void main( String[] args )
    {
        Map<String,Capacite> ctCapacite = new LinkedHashMap<>();
        ctCapacite.put("1",new Capacite("balle ombre",100,100, Type.SPECTRE));

        for(String i : ctCapacite.keySet()){
            System.out.println (" la ct " + i + "contient : " +ctCapacite.get(i));
        }


    }

}
