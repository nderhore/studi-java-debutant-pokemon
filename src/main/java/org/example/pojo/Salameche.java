package org.example.pojo;

import org.example.stateType.Type;

public class Salameche extends Pokemon{

    //Attribut
    private Type type;

    //Constructeur
    public Salameche(Type type){
        super();
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
