
package ejercicio3;
import Entidad.operacion;
import servicio.operacionservicio;
        

public class ejer3 {

    
    public static void main(String[] args) {
     operacionservicio oper = new operacionservicio();
     operacion oper1 = oper.crearOperacion();
     
     oper.sumar(oper1);
     oper.restar(oper1);
     oper.multiplicar(oper1);
     oper.dividir(oper1);
     
     System.out.println(oper1.toString());
     
     
    }
    
}
