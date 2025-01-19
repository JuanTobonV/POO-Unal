package org.unal.models;

public abstract class Animal {
    private String sonido;
    private String alimentos;
    private String habitat;
    private String nombreCientifico;

    public abstract String getSonido();

    public abstract String getAlimentos();

    public abstract String getHabitat();

    public abstract String getNombreCientifico();

    public abstract String toString();
}
