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
public class Guia03_EjEx02_Intercambio {

    /**
Guia03_EjEx02 - Declarar cuatro variables de tipo entero A, B, C y D 
y asignarle un valor diferente a cada una. A continuación, realizar las instrucciones necesarias
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de A:");
        int a = leer.nextInt();
        System.out.println("Ingrese el valor de B:");
        int b = leer.nextInt();
        System.out.println("Ingrese el valor de C:");
        int c = leer.nextInt();
        System.out.println("Ingrese el valor de D:");
        int d = leer.nextInt();
        //B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B
        int aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;  // antiguo b
        System.out.println("El valor de A:" + a);
        System.out.println("El valor de B:" + b);
        System.out.println("El valor de C:" + c);
        System.out.println("El valor de D:" + d);
    }
    
}
