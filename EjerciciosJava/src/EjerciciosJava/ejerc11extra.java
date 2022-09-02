/*
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class ejerc11extra {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese un numero entero");
       int numero = leer.nextInt();
       int contador = 0;
       do{
           numero = numero / 10;
           contador ++;
       }
       
       while (numero > 0);
       
        System.out.println("la cantidad de digitos es " + contador);
       
       
             
    }
    
}
