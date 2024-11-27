package org.example;

public class Main {

    public static void main(String[] args) {



        solucionesEcuaciones(1,-3,2);
    }

    public static void solucionesEcuaciones(double A, double B, double C){

        double discriminante = Math.pow(B, 2) - (4 * A * C);

        double firstSolution = ((-(B) + Math.sqrt(discriminante))/(2*A));
        double secondSolution = ((-(B) - Math.sqrt(discriminante))/(2*A));

        System.out.println("Primera solución: " + firstSolution + "\nSegunda solucion: " + secondSolution);


    }


}
