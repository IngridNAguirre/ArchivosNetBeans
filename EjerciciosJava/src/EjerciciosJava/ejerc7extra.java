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
public class ejerc7extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int n;
       double numero;
       double valormax=0;
       double valormin=999999;
       int cont = 1;
       double aux=0;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que va ingresar");
        n = leer.nextInt();
        while (cont <= n){
         
        System.out.println("El promedio es: " + aux/n );
        System.out.println("El valor minimo es: "+ valormin);
        System.out.println("El valor maximo es: "+ valormax);
        
       int n1 = n;
       double numero1;
       double valormax1=0;
       double valormin1=999999;
       int cont1 = 1;
       double aux1=0;
       
        do{
           System.out.println("Ingrese el numero a ingresar");
            numero1 = leer.nextDouble();
            cont1 = cont1 + 1;
            aux1 = numero1 + aux1;
            if (numero1 > valormax1){
                valormax1 = numero1;
            }
            if (numero1 < valormin1) {
                valormin1 = numero1;  
        }
        }   while(cont1 <= n1);
    System.out.println("El promedio es: " + aux1/n1 );
        System.out.println("El valor minimo es: "+ valormin1);
        System.out.println("El valor maximo es: "+ valormax1);
    }  
}
    
    }
    

