
package EjerciciosJava;

import java.util.Scanner;


public class Ejercicio9 {


    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una palabra o frase");
    String palabra = leer.nextLine(); 
    String letra = palabra.substring(0,1);
        System.out.println("letra");
        
    if (letra.equals("A")){
        System.out.println("Correcto");
        
    }else {
        System.out.println("Incorrecto");
    }
    }}
