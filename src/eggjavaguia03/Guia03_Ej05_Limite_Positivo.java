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
public class Guia03_Ej05_Limite_Positivo {

    /**
     * @param args the command line arguments
    5. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuacion 
    solicite números al usuario hasta que la suma de los números introducidos supere el limite inicial.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double limite;
        do {            
            System.out.println("Ingrese un valor límite positivo");
            limite = leer.nextDouble();
        } while (limite <= 0);
        double suma = 0;
        do {
            System.out.println("Ingrese un valor");
            double num = leer.nextDouble();
            suma += num;
        } while (suma < limite);
        System.out.println("La suma es " + suma);
    
    
    }
    
}