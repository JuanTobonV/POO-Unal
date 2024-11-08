package Ejercicios;

import java.util.Scanner;

public class EjercicioNo14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double numeroUsuario = input.nextInt();

        System.out.println("El número ingresado por el usuario es: " + numeroUsuario);
        System.out.println("El cuadrado de ese número es: " + Math.pow(numeroUsuario,2));
        System.out.println("El cubo de ese número es: " + Math.pow(numeroUsuario,3));


    }

}
