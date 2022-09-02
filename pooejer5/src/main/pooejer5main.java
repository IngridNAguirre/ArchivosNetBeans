
package main;

import entidad.cuenta;
import service.cuentaservice;

/**
 *
 * @author ingrid
 */
public class pooejer5main {

    
    public static void main(String[] args) {
       cuentaservice cuentaBanco = new cuentaservice(); //instancio nuevo objeto de mi service
       cuenta numCuenta = cuentaBanco.cuenta(); //llamo el objeto de mi entidad
       
       
       cuentaBanco.ingresar(numCuenta);
       cuentaBanco.retirar(numCuenta);
       cuentaBanco.extraccionRapida(numCuenta);
       cuentaBanco.consultarSaldo(numCuenta);
       cuentaBanco.consultarDatos(numCuenta);
   
    }
    
}
