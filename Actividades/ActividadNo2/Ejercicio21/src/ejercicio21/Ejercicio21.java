package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario los lados del triángulo
        System.out.print("Ingrese el valor del lado a: ");
        double ladoA = scanner.nextDouble();
        
        System.out.print("Ingrese el valor del lado b: ");
        double ladoB = scanner.nextDouble();
        
        System.out.print("Ingrese el valor del lado c: ");
        double ladoC = scanner.nextDouble();
        
        // Cálculos
        double perimetro = ladoA + ladoB + ladoC; // Perímetro del triángulo
        double semiperimetro = perimetro / 2; // Semiperímetro
        double area = Math.sqrt(semiperimetro * 
                                (semiperimetro - ladoA) * 
                                (semiperimetro - ladoB) * 
                                (semiperimetro - ladoC)); // Fórmula de Herón
        
        // Mostrar resultados
        System.out.println("\n--- Propiedades del Triángulo ---");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Semiperímetro: " + semiperimetro);
        System.out.println("Área: " + area);
    }
}
