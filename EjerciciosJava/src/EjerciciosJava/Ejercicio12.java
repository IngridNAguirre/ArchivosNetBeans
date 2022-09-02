
package EjerciciosJava;

import java.util.Scanner;


public class Ejercicio12 {

    /**
     *
     * @param args
     */
   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int suma = 0;
    int suma1 = 0;
    String cadena;
    
    do {
        System.out.println("Ingrese una cadena"); 
       cadena = leer.nextLine();
        
        if (cadena.substring(0,1).equals("X") &&cadena.substring(4,5).equals("O") && cadena.length() == 5){
           suma++;
           
        }else{
            suma1++;
        }
        
        }  
    while  (!"&&&&&".equals(cadena));
    suma1--; 
     
    
        System.out.println("La cantidad de lecturas correctas fue de: " + suma);
        System.out.println("La cantidad de lecturas incorrectas fue de: " + suma1);
    
    }    
}

