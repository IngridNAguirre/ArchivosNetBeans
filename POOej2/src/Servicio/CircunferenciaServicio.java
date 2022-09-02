
package Servicio;
import Entidad.Circunsferencia;
     
import java.util.Scanner;
       
/**
 *
 * @author ingrid
 */
public class CircunferenciaServicio {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n"); //esto hace que tome palabras o frases con espacios
    
    
    public Circunsferencia crearCircunsferencia(){//metodo carga radio
        
        Circunsferencia circ = new Circunsferencia();
        System.out.println("Ingrese el radio");
        circ.setRadio(leer.nextDouble());
        
    return circ;
    }
    
    public void area(Circunsferencia circ){ //metodo area
        double area = 3.14 * (circ.getRadio()*circ.getRadio());
        System.out.println(area);    
    }
    public void perimetro(Circunsferencia circ){ //metodo perimetro
        double perimetro =(2*(circ.getRadio()*3.14));
        System.out.println(perimetro);
    }   
        
}

    
