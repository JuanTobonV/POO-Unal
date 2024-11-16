package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los datos del trabajador
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();
        
        System.out.print("Ingrese el valor por hora normal: ");
        double valorHoraNormal = scanner.nextDouble();
        
        // Variables para los cálculos
        double salario = 0;
        int horasExtras = 0;
        int horasExtrasExcedentesDe8 = 0;

        // Calcular el salario
        if (horasTrabajadas > 40) {
            horasExtras = horasTrabajadas - 40;
            if (horasExtras > 8) {
                horasExtrasExcedentesDe8 = horasExtras - 8;
                salario = 40 * valorHoraNormal + 8 * 2 * valorHoraNormal + horasExtrasExcedentesDe8 * 3 * valorHoraNormal;
            } else {
                salario = 40 * valorHoraNormal + horasExtras * 2 * valorHoraNormal;
            }
        } else {
            salario = horasTrabajadas * valorHoraNormal;
        }
        
        // Mostrar el resultado
        System.out.println("\nEl trabajador " + nombre + " devengó: $" + salario);
    }
}

