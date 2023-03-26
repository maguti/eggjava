/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjavaguia04;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia04_Ej02_Menores_Grup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas");
        String resp = "S";

        int N = leer.nextInt();
        nombredad(N);

    }

    public static void nombredad(int N) {
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        String respuesta;
        int edad;

        for (int i = 0; i < N; i++) {
            System.out.println("Ingresa el nombre");
            nombre = leer.next();

            System.out.println("Ingresa la edad");
            edad = leer.nextInt();

            if (edad >= 18) {
                System.out.println("El nombre es " + nombre + " tiene " + edad + " años, es mayor de edad");

            } else {
                System.out.println("El nombre es " + nombre + " tiene " + edad + " años, y NO es mayor de edad");

            }
            if (i < N - 1) {
                System.out.println("Desea continuar (s/n)");
                respuesta = leer.next();

                if (respuesta.equalsIgnoreCase("N")) {
                    i = N;
                }

            }

        }
    
    }
}
