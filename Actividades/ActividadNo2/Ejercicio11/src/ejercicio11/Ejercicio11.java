package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los tres números al usuario
        System.out.print("Ingrese el primer número (N1): ");
        int n1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número (N2): ");
        int n2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número (N3): ");
        int n3 = scanner.nextInt();
        
        // Variable para almacenar el número mayor
        int mayor;
        
        // Determinar cuál es el número mayor
        if (n1 > n2 && n1 > n3) {
            mayor = n1;
        } else if (n2 > n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        
        // Mostrar el resultado
        System.out.println("\nEl valor mayor entre " + n1 + ", " + n2 + " y " + n3 + " es: " + mayor);
    }
}
