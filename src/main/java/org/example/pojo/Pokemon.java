package org.example.pojo;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {

    //Attribut
    private String prenom;
    private List<String> capacites;
    private Integer niveau;
    private Boolean isShiny;
    private String nature;

    //Constructeur
    public Pokemon(String prenom, List<String> capacites, Integer niveau, Boolean isShiny, String nature) {
        this.prenom = prenom;
        this.capacites = capacites;
        this.niveau = niveau;
        this.isShiny = isShiny;
        this.nature = nature;
    }

    public Pokemon(){
        this.capacites = new ArrayList<>();
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

    public List<String> getCapacites() {
        return capacites;
    }

    public void setCapacites(List<String> capacites) {
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
