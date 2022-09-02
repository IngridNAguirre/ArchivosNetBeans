
package Entidad;

/**
 *
 * @author ingrid
 */
public class Circunsferencia {
    //atributos
    
    private double radio;
    
    //contructores
   
    public Circunsferencia(double radio) {//contructor para radio pasado como parametro
        this.radio = radio;
    }

    public Circunsferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunsferencia{" + "radio=" + radio + '}';
    }

      

}
  
