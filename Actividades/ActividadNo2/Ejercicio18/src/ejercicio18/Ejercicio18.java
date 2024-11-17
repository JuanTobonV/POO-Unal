package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar y capturar los datos del empleado
        System.out.print("Ingrese el código del empleado: ");
        String codigo = scanner.nextLine();
        
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el número de horas trabajadas al mes: ");
        int horasTrabajadas = scanner.nextInt();
        
        System.out.print("Ingrese el valor por hora trabajada: ");
        double valorHora = scanner.nextDouble();
        
        System.out.print("Ingrese el porcentaje de retención en la fuente: ");
        double retencion = scanner.nextDouble();
        
        // Cálculos
        double salarioBruto = horasTrabajadas * valorHora;
        double salarioNeto = salarioBruto - (salarioBruto * (retencion / 100));
        
        // Mostrar resultados
        System.out.println("\n--- Información del Empleado ---");
        System.out.println("Código del empleado: " + codigo);
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Salario neto: " + salarioNeto);
    }
}

