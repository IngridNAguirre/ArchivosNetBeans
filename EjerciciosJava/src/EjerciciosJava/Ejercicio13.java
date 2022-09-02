
package EjerciciosJava;

import java.util.Scanner;


public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de elementos");
        int num = leer.nextInt();
        
        for(int i = 0; i < num; i++){
          for(int f = 0; f < num; f++){  
              if (i== 0 || f == num-1 || f== 0 || i == num-1){
                  System.out.print("* ");
                  
              }else {
                  System.out.print("  ");
              }
                  
          }
            System.out.println(" ");
        }
    }
    
}
