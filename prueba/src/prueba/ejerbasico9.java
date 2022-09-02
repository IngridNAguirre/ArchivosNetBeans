/*
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class ejerbasico9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese hasta 20 numeros, para finalizar ingrese 0:");
        int n;
        int sumar;
        int contador;
        sumar = 0;
        contador = 0;
        do{
            System.out.println("Ingrese un numero");
            n = leer.nextInt(); 
            
            if (n!=0){
            contador = (contador+1); 
            }
            if (n>0){ 
            sumar = (sumar + n );
            }                
        }while (n!=0 && contador<20);
               
        if (n==0){
            System.out.println("Se capturo el numero 0");
        }       
            
        System.out.println("La suma de los numeros es: " + (sumar));
             
    }        
}       
    
