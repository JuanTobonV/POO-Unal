package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pesoEsferaA = input.nextDouble();
        double pesoEsferaB = input.nextDouble();
        double pesoEsferaC = input.nextDouble();

        if (pesoEsferaA > pesoEsferaB && pesoEsferaA > pesoEsferaC){
            System.out.println("La esfera con mayor peso es la A");

        } else if (pesoEsferaB > pesoEsferaA && pesoEsferaB > pesoEsferaC) {

            System.out.println("La esfera con mayor peso es la B");

        } else {
            System.out.println("La esfera con mayor peso es la C");
        }

    }
}