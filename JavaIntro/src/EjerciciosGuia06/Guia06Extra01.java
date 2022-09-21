package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Extra01 {
    /* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, dias, horas;

        System.out.println("Ingrese los minutos: ");
        num1 = leer.nextInt();
        dias = num1/(1440);
        horas = (num1-(1440*dias))/60;

        System.out.println("Los " + num1 + " minutos son " + dias + " dias y " + horas + " horas");

    }
}
