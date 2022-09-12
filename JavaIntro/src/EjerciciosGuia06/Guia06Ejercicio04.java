package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio04 {
    /* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double tempCent=0, tempFahr=0;
        System.out.println("Ingrese la temperatura en grados centigrados: ");
        tempCent = leer.nextDouble();

        tempFahr = 32 + (9 * tempCent / 5);

        System.out.println("Hace " + tempCent + " grados centigrados o " + tempFahr + " grados Fahrenheit");
    }
}
