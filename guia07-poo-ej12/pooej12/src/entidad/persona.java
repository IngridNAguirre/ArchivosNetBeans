
package entidad;

import java.util.Date;

public class persona {
    private String nombre;
    private Date fNacimiento;

    public persona() {
    }

    public persona(String nombre, Date fNacimiento) {
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", fNacimiento=" + fNacimiento + '}';
    }
    
    
}
