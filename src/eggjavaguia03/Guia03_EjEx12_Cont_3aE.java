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
public class Guia03_EjEx12_Cont_3aE {

    /**

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        String contT = "";
        do {            
            contT = "" + cont;
            if (cont < 10) {
                contT = "0-0-" + cont;
            } else if (cont < 100) {
                contT = "" + cont;
                contT = "0-" + contT.substring(0, 1) + "-" + contT.substring(1, 2);
            } else {
                contT = "" + cont;
                contT = contT.substring(0, 1) + "-" + contT.substring(1, 2) + "-" + contT.substring(2, 3);
                
            }
            contT = contT.replace("3", "E");
            System.out.println("" + contT);
            cont++;
        } while (cont < 140);
    }
    
}
