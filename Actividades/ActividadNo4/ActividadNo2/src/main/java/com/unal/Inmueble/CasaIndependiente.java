package com.unal.Inmueble;

public class CasaIndependiente extends CasaUrbana{
    protected static double valorArea = 3000000;

    public CasaIndependiente(int idMobiliario, double areaInmueble, String direccion, int noHabitaciones, int noBanos, int noPisos) {
        super(idMobiliario, areaInmueble, direccion, noHabitaciones, noBanos, noPisos);
    }

    @Override
    void imprimir() {
        super.imprimir();
    }
}
