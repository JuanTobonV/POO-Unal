package org.unal.models;

public class CuentaCorriente extends Cuenta{
    private float sobregiro = 0;

    public CuentaCorriente(float tasaAnual, float saldo) {
        super(tasaAnual, saldo);
    }

    public void retirar(float cantidad){
        float resultado = saldo - cantidad;

        if (resultado < 0) {
            sobregiro -= resultado;
            saldo = 0;
        }
        else{
            super.retirar(cantidad);
        }

    }

    public void consignar(float cantidad){
        float residuo = saldo - cantidad;
        if(sobregiro > 0){
            if (residuo > 0){
                sobregiro = 0;
                saldo = residuo;
            }
            else {
                sobregiro -= residuo;
                saldo = 0;

            }

        }
        else {
           super.consignar(cantidad);
        }
    }

    public void extractoMensual(){
        super.aplicandoExtractoMensual();
    }

    public void imprimir(){
        System.out.println("Saldo: $" + saldo + "\n");
        System.out.println("Cargo mensual: $" + comisionMensual + "\n");
        System.out.println("No transacciones: " + (noConsignaciones + noRetiros));



    }
}
