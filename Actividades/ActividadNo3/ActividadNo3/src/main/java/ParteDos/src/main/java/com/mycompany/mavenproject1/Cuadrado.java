package com.mycompany.mavenproject1;

public class Cuadrado {
    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    

    public Cuadrado() {
    }

    double calcularArea(){
        return lado*lado;
    }

    double calcularPerimetro(){
        return 4*lado;
    }
}
