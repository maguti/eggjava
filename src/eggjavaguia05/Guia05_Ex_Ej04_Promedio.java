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
public class Guia05_Ex_Ej04_Promedio {

    /*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas 
por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int m = 2, n = 5, cantApro = 0;
        double[][] notas = new double[m][n];
        double[] pond = {0.10, 0.15, 0.25, 0.5};
        String[] notasDesc = {"1er Trabajo Préctico", "2do Trabajo Práctico", 
                              "1er Integrador", "2do Integrador"};
        leerMatriz(notas, m, n-1, notasDesc);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n-1; j++) {
                notas[i][n-1] += notas[i][j]*pond[j];
            }
            if (notas[i][n-1] >= 7) {
                cantApro++;
            }
        }
        escribirMatriz(notas);
        System.out.println("La cantidad de alumnos aprobados es: " + cantApro);
        System.out.println("La cantidad de alumnos desaprobados es: " + (m-cantApro));
    }

    public static void leerMatriz(double[][] matriz, int m, int n, String[] notasDesc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las notas:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Alumno " + (i+1) + " - Nota " + notasDesc[j] + " = ");
                matriz[i][j] = sc.nextDouble();
            }
            System.out.println("");
        }

    }

    public static void escribirMatriz(double[][] matriz) {
        System.out.println("         NP1 NP2 NI1 NI2 PRO");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Alumno " + (i+1));
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }

    }
    
}
