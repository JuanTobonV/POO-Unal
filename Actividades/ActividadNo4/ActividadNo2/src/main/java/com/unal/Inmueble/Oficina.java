package com.unal.Inmueble;

import javax.tools.SimpleJavaFileObject;

public class Oficina extends Local{
    protected static double valorArea = 3500000;

    private boolean esGobierno;

    public Oficina(int idMobiliario, double areaInmueble, String direccion, tipo tipoLocal, boolean esGobierno) {
        super(idMobiliario, areaInmueble, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Es oficina gubernamental: " + esGobierno);
    }
}
