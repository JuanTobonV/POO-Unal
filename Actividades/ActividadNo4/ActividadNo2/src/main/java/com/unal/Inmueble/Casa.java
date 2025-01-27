package com.unal.Inmueble;

public class Casa extends InmuebleVivienda{
    private int noPisos;

    public Casa(int idMobiliario, double areaInmueble, String direccion, int noHabitaciones, int noBanos, int noPisos) {
        super(idMobiliario, areaInmueble, direccion, noHabitaciones, noBanos);
        this.noPisos = noPisos;
    }


    void imprimir() {
        super.imprimir();
        System.out.println("No de pisos: " + noPisos);
    }
}
