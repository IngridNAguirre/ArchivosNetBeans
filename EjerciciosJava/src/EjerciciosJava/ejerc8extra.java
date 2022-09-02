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
public class ejerc8extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int nro; 
       int cont=0; 
       int contpar=0;
       int contimpar =0;
        do {
           System.out.println("Ingrese números.");
        nro = leer.nextInt(); 
        cont = cont + 1;
        
        if (nro %2 == 0){    
           contpar= contpar + 1;
        }
        else {
            contimpar = contimpar + 1;    
            
        }

        } while (nro % 5 != 0);
        
        System.out.println("La cantidad de números leídos es " + cont);
        System.out.println("La cantidad de números pares es " + contpar);
        System.out.println("La cantidad de números impares es " + contimpar);
    }
      
}

