package org.unal.models;

public class Gato extends Felinos{
    public String getSonido(){
        return "Maullido";
    }

    public String getAlimentos(){
        return "Ratones";
    }

    public String getHabitat(){
        return "Doméstico";
    }

    public String getNombreCientifico(){
        return "Felis silvestris catus";
    }

    @Override
    public String toString() {
        return "Gato: ";
    }
}
