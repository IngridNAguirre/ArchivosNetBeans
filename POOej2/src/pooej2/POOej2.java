
package pooej2;
import Entidad.Circunsferencia;
import Servicio.CircunferenciaServicio;
        
/**
 *
 * @author ingrid
 */
public class POOej2 {

   
    public static void main(String[] args) {
    CircunferenciaServicio circ = new CircunferenciaServicio(); 
    Circunsferencia rad = circ.crearCircunsferencia();
    circ.area(rad);
    circ.perimetro(rad);
    
    System.out.println(rad.toString());
        
    }

}