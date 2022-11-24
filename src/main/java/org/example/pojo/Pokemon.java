package org.example.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Pokemon {

    private String prenom;
    private List<Capacite> capacites;
    private Integer niveau;
    private Boolean isShiny;
    private String nature;



    public Pokemon(String prenom, List<Capacite> capacites, Integer niveau, Boolean isShiny, String nature) {
        this.prenom = prenom;
        this.capacites = capacites;
        this.niveau = niveau;
        this.isShiny = isShiny;
        this.nature = nature;
    }


    public Pokemon(){
        this.capacites = new ArrayList<>();
    }


    public void addCapacities(Capacite capacite){
        if (this.capacites != null && this.capacites.size() < 4){
            this.capacites.add(capacite);
        } else if(this.capacites != null) {
            this.menuForbiddenCapacitie(capacite);

        }
    }

    private void menuForbiddenCapacitie(Capacite capacite) {
        System.out.println("Vous connaissez déjà 4 capacité.");
        System.out.println("Que voulez-vous faire ?");
        System.out.println("1 : oublier une capacite");
        System.out.println("2 : ne rien faire");
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre choix : ");
        int saisie = sc.nextInt();

        switch (saisie){
            case 1:
                Random random = new Random();
                int randomInt = random.nextInt(capacites.size()-1);
                this.capacites.remove(randomInt);
                System.out.println("la capacite " + (randomInt+1) + " a été oublié !");
                break;
            case 2:
                System.out.println("aucune capacité a été oubliée !");
                break;
            default :
                System.out.println("choix incorrecte");
        }
        sc.close();
    }

    //accesseur et mutateur
    public String getNature(){
        return this.nature;
    }

    public void setNature(String nature){
        this.nature = nature;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Capacite> getCapacites() {
        return capacites;
    }

    public void setCapacites(List<Capacite> capacites) {
        this.capacites = capacites;
    }

    public Integer getNiveau() {
        return niveau;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }

    public Boolean getShiny() {
        return isShiny;
    }

    public void setShiny(Boolean shiny) {
        isShiny = shiny;
    }

    @Override
    public String toString(){
        return "Bonjour, je m'appelle " + this.prenom + " et je possède " + this.capacites.size() + " capacites";
    }
}
