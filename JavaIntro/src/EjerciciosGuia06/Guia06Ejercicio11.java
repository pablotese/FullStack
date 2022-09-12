package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio11 {
    /* Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
 MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1=0, numero2=0;
        Boolean salir = false;
        System.out.println("Ingrese el primer numero: ");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = leer.nextInt();
        System.out.println(" MENU\n" +
                "1. Sumar\n" +
                "2. Restar\n" +
                "3. Multiplicar\n" +
                "4. Dividir\n" +
                "5. Salir");
    }
}
