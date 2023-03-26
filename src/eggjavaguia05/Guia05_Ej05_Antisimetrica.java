/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjavaguia05;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia05_Ej05_Antisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("Ingrese la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz[" + i + "," + j + "]=");
                matriz[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        // Mostrar Matriz
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(" " + elemento);
            }
            System.out.println("");
        }
        // Mostar Transpuesta
        boolean antisim = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matriz[j][i]);
                if (i != j && matriz[i][j] != -(matriz[j][i]) && antisim) {
                    antisim = false;
                }
            }
            System.out.println("");
        }
        if (antisim) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }


    }
    
}
