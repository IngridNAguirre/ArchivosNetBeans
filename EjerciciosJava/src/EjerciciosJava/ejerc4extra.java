/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class ejerc4extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entre 1 y 10.");
        int nro = leer.nextInt();
        
        switch (nro){
            case 1: 
                System.out.println("1 = I");
            break;
            case 2:
                System.out.println("2 = II"); 
            break;    
             case 3:
                System.out.println("3 = III"); 
            break; 
             case 4:
                System.out.println("4 = IV"); 
            break;
             case 5:
                System.out.println("5 = V");
            break;
             case 6:
                System.out.println("6 = VI"); 
            break;
             case 7:
                System.out.println("7 = VII"); 
            break;
             case 8:
                System.out.println("8 = VIII"); 
            break;
             case 9:
                System.out.println("9 = IX"); 
            break;
            case 10:
                System.out.println("10 = X"); 
            break;
        }
    }
    
}


