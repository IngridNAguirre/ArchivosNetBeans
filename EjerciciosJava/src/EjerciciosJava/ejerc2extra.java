/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosJava;

/**
 *
 * @author ingrid
 */
public class ejerc2extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A = 5;
        int B = 10;
        int C = 15;
        int D= 20;
        int aux = 0;
        
        System.out.println("El valor de A es " + A);
        System.out.println("El valor de B es " + B);
        System.out.println("El valor de C es " + C);
        System.out.println("El valor de D es " + D); 
        
        aux = B; // 10
        B = C; // 15
        C= A; // 5
        A = D; // 20
        D = aux; //10
        
        System.out.println("El valor de A es " + A);
        System.out.println("El valor de B es " + B);
        System.out.println("El valor de C es " + C);
        System.out.println("El valor de D es " + D);

    }
    
}
