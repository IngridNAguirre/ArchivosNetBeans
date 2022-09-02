
package ejer10;

import java.util.Arrays;


public class arrays {

   
    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
    for (int i =0; i< 50; i++){
            arregloA[i] = Math.random() *10;
            System.out.println("["+ arregloA[i] + "]");
    } 
    
    Arrays.sort(arregloA);
            
    System.arraycopy(arregloA, 0,arregloB, 0, 10);
    
    for (int i = 10; i < 20; i++){
        arregloB[i] = 0.5;
    }
    System.out.println("-------------------------------");
    System.out.println("Arreglo A: ordenado ");
    for (int i = 0; i <50; i++){
        System.out.println("["+ arregloA[i] + "]");
    }
    System.out.println("Arreglo B: ");
    
    System.out.println("----------------------------");
    for (int i = 0; i <20; i++){
        System.out.println("["+ arregloB[i] + "]"); 
    }
            
        }
    }
    

