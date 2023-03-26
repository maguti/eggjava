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
public class Guia03_EjEx11_Digitos {

    /**
Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
Nota: recordar que las variables de tipo entero truncan los números o resultados.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero de varios dígitos:");
        int num = sc.nextInt();
        int cant = 0;
        do {            
            num /= 10;
            cant++;
        } while (num > 0);
        System.out.println("La cantidad de dígitos " + cant);

    }
    
}
