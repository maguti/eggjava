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
public class Guia04_Ej02_Menores_Grup_V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int cantPer = sc.nextInt();
        nombreEdad(cantPer);

    }

    public static void nombreEdad(int cantPer) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        //String nombre;
        String opc;

        for (int i = 1; i < cantPer + 1; i++) {
            System.out.println("Ingrese el nombre de la persona numero: " + i);
            String nombre = sc.nextLine();
            System.out.println("Ingrese la edad de la persona numero: " + i);
            int edad = sc2.nextInt();
            if (edad < 18) {
                System.out.println(nombre + " tiene " + edad + " y es menor de edad");
            } else {
                System.out.println(nombre + " tiene " + edad + " y es mayor de edad");
            }
            if (i < cantPer - 1) {
                System.out.println("Desea seguir mostrando personas ? (Si/No)");
                opc = sc.next();
                if (opc.equalsIgnoreCase("no")) {
                    break;
                }
            }

        }
    }

}
