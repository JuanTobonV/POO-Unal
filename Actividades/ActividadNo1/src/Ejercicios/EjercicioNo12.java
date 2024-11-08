package Ejercicios;

public class EjercicioNo12 {
    public static void main(String[] args) {
        double salarioBrutoEmpleado = 48*5000;

        double retencionFuente = salarioBrutoEmpleado *  (12.5 /100);

        double salarioNetoEmpleado = salarioBrutoEmpleado - retencionFuente;

        System.out.println("El salario bruto del empleado es: " + salarioBrutoEmpleado);
        System.out.println("La retención en la fuente es de: " + retencionFuente);
        System.out.println("El salario neto del empleado es de: " + salarioNetoEmpleado);


    }
}
