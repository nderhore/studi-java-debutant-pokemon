package org.example;

import org.example.pojo.Capacite;
import org.example.pojo.Dresseur;
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
        //Creation de la partie !
        Dresseur monDresseur = new Dresseur("Studi",10,new ArrayList<>());
        int saisie = 0;
        while(saisie != 4) {
            saisie = 0;
            System.out.println("Que souhaitez vous faire ?");
            System.out.println("1: capturer un pokemon");
            System.out.println("2: attendre");
            System.out.println("3: afficher pokemon");
            System.out.println("4: quitter");
            Scanner sc = new Scanner(System.in);
            try {
                saisie = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Vous n'avez pas saisie un entier, retour au menu !");
            }catch (Exception e){
                System.out.println("Exception non connue");
            }

            switch (saisie){
                case 1:
                    monDresseur.capturerPokemon(new Pokemon());
                    break;
                case 2:
                    continue;
                case 3:
                    System.out.println(monDresseur.getPokemonList());
                    break;
                case 4:
                    System.out.println("merci d'avoir choisi Poké-services !");
                    break;
                default:
                    System.out.println("choix invalide, veuillez recommencer");
            }


        }

    }

}
