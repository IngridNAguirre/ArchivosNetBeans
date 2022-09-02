
package entidad;


public class matematica {
   private float num1 , num2;

    public matematica() {
    }

    public matematica(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
   
   
}
