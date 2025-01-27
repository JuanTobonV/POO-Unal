package com.unal.Inmueble;

public class Apartamento extends InmuebleVivienda {
    public Apartamento(int idMobiliario, double areaInmueble, String direccion, int noHabitaciones, int noBanos) {
        super(idMobiliario, areaInmueble, direccion, noHabitaciones, noBanos);
    }

    void imprimir() {
        super.imprimir();
    }
}
