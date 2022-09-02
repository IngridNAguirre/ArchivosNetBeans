/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class ejerc12extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) { 
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    /*este programa usa if. La forma System.out.print(i != 3 ? i : "E"); equivale a un:
                    if(i!=3){
                    System.out.print(i);
                    } else{
                    System.out.print("E");*/
                    
                             System.out.print(i != 3 ? i : "E");
                             System.out.print(j != 3 ? j : "E");
                             System.out.println(k != 3 ? k : "E");

                }
            }
        }
    }
}

    


