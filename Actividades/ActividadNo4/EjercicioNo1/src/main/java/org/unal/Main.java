package org.unal;

import org.unal.models.Cuenta;
import org.unal.models.CuentaAhorros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cuenta de ahorros");
        System.out.print("Ingrese saldo inicial= $");
        float saldoInicialAhorros = input.nextFloat();

        System.out.print("Ingrese tasa de interés= ");
        float tasaAhorros = input.nextFloat();

        CuentaAhorros cuenta1 = new CuentaAhorros(tasaAhorros, saldoInicialAhorros);

        System.out.print("Ingresar cantidad a consignar: $");

        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);

        System.out.print("Ingresar cantidad a retirar: $");
        float cantidadRetirar = input.nextFloat();

        cuenta1.retirar(cantidadRetirar);
        cuenta1.aplicandoExtractoMensual();
        cuenta1.imprimir();

    }
}