/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjavaguia04;

import java.util.Scanner;

/*
 *
 * @author Usuario
 */
public class Guia04_EjExMentor02_Abs_Sqrt {

    /*
2. Implementar una función que permita obtener el valor absoluto de un número positivo 
y otra que obtenga la raíz cuadrada. Para ello utilice los métodos abs() y sqrt() de la clase Math.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        double num = sc.nextDouble();
        System.out.println("El valor absoluto de " + num + " es " + abs(num));
        System.out.println("La raiz cuadrada de " + abs(num) + " es " + raiz(abs(num)));
        
    }
    
    public static double abs(double num) {
        // The Math.abs(x) method returns the absolute (positive) value of x:
        return Math.abs(num);
    }

    public static double raiz(double num) {
        // The Math.sqrt(x) method returns the square root of x:
        return Math.sqrt(num);
    }
    
}
