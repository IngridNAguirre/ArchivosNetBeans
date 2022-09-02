
package servicio;
import Entidad.operacion;
import java.util.Scanner;

public class operacionservicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n"); //esto hace que tome palabras o frases con espacios
    
    public operacion crearOperacion(){//metodo carga numeros
        operacion oper = new operacion();
        
        System.out.println("Ingrese el primer numero");
        oper.setNumero1(leer.nextDouble());
        System.out.println("Ingrese el segundo numero");
        oper.setNumero2(leer.nextDouble());
    return oper;    
    }
    
    public void sumar(operacion oper){
      double suma = ((oper.getNumero1())+(oper.getNumero2()));  
        System.out.println("la suma es :" + suma);
    }
    public void restar(operacion oper){
      double resta = ((oper.getNumero1())-(oper.getNumero2()));
        System.out.println("La resta es : " + resta);
    }
    public void multiplicar(operacion oper){
      if ((oper.getNumero1()) ==0){
        System.out.println("el primer multiplicando es igual a 0");
      }
      if ((oper.getNumero2()) ==0){
        System.out.println("el segundo multiplicando es igual a 0");  
      
    }else{
      double multi = ((oper.getNumero1())*(oper.getNumero2()));
          System.out.println("La multiplicacion es: " + multi);
    }
    } 
     public void dividir(operacion oper){
      if ((oper.getNumero1()) ==0){
        System.out.println("el divisor es igual a 0");
      }
      if ((oper.getNumero2()) ==0){
        System.out.println("el dividendo es igual a 0");  
      }
    else{
      double divide = ((oper.getNumero1())/(oper.getNumero2()));
          System.out.println("La division es :" + divide);
    } 
    
}

}