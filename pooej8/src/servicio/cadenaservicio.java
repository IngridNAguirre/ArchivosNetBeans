
package servicio;
import entidad.cadena;
import java.util.Scanner;

public class cadenaservicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
public cadena cadena(){
    cadena frase = new cadena();
        
    System.out.println("Ingrese una frase");
    frase.setFrase(leer.nextLine());
    frase.setLongitud(frase.getFrase().length());
    return frase;
    }

public void mostrarVocales(cadena frase){
int contvocal = 0;
String f1 = frase.getFrase();

for (int i=0; i<frase.getLongitud(); i++){
   if(f1.charAt(i) == ('a') || f1.charAt(i) == ('e') || f1.charAt(i) == ('i') || f1.charAt(i) == ('o') || f1.charAt(i) == ('u'));
contvocal = contvocal + 1;
}
System.out.printf("cantidad Vocales " + contvocal);
}    

public String invertirFrase (cadena frase){
    String cadenaInvertida = "";
    String f = frase.getFrase();
    
    for (int i = f.length() - 1; i >= 0; i--){
    cadenaInvertida = cadenaInvertida + f.charAt(i);
    }  
    System.out.println("La frase invertida es " + cadenaInvertida); 
    return cadenaInvertida;
    }

public void vecesRepetido (cadena frase){
    String f = frase.getFrase();
    
    System.out.println("Ingrese el caracter que desee buscar");
    char letra = leer.next().charAt(0); //Esto es para leer caracteres. El 0 corresponde a la posición.
        int contvocal = 0;

        for (int i = 0; i < frase.getLongitud(); i++) {
            if ((f.charAt(i) == (letra))) {
                contvocal = contvocal + 1;
            }    
        }
        System.out.println("El caracter indicado se repite en su frase " + contvocal + " veces.");
    }

public void compararLongitud (cadena frase){
    System.out.println("Ingrese una frase nueva");
    
        String f2 = leer.next();
        
        int long2 = f2.length();
        if (frase.getLongitud() == long2){
            System.out.println("Sus cadenas tienen la misma cantidad de caracteres.");
        } else {
            System.out.println("Sus cadenas no tienen la misma longitud.");
        }
    }

public void unirFrases (cadena frase) {
        System.out.println("Ingrese una nueva frase.");
        String f3 = leer.next();
        
        String f4 = frase.getFrase().concat(f3);
        
        System.out.println("Su nnueva frase es " + f4);
    }

public void reemplazar (cadena frase){
        System.out.println("Indique el nuevo caracter que desea introducir. ");
        char letra = leer.next().charAt(0);
        
        String f5 = frase.getFrase().replace('a', letra);
        System.out.println("Su nueva frase es "+ f5);
        
    }

public void contiene (cadena frase){
       System.out.println("Indique el nuevo caracter que desea reconocer. ");
        char letra = leer.next().charAt(0);
        String f = frase.getFrase();
        boolean verificarletra = false;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if ((f.charAt(i) == (letra))) {
              verificarletra = true;
            }
        }        
        System.out.println(verificarletra);
}
}
