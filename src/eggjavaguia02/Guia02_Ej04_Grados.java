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
public class Guia02_Ej04_Grados {

    /**
     * @param args the command line arguments
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
    La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados Celcius:");
        double C = leer.nextDouble();
        double F = 32.0 + (9.0  / 5.0)* C;
        System.out.println("Los grados celcius son: " + C );
        System.out.println("Los grados Fahrenheit son: " + F );

    }
    
}
