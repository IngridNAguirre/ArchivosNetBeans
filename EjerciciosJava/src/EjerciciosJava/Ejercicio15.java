/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
    
     int[] vector = new int[99];
     for (int i = 0; i < 99; i++) {
        vector[i] = i+1;
    }       
     for (int i = 0; i<99; i++) {
         System.out.print("[" + vector[99 - i -1] +"]");
     } 
        System.out.println("");     
    }
    
}
