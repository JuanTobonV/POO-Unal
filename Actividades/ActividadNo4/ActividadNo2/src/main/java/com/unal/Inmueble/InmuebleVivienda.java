package com.unal.Inmueble;

public class InmuebleVivienda extends Inmueble {
    private int noHabitaciones;
    private int noBanos;

    public InmuebleVivienda(int idMobiliario, double areaInmueble, String direccion, int noHabitaciones, int noBanos) {
        super(idMobiliario, areaInmueble, direccion);
        this.noHabitaciones = noHabitaciones;
        this.noBanos = noBanos;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Numero de habitaciones: " + noHabitaciones);
        System.out.println("Numero de baños: " + noBanos);
    }
}
