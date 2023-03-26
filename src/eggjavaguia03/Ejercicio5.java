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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        int num1 = num * 2;
        int num2 = num * 3;
                
        // double b = Double.valueOf(a);
        double num3 = Double.valueOf(num);
        double num4 = Math.sqrt(num3);
        System.out.println("El doble, el triple y la raiz cuadrada de "
                +num+" son respectivamente "+ num1+" , "+num2+" y "+num4);
    }
    
}
