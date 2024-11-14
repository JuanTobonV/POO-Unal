package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 22 pag 66

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese nombre del empleado");
        String nombreEmpleado = input.next();

        System.out.println("Ingrese salario del empleado por hora");
        double salarioEmpleado = input.nextDouble();

        System.out.println("Ingrese el número de horas trabajadas en el mes");
        int numeroHorasMes = input.nextInt();

        if (salarioEmpleado * numeroHorasMes > 450000){
            System.out.println("Nombre empleado: " + nombreEmpleado + "\nsalario mensual: " + (salarioEmpleado * numeroHorasMes));
        }
        else {
            System.out.println("Nombre empleado: " + nombreEmpleado);
        }
    }
}