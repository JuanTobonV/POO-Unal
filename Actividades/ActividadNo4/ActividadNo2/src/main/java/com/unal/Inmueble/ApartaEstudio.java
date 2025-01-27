package com.unal.Inmueble;

public class ApartaEstudio extends Apartamento{
    protected static double valorArea = 1500000;

    public ApartaEstudio(int idMobiliario, double areaInmueble, String direccion, int noHabitaciones, int noBanos) {
        super(idMobiliario, areaInmueble, direccion, 1, 1);
    }

    @Override
    void imprimir() {
        super.imprimir();
    }
}
