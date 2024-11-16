package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los valores de A y B al usuario
        System.out.print("Ingrese el valor de A: ");
        int a = scanner.nextInt();
        
        System.out.print("Ingrese el valor de B: ");
        int b = scanner.nextInt();
        
        // Comparar A con B y mostrar el mensaje correspondiente
        if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a == b) {
            System.out.println("A es igual a B");
        } else {
            System.out.println("A es menor que B");
        }
    }
}
