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
public class Guia02_Ej02_Nombre {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = leer.nextLine();
        System.out.println("Su nombre es " + nombre);

    }
    
}
