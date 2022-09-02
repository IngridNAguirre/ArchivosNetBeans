/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class ejerc1extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese los minutos a calcular:");
        int minutos = leer.nextInt();
        int restohoras;
        int dias = 1440;
        int horas = 60;
        int restomin = 0;
        
        do{
         restomin = minutos/horas;  
        minutos = restomin;
         horas = horas+1;        
        }  
        while (minutos<60);
        }
        System.out.println(" horas "+ horas);
        
        if (horas>=24){
        restohoras = 0;
        restohoras = restohoras / 60;
        dias = 0;
        dias = dias+1;        
        
        }
        System.out.println("dias " + dias);   
        
        System.out.println("El equivalente es " + dias + " dias y " + horas + " horas");
        
}
}