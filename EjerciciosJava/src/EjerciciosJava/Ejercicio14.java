/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese cantidad de Euros");
    double EUROS;
        EUROS = leer.nextInt();
    
    System.out.println("Ingrese conversion a moneda: DOLAR/YENES/LIBRAS");
    String conver;
        conver = leer.nextLine();
        conver = leer.nextLine();
    System.out.println("El cambio de Euros es:" + convertir(EUROS, conver));  
    
    }
    public static double convertir(double EUROS, String conver){
        double cambio=0;
        
                
            if (conver.equals("DOLAR")){
                cambio =  (EUROS * 1.28611);
            }
            if (conver.equals("YENES"))
                cambio = (EUROS * 129.852);
                        
            if (conver.equals("LIBRAS"))
                cambio = (EUROS * 0.86); 
        
    return cambio;    
    }   }

   
