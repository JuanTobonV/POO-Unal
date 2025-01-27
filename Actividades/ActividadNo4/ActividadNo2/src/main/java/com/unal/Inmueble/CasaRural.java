package com.unal.Inmueble;

public class CasaRural extends Casa{
    private long distMunicipal;
    private double latitudsnm;
    protected static double valorArea = 15000000;

    public CasaRural(int idMobiliario, double areaInmueble, String direccion, int noHabitaciones, int noBanos, int noPisos, long distMunicipal, double latitudsnm) {
        super(idMobiliario, areaInmueble, direccion, noHabitaciones, noBanos, noPisos);
        this.distMunicipal = distMunicipal;
        this.latitudsnm = latitudsnm;
    }


    void imprimir() {
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal: " + distMunicipal);
        System.out.println("Altitud sobre nivel del mar: " + latitudsnm);
    }
}
