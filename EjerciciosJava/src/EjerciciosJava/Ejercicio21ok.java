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
public class Ejercicio21ok {
public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int [][]matriz10x10=new int [10][10];
        int [][]matriz3x3=new int [3][3];
        int []posiciones;
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                matriz10x10[i][j]=(int)(Math.random()*2);
                if (i<3 && j<3){
                    matriz3x3[i][j]=(int)(Math.random()*2);
                }
            }     
        }
        
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.print(matriz10x10[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matriz3x3[i][j]+" ");
            }
            System.out.println("");
        }
        posiciones=buscar(matriz10x10,matriz3x3);
        if (posiciones[0]!=-1){
        System.out.println("La matriz submatriz 3x3 esta contenida en la matriz 10x10 en la posicion");
        System.out.println("Fila: "+(posiciones[0])+" a "+(posiciones[0]+2) +",columna: "+posiciones[1]+" a "+(posiciones[1]+2));
        }else{
            System.out.println("La matriz 3x3 no esta contenida en la matriz 10x10");
        }
    }
    public static int[] buscar(int [][]matriz10x10,int [][]matriz3x3){
        int []posiciones={-1,-1};
        int aux=0, aux2=0;
        boolean b;
        do{
            b=true;
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    if (matriz10x10[i+aux][j+aux2]!=matriz3x3[i][j]){
                        b=false;
                    }
                }
            }
            
            if (b){
                posiciones[0]=aux+1;
                posiciones[1]=aux2+1;
                return posiciones;
            }
            aux2++;
            if(aux2==8){
                aux2=0;
                aux++;
            }
        }while(aux!=8);
        return posiciones;
    }
}