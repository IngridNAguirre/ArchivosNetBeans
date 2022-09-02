/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer9;

import entidad.matematica;
import servicio.matematicaservicio;



public class ejer9 {

    
    public static void main(String[] args) {
              
       matematica m = new matematica();
       matematicaservicio ms = new matematicaservicio();
       
       m.setNum1(((float)Math.random())*10);
       
           
    }
    
}
