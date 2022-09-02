
package pooej1;

import Entidad.Libro;
import Servicios.LibroServicios;

public class POOej1 {

   
    public static void main(String[] args) {
        
    LibroServicios libros = new LibroServicios(); // aca instanciamos un objeto de la clase libroservicios

    Libro libro1 = libros.cargaLibro();//aca retorna el objeto libro1 con todos sus atributos cargados
    
    System.out.println(libro1.toString()); //imprime por pantalla
}
}