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
public class Guia03_EjEx01_Min2DiaHora {

    /**
Guia03_EjEx01 - Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos:");
        long minIng = leer.nextLong();
        long dias;
        
        dias = Math.floorDiv(minIng, (60 * 24));
        long horas = Math.floorDiv((minIng - dias * 60 * 24), 60);
        long minutos = minIng - dias * 60 * 24 - horas * 60;
        System.out.print("Equivale a: " + dias + " a días");
        System.out.print(" y " + horas + " horas");
        System.out.println(" y " + minutos + " min.");
    }
    
}
