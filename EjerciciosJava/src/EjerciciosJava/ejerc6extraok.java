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
public class ejerc6extraok {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas que desea calcular.");
        int nro = leer.nextInt();
        
        double aux1 =0;
        double cont1= 0;
        double prom1=0;
        double aux2 =0;
        double cont2= 0;
        double prom2=0;
        int cantper = 1; // Se iniciacilza en 1 porque cuenta el 0 como una vuelta. 
        do {
            System.out.println("Ingrese la estatura en centímetros."); 
            int altura = leer.nextInt();
            cantper = cantper + 1;
            
            if (altura <= 160){
            aux1 = altura + aux1;
            cont1= cont1 +1;
            }

            else {
             aux2 = altura + aux2;
            cont2= cont2 +1;
           
            }
        } while (cantper <= nro);
        
        prom1= aux1/cont1;
        prom2= aux2/cont2; 
        double promgral = (prom1 + prom2)/2;
        System.out.println("El promedio general de alturas es : " + promgral);
        System.out.println("el promedio de personas menor a 1,60 m es: " + prom1);
    }
    
}