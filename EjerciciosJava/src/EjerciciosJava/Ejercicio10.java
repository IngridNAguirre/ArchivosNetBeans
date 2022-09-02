
package EjerciciosJava;

import java.util.Scanner;


public class Ejercicio10 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un limite:");
        int limite = leer.nextInt();
        int suma = 0;
    do {System.out.println("Ingrese un numero");
    int num = leer.nextInt();
    
    suma = suma + num;
            
    }while  (suma < limite);  
    
        System.out.println("Se ha alcanzado el limite");
    }
    
}
