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
public class Guia04_EjExMentor04_Al_reves {

    /**
4. Crea un programa que pida el nombre al usuario y lo escriba al revés (de la última letra a la primera).

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nombre:");
        String nombre = sc.nextLine();
        String nombre2 = "";
        alreves(nombre, nombre2);
        System.out.println("El nombre " + nombre + nombre2);
    }
    
    public static void alreves(String nombre, String nombre2) {
        for (int i = nombre.length()-1; i >= 0 ; i--) {
            System.out.println("i " + i);
            System.out.println("Substring " + nombre.substring(i, i+1));
            nombre2 += nombre.substring(i, i+1);
            
        }
    }
}
