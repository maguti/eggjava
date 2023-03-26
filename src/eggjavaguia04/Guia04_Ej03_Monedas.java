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
public class Guia04_Ej03_Monedas {

    /**
Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor en Euros:");
        double valEuro = sc.nextDouble();
        convertirMoneda(valEuro, "LIBRA");
        convertirMoneda(valEuro, "USD");
        convertirMoneda(valEuro, "YEN");
    }
    
    public static void convertirMoneda(double valEuro, String moneda) {
        // Cotización fija
        double cotizLibra = 0.86, cotizUsd = 1.28611, cotizYen = 129.852;
        switch (moneda) {
            case "LIBRA":
                System.out.println("El valor " + valEuro + " EUR equivale a " + (valEuro * cotizLibra) + " Libras");
                break;
            case "USD":
                System.out.println("El valor " + valEuro + " EUR equivale a " + ((double) Math.round(valEuro * cotizUsd * 100) / 100)+ " USD");
                break;
            case "YEN":
                System.out.println("El valor " + valEuro + " EUR equivale a " + (valEuro * cotizYen) + " Yenes");
                break;
            default:
                throw new AssertionError();
        }
    }
}
