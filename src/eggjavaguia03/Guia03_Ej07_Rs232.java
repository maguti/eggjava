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
public class Guia03_Ej07_Rs232 {

    /**
    Guia 03 - Ej 07 - Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
    este tipo de dispositivo lee cadenas enviadas por el usuario. 
    Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
    el primer carácter tiene que ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el
     * formato se consideran correctas, la secuencia especial "&&&&&" marca el
     * final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE,
     * que no respete el formato se considera incorrecta. Al finalizar el
     * proceso, se imprime un informe indicando la cantidad de lecturas
     * correctas e incorrectas recibidas. Para resolver el ejercicio deberá
     * investigar cómo se utilizan las siguientes funciones de Java Substring(),
     * Length(), equals().
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
                String secuencia;
        int lectInc = 0;
        int lectCorr = 0;
        do {            
            System.out.println("Ingrese la secuencia");
            secuencia = sc.next();
            //System.out.println("La secuencia original es: " + secuencia);
            if (secuencia.equals("&&&&&")) {
                System.out.println("Secuencia final FDE");
                break;
            } else if (secuencia.length() > 5) {
                lectInc++;
                System.out.println("Secuencia mayor a 5 caracteres");
            } else if (secuencia.substring(0, 1).equals("X") && secuencia.substring(4, 5).equals("O")) {
                lectCorr++;
                System.out.println("Secuencia correcta");
                
            } else {
                lectInc++;
                System.out.println("Secuencia debe comenzar con X y terminar con O");
            }
        } while (true);
        System.out.println("Lecturas correctas: " + lectCorr);
        System.out.println("Lecturas incorrectas: " + lectInc);

    }
    
}
