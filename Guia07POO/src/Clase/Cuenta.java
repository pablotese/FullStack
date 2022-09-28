package Clase;

public class Cuenta {
    private int    numeroCuenta;
    private long   DNI;
    private double saldoActual;
    private float  interes;

    public Cuenta(int numeroCuenta, long DNI, double saldoActual, float interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public Cuenta() {
    }

    public void ingresar(double ingreso){
            this.saldoActual = this.saldoActual + ingreso;
    }

    public void retirar(double retiro){
        if ((this.saldoActual - retiro) >= 0){
            this.saldoActual = this.saldoActual - retiro;
        } else{
            this.saldoActual = 0;
        }
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }
}
