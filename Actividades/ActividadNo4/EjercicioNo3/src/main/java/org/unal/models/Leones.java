package org.unal.models;

public class Leones extends Felinos{
    public String getSonido(){
        return "Rugido";
    }

    public String getAlimentos(){
        return "Carnivora";
    }

    public String getHabitat(){
        return "Pradera";
    }

    public String getNombreCientifico(){
        return "Panthera leo";
    }

    @Override
    public String toString() {
        return "León: ";
    }
}
