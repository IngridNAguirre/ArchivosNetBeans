
package servicio;
import entidad.matematica;

public class matematicaservicio {
  
    public float devolverMayor(matematica m){
        float mayor;
        if (m.getNum1() > m.getNum2()){
            mayor = m.getNum1();
        }    
        else{
            mayor = m.getNum2();
        }
        return mayor;
    }
    
    public void calcularPotencia(matematica m){ 
        int rednum1, rednum2;
        if (devolverMayor(m) == (m.getNum1())){
        rednum1 =Math.round(m.getNum1());
        int potencia = (int) Math.pow((m.getNum1()),(m.getNum2()));
        }
        if ((devolverMayor(m)) == (m.getNum2())){
        rednum2 = Math.round(m.getNum2());
        int potencia = (int) Math.pow((m.getNum2()),(m.getNum1()));
        }
        }
   
    public void calcularRaiz (matematica m){
        if (m.getNum1() < m.getNum2());
        double raiz =  Math.sqrt(m.getNum2());
        
    }
}
