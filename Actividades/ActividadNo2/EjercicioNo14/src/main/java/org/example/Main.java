package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese las ventas del departamento #1");
        double ventasDepartamentoNo1 = input.nextDouble();

        System.out.println("Ingrese las ventas del departamento #2");
        double ventasDepartamentoNo2 = input.nextDouble();

        System.out.println("Ingrese las ventas del departamento #3");
        double ventasDepartamentoNo3 = input.nextDouble();

        System.out.println("Ingrese el salario de los trabajadores");
        double salario = input.nextDouble();

        double salarioDepa1;
        double salarioDepa2;
        double salarioDepa3;

        double ventasTotales = ventasDepartamentoNo1 + ventasDepartamentoNo2 + ventasDepartamentoNo3;

        double porcentajeVentasTotales = ventasTotales * 0.33;

        if (ventasDepartamentoNo1 > porcentajeVentasTotales){
            salarioDepa1 = salario + (salario*0.2);
        }
        else {
            salarioDepa1 = salario;
        }

        if (ventasDepartamentoNo2 > porcentajeVentasTotales) {
            salarioDepa2 = salario + (salario*0.2);

        }
        else {
            salarioDepa2 = salario;
        }

        if (ventasDepartamentoNo3 > porcentajeVentasTotales) {
            salarioDepa3 = salario + (salario * 0.2);
        }
        else {
            salarioDepa3 = salario;
        }

        System.out.println("salario depa 1:" + salarioDepa1 + " salario depa 2:" + salarioDepa2 + " salario depa 3:" + salarioDepa3);

    }
}