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
public class ejerc5extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Scanner leer = new Scanner(System.in);
              
      double importe = 0;
        System.out.println("Ingrese que tipo de socio según sus aportes es:");
       String socio = leer.nextLine();
        System.out.println("Indique el costo de tratamiento que debe realizarse.");
        int tratamiento = leer.nextInt();
      
        switch(socio){
           case "A":
              importe = tratamiento * 0.5;
              System.out.println("El importe a pagar es $ " + importe);
            break;
            case "B":
              importe = tratamiento * 0.65;
              System.out.println("El importe a pagar es $ " + importe);
            break; 
            case "C":
              System.out.println("El importe a pagar es $ " + tratamiento);
            break;
    }
    }
    
}

    
    

