package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio02 {
    /* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();

        System.out.println("Hola " + nombre + "!");
    }
}
