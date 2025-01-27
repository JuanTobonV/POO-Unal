package com.unal.Inmueble;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;

    private int valorAdmin;

    public ApartamentoFamiliar(int idMobiliario, double areaInmueble, String direccion, int noHabitaciones, int noBanos, int valorAdmin) {
        super(idMobiliario, areaInmueble, direccion, noHabitaciones, noBanos);
        this.valorAdmin = valorAdmin;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Valor de la admin $");

    }
}
