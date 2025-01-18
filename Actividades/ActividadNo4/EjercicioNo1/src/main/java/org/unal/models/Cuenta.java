package org.unal.models;

public class Cuenta {
    protected float saldo;
    protected int noConsignaciones = 0;
    protected int noRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float tasaAnual, float saldo) {
        this.tasaAnual = tasaAnual;
        this.saldo = saldo;
    }

    public void consignar(float dineroConsignacion){
        saldo += dineroConsignacion;

        System.out.println("\nConsignando $" + dineroConsignacion + " ...");
        System.out.println("saldo " + saldo + "\n");

        noConsignaciones++;

    }

    public void retirar(float dineroRetiro){
        if (dineroRetiro > saldo){
            System.out.println("Saldos insuficientes\n");
        }
        else{
            saldo -= dineroRetiro;
            System.out.println("Retirando $" + dineroRetiro + " ...");
            System.out.println(saldo + "\n");

            noRetiros++;

        }
    }

    public void calcInteresMensual(){
        float interesMensual = saldo * (tasaAnual / 12);

        saldo += interesMensual;
    }

    public  void aplicandoExtrandoMensual() {
        saldo -= comisionMensual;
        calcInteresMensual();
    }

    @Override
    public String toString() {
        return  "INFORMACIÓN DE LA CUENTA" + "\n"+
                "Saldo: " + saldo + "\n" +
                "No consignaciones: " + noConsignaciones +"\n"+
                "No retiros " + noRetiros + "\n" +
                "Tasa Anual: " + tasaAnual + "\n";
    }
}
