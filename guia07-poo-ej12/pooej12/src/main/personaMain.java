
package main;

import entidad.persona;
import servicio.personaServicio;


public class personaMain {

    
    public static void main(String[] args) {
        persona p = new persona ();
        personaServicio ps = new personaServicio();
        
        
        ps.crearPersona(p);
        System.out.println(ps.mostrarPersona(p));
        System.out.println("Su edad es: "+ps.calcularEdad(p));
        System.out.println(ps.menorQue(p)); 
    }
    
}
