package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio15 {
    /* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
*/

    public static void main(String[] args) {
        int[] numeros = new int[100];
        int i=0;
        for (i=0; i <100; i++){
            numeros[i] = i;
        }
        muestra_numeros(numeros);
    }

    private static void muestra_numeros(int[] numeros) {
        int i=0;
        for (i=99; i>= 0; i--){
            System.out.println("NUMERO: " + numeros[i]);
        }
    }
}
