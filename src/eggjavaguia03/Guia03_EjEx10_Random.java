/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjavaguia03;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia03_EjEx10_Random {

    /**
Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. 
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int mult = num1 * num2;
        int respuesta;
        System.out.println("Aleatorio 1: " + num1);
        System.out.println("Aleatorio 2: " + num2);
        System.out.println("La multiplicación es: " + mult);
        do {            
            System.out.println("Ingrese un número entre 0 y 100:");
            respuesta = sc.nextInt();
            if (respuesta == mult) {
                System.out.println("Respuesta correcta");
            }
        } while (respuesta != mult);
    }
    
}
