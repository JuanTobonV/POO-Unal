package Ejercicios;

public class EjercicioNo5 {
    public static void main(String[] args) {
        double suma = 0;
        double x = 20;

        suma = suma + x;

        double y = 40;

        x += Math.pow(y,2);

        suma += x/y;

        System.out.println("El valor de la suma es: " + suma);
    }
}
