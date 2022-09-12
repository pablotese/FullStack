package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio01 {
    /* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Ingrese un numero entero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        num2 = leer.nextInt();

        suma = sumar(num1, num2);
        System.out.println("La suma es de " + num1 + " y " + num2 + " es: " + suma);

    }
    public static int sumar(int num1, int num2){
        return num1+num2;
    }
}
