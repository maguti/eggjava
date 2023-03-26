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
public class Guia03_Ej01_Par_Impar {

    /**
     * @param args the command line arguments
    1. Crear un programa que dado un número determine si es par o impar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es Par");
        } else {
            System.out.println("El número " + num + " es Impar");
        }
    }
    
}
