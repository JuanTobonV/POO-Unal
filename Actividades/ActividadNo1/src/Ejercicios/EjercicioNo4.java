package Ejercicios;

import java.util.Scanner;

public class EjercicioNo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int edadJuan = input.nextInt();

        double edadAlberto = (2.0 / 3.0) * edadJuan;
        double edadAna = (4.0 / 3.0) * edadJuan;

        double edadMama = edadJuan + edadAna + edadAlberto;

        System.out.println("Las edades son: Alberto " + edadAlberto + ", Juan: " + edadJuan + ", Ana: " + edadAna + ", mamá: " + edadMama);
    }
}
