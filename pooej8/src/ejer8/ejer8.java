
package ejer8;
import entidad.cadena;
import servicio.cadenaservicio;


public class ejer8 {

    
    public static void main(String[] args) {
        cadenaservicio trabajarConCadena = new cadenaservicio();
        cadena frase = trabajarConCadena.cadena();
        
        trabajarConCadena.mostrarVocales(frase);
        System.out.println("");
        trabajarConCadena.invertirFrase(frase);
        trabajarConCadena.vecesRepetido(frase);
        trabajarConCadena.compararLongitud(frase);
        trabajarConCadena.unirFrases(frase);
        trabajarConCadena.reemplazar(frase);
        trabajarConCadena.contiene(frase);
    }
    
}
