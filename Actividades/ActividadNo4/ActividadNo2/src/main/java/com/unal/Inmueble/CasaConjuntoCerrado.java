package com.unal.Inmueble;

public class CasaConjuntoCerrado extends CasaUrbana{

    protected static double valorArea = 2500000;

    protected int valorAdmin;

    protected boolean tienePiscina;

    protected boolean tieneCancha;

    public CasaConjuntoCerrado(int idMobiliario, double areaInmueble, String direccion, int noHabitaciones, int noBanos, int noPisos, int valorAdmin, boolean tienePiscina, boolean tieneCancha) {
        super(idMobiliario, areaInmueble, direccion, noHabitaciones, noBanos, noPisos);
        this.valorAdmin = valorAdmin;
        this.tienePiscina = tienePiscina;
        this.tieneCancha = tieneCancha;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Valor admin: " + valorAdmin);
        System.out.println("Tiene piscina? " + tienePiscina);
        System.out.println("Tiene cancha? " +tieneCancha);
    }
}
