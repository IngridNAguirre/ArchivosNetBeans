
package entidad;


public class cafetera {
 //atributos 
    public double capacidadMaxima;
    public double cantidadAcutal;
    
 // constructores

    public cafetera() {
    }

    public cafetera(double capacidadMaxima, double cantidadAcutal) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadAcutal = cantidadAcutal;
    }
    
 // getter y setter

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadAcutal() {
        return cantidadAcutal;
    }

    public void setCantidadAcutal(double cantidadAcutal) {
        this.cantidadAcutal = cantidadAcutal;
    }
    
    // tostring

    @Override
    public String toString() {
        return "cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadAcutal=" + cantidadAcutal + '}';
    }
    
    
    
    
}
