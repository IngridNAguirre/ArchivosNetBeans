
package ejer6;

import entidad.cafetera;
import servicio.cafeteraServicio;
public class Nespresso {

    
    public static void main(String[] args) {
        cafeteraServicio cafes = new cafeteraServicio();
        
        cafetera cafe = cafes.llenarCafetera();
     cafes.servirTaza(cafe);
     cafes.servirTaza(cafe);
     cafes.vaciarCafetera(cafe);
     cafes.agregarCafe(cafe);
    }
    
}
