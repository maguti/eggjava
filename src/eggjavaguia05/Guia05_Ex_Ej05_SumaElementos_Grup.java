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
public class Guia05_Ex_Ej05_SumaElementos_Grup {

    /**
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas");
        int n = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int m = sc.nextInt();
        int [][] matriz = new int[n][m];
        
        llenarMatriz(matriz);
    }
    public static void llenarMatriz(int [][] matriz){
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz [i][j] = (int) (Math.random() * 10);
                sum = sum + matriz[i][j];
            }
        }
        
        System.out.println("La suma de los elementos de la matriz es "+sum);
    }
    
}
