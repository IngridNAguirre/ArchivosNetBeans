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
public class ejer9extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        int dividendo = leer.nextInt();
        
        System.out.println("Ingrese el divisor");
        int divisor = leer.nextInt();
        
        int resto;
        int cont = 0;
        
        do {
           resto = dividendo - divisor;
           cont = cont + 1;
           dividendo = resto;
           
        }while (resto>divisor);
        
        System.out.println("el resto es " + resto); 
        System.out.println("el cociente es " + cont);
        
    }
    }    

