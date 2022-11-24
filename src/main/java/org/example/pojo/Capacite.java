package org.example.pojo;

import org.example.stateType.Type;

public class Capacite {

    private String libelle;

    private Integer puissance;

    private Integer precision;

    private Type type;

    public Capacite(String libelle, Integer puissance, Integer precision, Type type) {
        this.libelle = libelle;
        this.puissance = puissance;
        this.precision = precision;
        this.type = type;
    }

    public Capacite() {
    }


    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getPuissance() {
        return puissance;
    }

    public void setPuissance(Integer puissance) {
        this.puissance = puissance;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "la capacite " + this.libelle + " a une précision de " + this.precision + ", une puissance de " + this.puissance
                + " et est de type " + this.type;
    }
}
