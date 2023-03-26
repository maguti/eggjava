/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjavaguia04;

import java.util.Scanner;

/*
 *
 * @author Usuario
 */
public class Guia04_EjExMentor01_Aleatorio {

    /*
1. Implementar una función que permita obtener un número entero aleatorio 
comprendido entre dos límites que introduciremos por teclado. 
El número obtenido se debe mostrar por pantalla.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el límite inicial:");
        int limIni = sc.nextInt();
        System.out.println("Ingrese el límite final:");
        int limFin = sc.nextInt();
        System.out.println("El número aleatorio entre " + limIni + 
                " y " + limFin + " es " + aleatorio(limIni, limFin));
        
        
    }
    
    public static int aleatorio(int limIni, int limFin) {
        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        return (int) (limIni + Math.random() * (limFin - limIni + 1));
    }
    
}
