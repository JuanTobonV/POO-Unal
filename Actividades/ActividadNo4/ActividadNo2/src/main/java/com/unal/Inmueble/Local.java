package com.unal.Inmueble;

public class Local extends Inmueble{
    enum tipo {
        INTERNO,
        CALLE
    }

    private tipo tipoLocal;

    public Local(int idMobiliario, double areaInmueble, String direccion, tipo tipoLocal) {
        super(idMobiliario, areaInmueble, direccion);
        this.tipoLocal = tipoLocal;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local: " + tipoLocal);
    }
}
