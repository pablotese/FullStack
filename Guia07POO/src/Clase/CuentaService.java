package Clase;
import Clase.Cuenta;

import java.util.Scanner;

public class CuentaService {

    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese numeroCuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese DNI");
        cuenta.setDNI(leer.nextLong());
        System.out.println("ingrese saldoActual");
        cuenta.setSaldoActual(leer.nextDouble());
        System.out.println("ingrese interes");
        cuenta.setInteres(leer.nextFloat());

        return cuenta;
    }

    public void extraccionRapida(Cuenta cuenta, double extraccion){
        if(extraccion <= cuenta.getSaldoActual()*0.20){
            cuenta.retirar(cuenta.getSaldoActual()*0.20);
        }else{
            System.out.println("Se excede del maximo permitido 20% del saldo");
        }
    }

    public double consultarSaldo(Cuenta cuenta){
        return cuenta.getSaldoActual();
    }
    public void consultarDatos(Cuenta cuenta){
        System.out.println("DNI:" + cuenta.getDNI());
        System.out.println("Nro Cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta.getSaldoActual());
        System.out.println("Interes: " + cuenta.getInteres());
    }
}
