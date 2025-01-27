package ejerciciono4;

import carreraciclistica.*;

public class EjercicioNo4 {

    public static void main(String[] args) {
        // Crear un equipo
        Equipo equipo1 = new Equipo("Sky", "Estados Unidos");

        // Crear ciclistas
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas", 320, 25);
        Escalador escalador1 = new Escalador(123980, "Egan Bernal", 25, 10);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981, "Jonathan Castroviejo", 120);

        // Añadir ciclistas al equipo
        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);

        // Asignar tiempos acumulados
        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarrelojista1.setTiempoAcumulado(370);

        // Calcular el tiempo total del equipo
        equipo1.calcularTotalTiempo();

        // Imprimir los datos del equipo
        equipo1.imprimir();

        // Listar los ciclistas del equipo
        equipo1.listarEquipo();

        // Buscar un ciclista
        System.out.println("\nBuscando ciclista 'Egan Bernal':");
        equipo1.buscarCiclista("Egan Bernal");

        System.out.println("\nBuscando ciclista 'Chris Froome':");
        equipo1.buscarCiclista("Chris Froome"); // No existe
    }
}

