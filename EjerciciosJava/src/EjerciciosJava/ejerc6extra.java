/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class ejerc6extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
       
        System.out.println("Ingrese numero de personas a calcular");
        int personas = leer.nextInt();
        
        double cont_esta=1;
        double cont_estbaja =0;
        double cont_estalta = 0;
        double suma1 = 0;
        double suma2 = 0;
        double promedio1 = 0;
        double promedgral = 0;
        int estatura;
        
        do{
            System.out.println("Ingrese la estatuta en centimetros ");
                        
            estatura = leer.nextInt();
            cont_esta = cont_esta + 1;
            
            if (estatura >= 160){
            
            cont_estalta = cont_estalta + 1;
            suma1 = estatura + suma1;
            }else {
                    
                    cont_estbaja = cont_estbaja +1;
                    suma2 = estatura + suma2;
                    }
        }while(personas =< cont_esta);
        
        System.out.println("El promedio de estatura baja es " + (promedio1 = suma2 / cont_estbaja));
        
        System.out.println("El promedio gral es " + (promedgral = (suma1 + suma2) / personas));
        
            
    }
                    
                    
                    
                    
    }
    
}
