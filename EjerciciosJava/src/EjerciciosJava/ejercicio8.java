

package EjerciciosJava;

import java.util.Scanner;

/**Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
* 
*  public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String frase;
        do{
            System.out.println("Ingrese una frase de 8 caracteres");
            frase=leer.nextLine();
            if(frase.length()!=8){
                System.out.println("INCORRECTO");
            }
        }while(frase.length()!=8);
        System.out.println("CORRECTO");
    } 
}

 * @author ingrid
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase de 8 largo");
        String palabra = leer.nextLine();
        if (palabra.length()==8) {
                System.out.println("CORRECTO");
            } else {
            System.out.println("INCORRECTO");
            }
    }
    
}
