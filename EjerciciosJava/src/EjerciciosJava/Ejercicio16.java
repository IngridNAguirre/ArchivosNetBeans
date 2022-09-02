/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int[]vector;
        int buscado; 
         int n; 
        System.out.println("Ingrese el tamaÃ±o del vector: "); 
        n = leer.nextInt(); 
      
 vector = new int[n]; 
 
  for(int i=0 ; i < n  ; i++){
      vector[i] = (int)(Math.random()*10); 
      
      System.out.println("[" + vector[i] + "]");     
    }
  
        System.out.println("Escriba un valor a buscar: ");
        buscado = leer.nextInt(); 
     
  for (int i = 0 ; i < n ; i++ ){
    if (vector[i] == buscado) {
    System.out.println( "|" + buscado + " esta en la posicion :  " + i + "|");
            }
    else {
         System.out.println("Numero no encontrado :( ");    
        }
  }   
  
       
}
    
}
