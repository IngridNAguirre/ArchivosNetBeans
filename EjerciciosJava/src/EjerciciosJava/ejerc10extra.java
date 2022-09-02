/*
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class ejerc10extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Scanner leer = new Scanner(System.in);
        int factor1 = (int) (Math.random()*10);
        int factor2 = (int) (Math.random()*10);
       int resultado = factor1 * factor2;
        System.out.println(resultado);
        int respuesta;
        do {
            System.out.println(" Adivine el resultado de la multiplicación.");
            respuesta = leer.nextInt();
            if (respuesta != resultado){
               System.out.println("Tu respuesta es incorrecta, inténtalo de nuevo.");
            }     
            else {
                System.out.println("Tu respuesta es correcta");
                
            }
       
         } while (respuesta != resultado);
        
    }
    
}

