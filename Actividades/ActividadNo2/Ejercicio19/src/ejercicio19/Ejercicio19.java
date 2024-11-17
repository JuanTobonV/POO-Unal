package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el valor del lado del triángulo
        System.out.print("Ingrese el valor del lado del triángulo equilátero: ");
        double lado = scanner.nextDouble();
        
        // Cálculos
        double perimetro = 3 * lado; // Perímetro del triángulo
        double altura = (Math.sqrt(3) / 2) * lado; // Altura del triángulo
        double area = (lado * altura) / 2; // Área del triángulo
        
        // Mostrar resultados
        System.out.println("\n--- Propiedades del Triángulo Equilátero ---");
        System.out.println("Lado: " + lado);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
    }
}
