/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class LibroServicios {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    
    public Libro cargaLibro(){ //instanciamos el metodo para cargar el libro
               
    
    Libro libro1 = new Libro();//instanciamos un objeto nuevo a cargar
    
//lleno los atributos
    System.out.println("Ingrese el ISBN");
    libro1.setISBN(leer.next());
     
    System.out.println("Ingrese el Autor");
    libro1.setAutor(leer.next());
            
    System.out.println("Ingrese el Titulo");
    libro1.setTitulo(leer.next());
            
    System.out.println("Ingrese cantidad de paginas");
    libro1.setNumPag(leer.nextInt());
            
    return libro1;
    }
}
