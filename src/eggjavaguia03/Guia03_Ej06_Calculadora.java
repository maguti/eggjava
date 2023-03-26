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
public class Guia03_Ej06_Calculadora {

    /**
    Guia 03 - Ej 06 - Realizar un programa que pida dos números enteros positivos por teclado 
    y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
    y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
    El programa deberá ejecutarse hasta que se elija la opción 5. 
    Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
    se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
    Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero:");
        int num2 = leer.nextInt();
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            opcion = leer.nextInt();
            if (opcion == 5) {
                break;
            }
            switch (opcion) {
                case 1:
                    System.out.println("La suma de " + num1 + " y " + num2 + " es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de " + num1 + " y " + num2 + " es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división entera de " + num1 + " y " + num2 + " es " + (num1 / num2));
                    System.out.println("La división exacta de " + num1 + " y " + num2 + " es " + (Double.valueOf(num1) / Double.valueOf(num2)));
                    break;
            }
        } while (true);
        
        
        
    }
    
}
