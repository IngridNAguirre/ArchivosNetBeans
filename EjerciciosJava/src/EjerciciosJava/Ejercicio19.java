/*
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n;
     Scanner leer = new Scanner(System.in); 
     System.out.println("Ingrese la dimension de la matriz");
     n = leer.nextInt();
       int [][] matriz = new int [n][n];
     for (int i = 0; i < n; i++ ){
         for (int j=0; j<n ; j++){
             System.out.println("Rellene la matriz en la posicion "+ i + ","+ j);
          matriz[i][j] = leer.nextInt();  
         }
     } 
     boolean aux;
     aux = true;
      for (int i = 0; i < n; i++){
          for(int j = 0; j < n; j++){
            if (matriz [i][j] != (matriz [j][i]*(-1))){
            aux = false;
                    }
            System.out.print ("|"+ matriz [i][j] + "|");
          }
          System.out.println(" ");
      } 
      System.out.println(" ");
      for (int i = 0; i < n; i++){
          for(int j = 0; j < n; j++){
            System.out.print("|"+(matriz[j][i]*(-1))+"|");
          }
          System.out.println(" ");
          }
    
     if (aux){
         System.out.println("La matriz es antisimetrica");
     }
     else{
         System.out.println("La matriz no es antisimetrica");
     } 
    }
    
}





    

