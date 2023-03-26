/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjavaguia02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia02_Ej03_Frase_Mayus_Minus {

    /**
     * @param args the command line arguments
    Escribir un programa que pida una frase y la muestre toda en mayúsculas 
    y después toda en minúsculas. 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese una frase:");   
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        System.out.println("La frase original es " + frase );
        System.out.println("La frase en mayúsculas es "+ frase.toUpperCase());
        System.out.println("La frase en minúsculas es "+ frase.toLowerCase());

    }
    
}
