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
public class Ejemplo_ej6_enteros {

    /**
     * @param args the command line arguments
    Implementar un programa que le pida dos números enteros al usuario 
    y determine si ambos o alguno de ellos es mayor a 25.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero:");
        int num2 = leer.nextInt();
        if (num1>25 || num2>25) {
            System.out.println("Ambos o alguno de ellos es mayor a 25");
            
        }
        else {
            System.out.println("Ninguno es mayor a 25");
        }
        
    }
    
}
