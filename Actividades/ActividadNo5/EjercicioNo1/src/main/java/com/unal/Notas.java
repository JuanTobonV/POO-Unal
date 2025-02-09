package com.unal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanv
 */
public class Notas {
    double[] notas;
    
    public Notas(){
        notas = new double[5]; 
    }
    
    public double calcularPromedio(){
        double suma = 0;
        for(int i=1; i < notas.length; i++) {
        suma = suma + notas[i];
        }
        return (suma/notas.length);
    }
    
    public double desvEstandar(){
        double promedio = calcularPromedio();
        double suma = 0;
        for(int i=0; i < notas.length; i++) {
            suma += Math.pow(notas[i] - promedio, 2 );
        }
        return Math.sqrt (suma/notas.length );
    }

    public double calcularMenor() {
        double menor = notas[0];
        
        for(int i=0; i < notas.length; i++) { // Se recorre el array
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        return menor;
    }

    public double calcularMayor() {
        double mayor = notas[0];
        for(int i=0; i < notas.length; i++) { // Se recorre el array
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }
        return mayor;
    }
}