package com.unal.Inmueble;

public class LocalComercial extends Local {
    protected static double valorArea = 3000000;

    private String centroComercial;

    public LocalComercial(int idMobiliario, double areaInmueble, String direccion, tipo tipoLocal, String centroComercial) {
        super(idMobiliario, areaInmueble, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial: " + centroComercial);
    }

}
