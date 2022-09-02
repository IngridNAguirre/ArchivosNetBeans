
package entidad;

/**
 *
 * @author ingrid
 */
public class cancion {
 public String titulo;
 public String cancion;

    public cancion() {
    }

    public cancion(String titulo, String cancion) {
        this.titulo = titulo;
        this.cancion = cancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "cancion{" + "titulo=" + titulo + ", cancion=" + cancion + '}';
    }
 
 
}
