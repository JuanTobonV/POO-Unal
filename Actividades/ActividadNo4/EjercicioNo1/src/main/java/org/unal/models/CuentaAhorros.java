package org.unal.models;

public class CuentaAhorros extends Cuenta{

    protected boolean esActiva;

    public CuentaAhorros(float tasaAnual, float saldo) {
        super(tasaAnual, saldo);

        if (saldo < 10000){
            esActiva = false;
        }
        else {
            esActiva = true;
        }
    }

    public void consignar(float cantidad){
        if (esActiva){
            super.consignar(cantidad);
        }
        else {
            System.out.println("Cuenta no activa");
        }
    }

    public void retirar(float cantidad){
        if (esActiva){
            super.retirar(cantidad);
        }
        else {
            System.out.println("Cuenta no activa");
        }
    }

    public void comisionMensual(){
        if (noRetiros > 4){
            comisionMensual  += (noRetiros - 4 ) * 1000;
        }

        super.aplicandoExtractoMensual();

        if (saldo < 1000){
            esActiva = false;
        }
    }

    public void imprimir(){
        System.out.println( "Saldo: $" + saldo );
        System.out.println("Comisión mensual: $" + comisionMensual);
        System.out.println("Movimientos: " + (noRetiros+noConsignaciones));


    }

}
