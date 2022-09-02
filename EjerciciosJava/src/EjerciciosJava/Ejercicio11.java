
package EjerciciosJava;

import java.util.Scanner;


public class Ejercicio11 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un numero"); 
        
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        
        int num2 = leer.nextInt();
        boolean bandera = false;
        do{
            bandera = false;
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            System.out.println("Ingrese una opcion");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    int suma = num1+num2;
                    System.out.println("El resultado de la suma es: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resta);
                    break;
                case 3:
                    int multi = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es: " + multi);
                    break;    
                case 4:
                    double div = (double) num1 / num2;
                    System.out.println("El resultado de la division es: " + div);
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa (s/n)");
                    String respuesta = leer.nextLine();
                    respuesta = leer.nextLine();
                    
                    if (respuesta.equals("S")) {
                    bandera = true;
                    
                    }    
                    break;    
                               
                }
            } while(bandera == false);
        
        System.out.println("Chau, nos vemos");
            
        }
    }
    
