package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los datos del estudiante
        System.out.print("Ingrese el número de inscripción: ");
        int numeroInscripcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el patrimonio del estudiante: ");
        double patrimonio = scanner.nextDouble();

        System.out.print("Ingrese el estrato social del estudiante: ");
        int estratoSocial = scanner.nextInt();

        // Cálculo del pago por matrícula
        double pagoMatricula = 50000; // Valor base de la matrícula

        if (patrimonio > 2000000 && estratoSocial > 3) {
            pagoMatricula += patrimonio * 0.03; // Incremento del 3% sobre el patrimonio
        }

        // Mostrar los resultados
        System.out.println("\n--- Liquidación de Matrícula ---");
        System.out.println("Número de inscripción: " + numeroInscripcion);
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Pago por matrícula: $" + pagoMatricula);
    }
}
