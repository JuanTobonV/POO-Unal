package org.unal;

import org.unal.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList<Animal> animales = new ArrayList<Animal>();

       animales.add(new Perro());
       animales.add((new Gato()));
       animales.add(new Lobo());
       animales.add(new Leones());

       for (Animal animal : animales){
           System.out.println(
                   animal.toString() + "\n" +
                   "Alimento: " + animal.getAlimentos() + "\n" +
                   "Habitad: " + animal.getHabitat() + "\n" +
                   "Sonido: " + animal.getSonido() + "\n" +
                   "Nombre cientifico: " + animal.getNombreCientifico() + "\n"
           );
       }
    }
}