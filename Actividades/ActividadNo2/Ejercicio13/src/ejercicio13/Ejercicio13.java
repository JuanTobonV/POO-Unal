package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el valor de la compra y el color de la bolita
        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el color de la bolita (Blanco, Verde, Amarillo, Azul, Roja): ");
        String colorBolita = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para evitar problemas de comparación

        // Variable para almacenar el porcentaje de descuento
        int porcentajeDescuento;

        // Determinar el porcentaje de descuento basado en el color de la bolita
        switch (colorBolita) {
            case "blanco":
                porcentajeDescuento = 0;
                break;
            case "verde":
                porcentajeDescuento = 10;
                break;
            case "amarillo":
                porcentajeDescuento = 25;
                break;
            case "azul":
                porcentajeDescuento = 50;
                break;
            default: // Si no es ninguno de los anteriores, se asume que es roja
                porcentajeDescuento = 100;
                break;
        }

        // Calcular el valor a pagar
        double valorAPagar = valorCompra - (porcentajeDescuento * valorCompra / 100);

        // Mostrar el resultado
        System.out.println("\nEl cliente debe pagar: $" + valorAPagar);
    }
}
