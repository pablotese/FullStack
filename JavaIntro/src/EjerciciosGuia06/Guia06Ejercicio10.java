package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio10 {
    /* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite=0, numero=0, suma=0;
        System.out.println("Ingrese el numero limite: ");
        limite = leer.nextInt();
        while(suma <= limite){
            System.out.println("Ingrese un numero entero: ");
            numero = leer.nextInt();
            suma = suma + numero;
        }
        System.out.println("La suma es de " + suma);
    }
}
