package carreraciclistica;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    private String nombre;
    private String pais;
    private static double totalTiempo;
    private ArrayList<Ciclista> listaCiclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0;
        listaCiclistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    public void listarEquipo() {
        System.out.println("Lista de Ciclistas del Equipo:");
        for (Ciclista c : listaCiclistas) {
            System.out.println(c.getNombre());
        }
    }

    public void buscarCiclista(String nombreCiclista) {
        boolean encontrado = false;
        for (Ciclista c : listaCiclistas) {
            if (c.getNombre().equalsIgnoreCase(nombreCiclista)) {
                c.imprimir();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Ciclista no encontrado.");
        }
    }

    public void calcularTotalTiempo() {
        totalTiempo = 0;
        for (Ciclista c : listaCiclistas) {
            totalTiempo += c.getTiempoAcumulado();
        }
    }

    public void imprimir() {
        System.out.println("Nombre del Equipo: " + nombre);
        System.out.println("País del Equipo: " + pais);
        System.out.println("Tiempo Total del Equipo: " + totalTiempo + " minutos");
    }
}
