
package servicio;

import entidad.cafetera;
import java.util.Scanner;

public class cafeteraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public cafetera llenarCafetera() {
        cafetera cafe = new cafetera(); //instancio el objeto de la lase cafetera
        cafe.setCapacidadMaxima(1500);
        cafe.setCantidadAcutal(cafe.getCapacidadMaxima());
        return cafe;
    }

    public void servirTaza(cafetera cafe) {
        System.out.println("ingrese tamanio de taza a servir");
        System.out.println("1 - taza chica");
        System.out.println("2 - taza mediana");
        System.out.println("3 - taza grande");
        int taza;
        int eleccion = leer.nextInt();

        switch (eleccion) {
            case 1:
                taza = 100;
                if (cafe.getCantidadAcutal() >= 100) {
                    cafe.setCantidadAcutal(cafe.getCantidadAcutal() - taza);
                    System.out.println("Se sirvio su taza chica");
                }
                if  (cafe.getCantidadAcutal() <= 99) {
                    System.out.println("La taza se sirvio con la cantidad actual restante" + cafe.getCantidadAcutal());
                }
                break;
            case 2:
                taza = 200;
                if (cafe.getCantidadAcutal() >= 200) {
                    cafe.setCantidadAcutal(cafe.getCantidadAcutal() - taza);
                    System.out.println("Se sirvio su taza mediana");
                }
                if (cafe.getCantidadAcutal() <= 199) {
                    System.out.println("La taza se sirvio con la cantidad actual restante" + cafe.getCantidadAcutal());
                }
                break;
            case 3:
                taza = 300;
                if (cafe.getCantidadAcutal() >= 300) {
                    cafe.setCantidadAcutal((cafe.getCantidadAcutal()) - (taza));
                    System.out.println("Se sirvio su taza grande");
                    if (cafe.getCantidadAcutal() <= 299) {
                        System.out.println("La taza se sirvio con la cantidad actual restante" + cafe.getCantidadAcutal());
                    }
                    break;
                }
        }
    }
    public void vaciarCafetera(cafetera cafe) {
        System.out.println("La cantidad restante es "+ cafe.getCantidadAcutal() +", se vaciara la cafetera");
        cafe.setCantidadAcutal(0);
    }

    public void agregarCafe(cafetera cafe) {
        System.out.println("Ingrese la cantidad de cafe a aniadir en ml");
        int cafesuma = leer.nextInt();
        cafe.setCantidadAcutal(cafesuma + (cafe.getCantidadAcutal()));
    }

    public cafetera cafetera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
