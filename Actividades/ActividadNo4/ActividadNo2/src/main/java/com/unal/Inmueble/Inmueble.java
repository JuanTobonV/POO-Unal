package com.unal.Inmueble;

public class Inmueble {
    private int idMobiliario;
    private double areaInmueble;
    private String direccion;
    private double precioVenta;

    public Inmueble(int idMobiliario, double areaInmueble, String direccion) {
        this.idMobiliario = idMobiliario;
        this.areaInmueble = areaInmueble;
        this.direccion = direccion;
    }

    public double calcularValor(double valorArea ){
        precioVenta = areaInmueble * valorArea;
        return precioVenta;
    }

    void imprimir(){
        System.out.println("Identificador inmobiliario: " + idMobiliario);
        System.out.println("Area: " + areaInmueble);
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio de venta $" + precioVenta);
    }


}
