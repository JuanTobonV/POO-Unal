package org.unal.models;

public class Lobo extends Canidos{
    public String getSonido(){
        return "Aullido";
    }

    public String getAlimentos(){
        return "Carnivora";
    }

    public String getHabitat(){
        return "Bosque";
    }

    public String getNombreCientifico(){
        return "Canis lupus";
    }

    @Override
    public String toString() {
        return "Lobo: ";
    }
}
