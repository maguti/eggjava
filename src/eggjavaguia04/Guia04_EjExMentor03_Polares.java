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
public class Guia04_EjExMentor03_Polares {

    /*
3. Diseñar un procedimiento que permita convertir coordenadas polares (radio, ángulo) en cartesianas (x,y). 
NOTA: x=radio*cos(ángulo) e y=radio*sen(ángulo).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        double radio = sc.nextDouble();
        System.out.println("Ingrese el angulo:");
        double angulo = sc.nextDouble();
        double x = 0.0, y = 0.0;
        polares2Cartesiana(radio, angulo, x, y);
        System.out.println("Las coor polares (" + radio +"," + angulo +
                ") equivale a las coor cartesianas (" + x +"," + y + ")");
    }
    
    public static void polares2Cartesiana(double radio, double angulo, double x, double y) {
        // Math.sin(x) Returns the sine of x (x is in radians) -> double
        System.out.println("radio " + radio + " angulo " + angulo);
        System.out.println("Coseno " + Math.cos(angulo));
        System.out.println("Seno " + Math.sin(angulo));
        x = radio * Math.cos(angulo);
        y = radio * Math.sin(angulo);
    }
}
