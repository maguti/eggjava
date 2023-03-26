/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjavaguia04;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia04_Ej04_Es_Primo {

    /**
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num = sc.nextInt();
        if (esPrimo(num)) {
            System.out.println("El número " + num + " es Primo");
        } else {
            System.out.println("El número " + num + " no es Primo");
        }
        
    }
    
    public static boolean esPrimo(int num) {
        boolean flagEsPrimo = true;
        if (num != 2 && num % 2 == 0) {
            flagEsPrimo = false;
            System.out.println("El numero es div por 2");
        }
        int i = 3;
        while (flagEsPrimo && i < num) {
            if (num != i && num % i == 0) {
                flagEsPrimo = false;
                System.out.println("El numero es div por "+ i);
                break;
            }
            i+=2;
        }
        return flagEsPrimo;
    }
    
}
