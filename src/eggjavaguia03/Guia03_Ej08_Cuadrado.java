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
public class Guia03_Ej08_Cuadrado {

    /**
     Guia 03 - Ej 08 - Dibujar un cuadrado de N elementos por lado utilizando el carácter "*". 
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese la cantidad de elementos por lado");
        int lado = leer.nextInt();
        for (int i = 0; i < lado; i++) {
            System.out.println("");
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println("");

    }
    
}
