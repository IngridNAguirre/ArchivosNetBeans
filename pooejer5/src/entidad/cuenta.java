
package entidad;

/**
 *
 * @author ingrid
 */
public class cuenta {
 public int numeroCuenta;
 public int DNIdelCliente;
 public double saldoActual;
 public double interes;

    public cuenta() {
    }

    public cuenta(int numeroCuenta, int DNIdelCliente, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNIdelCliente = DNIdelCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNIdelCliente() {
        return DNIdelCliente;
    }

    public void setDNIdelCliente(int DNIdelCliente) {
        this.DNIdelCliente = DNIdelCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "cuenta{" + "numeroCuenta=" + numeroCuenta + ", DNIdelCliente=" + DNIdelCliente + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
 
 
 
}
