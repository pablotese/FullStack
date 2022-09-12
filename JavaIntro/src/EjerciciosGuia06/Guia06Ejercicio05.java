package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio05 {
    /* Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt(). */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=0, doble=0, triple=0;
        double raizcuad=0;
        System.out.println("Ingrese un numero entero: ");
        num = leer.nextInt();

        doble = num * 2;
        triple = num * 3;
        raizcuad = Math.sqrt(num);

        System.out.println("Numero: " + num + " Doble: " + doble + " Triple: " + triple + " Raiz cuadrada: " + raizcuad);
    }
}
