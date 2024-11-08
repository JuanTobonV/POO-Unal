package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double PI = 3.1415;

        System.out.println("Ingrese radio circulo");
        double radioCirculo = input.nextDouble();

        double areaCirculo = PI * Math.pow(radioCirculo, 2);

        double longitudCircunferencia = PI * (radioCirculo*2);

        System.out.println("El radio de la circunferencia es: " + radioCirculo );
        System.out.println("El area de este circulo es: " + areaCirculo);
        System.out.println("La longitud de la circunferencia es de: " + longitudCircunferencia);

    }
}
