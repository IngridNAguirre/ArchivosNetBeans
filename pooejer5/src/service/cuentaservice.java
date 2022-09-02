
package service;

import entidad.cuenta;
import java.util.Scanner;

/**
 *
 * @author ingrid
 */
public class cuentaservice { 
    Scanner leer = new Scanner(System.in);
    public cuenta cuenta(){ //procedimiento para crear cuenta --- public <entidad> <nombre que le doy al procedimineto>
            cuenta numCuenta = new cuenta(); //instancio o creo un nuevo objeto en mi entidad cuenta
        System.out.println("**** BIENVENIDO ****");
        System.out.println("");
        System.out.println("Ingrese numero de cuenta: ");
        numCuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese DNI del Cliente: ");
        numCuenta.setDNIdelCliente(leer.nextInt());
    return numCuenta;    
    }
    public void ingresar (cuenta numCuenta){
        System.out.println("Ingrese la cantidad de $$ a ingresar a la cuenta: ");
        double ingreso = leer.nextDouble();
        
        numCuenta.setSaldoActual(ingreso + numCuenta.getSaldoActual());
        
        System.out.println("Saldo actual de la cuenta es: "+numCuenta.getSaldoActual());
    }
    public void retirar (cuenta numCuenta){
        System.out.println("Ingrese la cantidad de $$ a retirar de la cuenta: ");
        double retiro = leer.nextDouble();
        
        if (numCuenta.getSaldoActual()> retiro){
        numCuenta.setSaldoActual(numCuenta.getSaldoActual() - retiro);
        System.out.println("Saldo actual de la cuenta es: "+numCuenta.getSaldoActual());
        }
        else{
           System.out.println("Saldo actual de la cuenta es: 0"); 
           numCuenta.setSaldoActual(0);
        }
    }
    public void extraccionRapida (cuenta numCuenta){
        System.out.println("Ingrese el $$ a retirar: ");
        double retirorap = leer.nextDouble();
        
        if (retirorap <=((numCuenta.getSaldoActual()*20)/100)){
            System.out.println("Ud esta retirando el dinero solicitado"); 
            numCuenta.setSaldoActual(numCuenta.getSaldoActual()-retirorap);
            System.out.println("Saldo actual de la cuenta es: "+numCuenta.getSaldoActual());
        }
        else{
            System.out.println("Su retiro rapido excede el 20% de su saldo y no sera ejecutado");
            System.out.println("Saldo actual de la cuenta es: "+numCuenta.getSaldoActual());
        }
    }
    public void consultarSaldo (cuenta numCuenta){
        System.out.println("Ingrese el numero de cuenta a consultar: ");
        int cuenta1 = leer.nextInt();
        
        if (cuenta1 == numCuenta.getNumeroCuenta()){
         System.out.println("Saldo actual de la cuenta es: "+numCuenta.getSaldoActual()); 
        }
        else{
            System.out.println("El numero de cuenta es incorrecto");
        }
    }
    public void consultarDatos (cuenta numCuenta){
        System.out.println(numCuenta.toString());
    }
   
}