/*
 */
package eggjavaguia02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia02_Ej01_Suma_Enteros {

    /**
     * @param args the command line arguments
    Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
    El programa deberá después mostrar el resultado de la suma.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero:");
        int num2 = leer.nextInt();
        System.out.println("La suma de los dos enteros es: " + (num1+num2));
    }
    
}
