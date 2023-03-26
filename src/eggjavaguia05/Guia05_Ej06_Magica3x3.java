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
public class Guia05_Ej06_Magica3x3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        matriz = leerMatriz(3,3);
        escribirMatriz(matriz, 3, 3);
        for (int i = 0; i < 10; i++) {
            
        }
    }
    
    public static int[][] leerMatriz(int m, int n) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[m][n];
        System.out.println("Ingrese la matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matriz[" + i + "," + j + "]=");
                matriz[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        return matriz;
    }
    public static void escribirMatriz(int[][] matriz, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
        
    }
}
