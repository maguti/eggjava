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
public class Guia03_EjEx04_Romano_V2 {

    /**
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Números Romanos V2");
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un número entero entre 1 y 10:");
            num = sc.nextInt();
        } while (num < 0 || num > 10);
        String romano;
        if (num < 4) {
            romano = "";
        } else if (num > 3 && num < 9) {
            romano = "V";
        } else {
            romano = "X";
        }
        if (num < 4 || num > 5 && num < 9) {
            for (int i = 0; i < num % 5; i++) {
                romano += "I";
            }
        } else if (num == 4 || num == 9) {
            romano = "I" + romano;
        }
        System.out.println ("El número entero " + num + " en notación romana es " + romano);

    }
    
}
