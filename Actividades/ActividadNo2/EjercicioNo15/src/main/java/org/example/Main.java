package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pesoEsferaA = input.nextDouble();
        double pesoEsferaB = input.nextDouble();
        double pesoEsferaC = input.nextDouble();
        double pesoEsferaD = input.nextDouble();

        if ((pesoEsferaA == pesoEsferaB) && (pesoEsferaA == pesoEsferaC)){
            if (pesoEsferaD > pesoEsferaA){
                System.out.println("La esfera D es la diferente y tiene un mayor peso.");
            }
            else {
                System.out.println("La esfera D es la diferente y tiene un menor peso.");
            }

        } else {

            if (pesoEsferaA == pesoEsferaB && pesoEsferaA == pesoEsferaD){
                if (pesoEsferaC > pesoEsferaA){
                    System.out.println("La esfera C es la diferente y tiene un mayor peso.");
                }
                else {
                    System.out.println("La esfera C es la diferente y tiene un menor peso.");
                }
            }
            else {
                if (pesoEsferaA == pesoEsferaC && pesoEsferaA == pesoEsferaD){
                    if (pesoEsferaB > pesoEsferaA){
                        System.out.println("La esfera B es la diferente y tiene un mayor peso.");
                    }
                    else {
                        System.out.println("La esfera B es la diferente y tiene un menor peso.");
                    }
                }
                else {
                    if (pesoEsferaA > pesoEsferaB){
                        System.out.println("La esfera A es la diferente y tiene un mayor peso.");

                    }
                    else {
                        System.out.println("La esfera A es la diferente y tiene un menor peso.");

                    }
                }
            }
        }
    }
}