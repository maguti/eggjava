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
public class Guia03_EjEx06_Altura {

    /**
    Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
    por debajo de 1.60 mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de personas:");
        int personas = sc.nextInt();
        int cantMenor = 0;
        double altura, suma = 0, sumaMenor = 0;
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura:");
            altura = sc.nextDouble();
            suma += altura;
            if (altura < 1.60) {
                sumaMenor += altura;
                cantMenor++;
            }
        }
        System.out.println("Promedio menor a 1.60 " + (sumaMenor / cantMenor));
        System.out.println("Promedio general " + (suma / personas));

    }
    
}
