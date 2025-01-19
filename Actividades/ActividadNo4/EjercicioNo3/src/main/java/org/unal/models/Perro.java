package org.unal.models;

public class Perro  extends Canidos{
    public String getSonido(){
        return "Ladrido";
    }

    public String getAlimentos(){
        return "Carnivora";
    }

    public String getHabitat(){
        return "Domestico";
    }

    public  String getNombreCientifico(){
        return "Canis lupus familiaris";
    }

    @Override
    public String toString() {
        return "Perro: ";
    }
}
