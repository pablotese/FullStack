package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio16 {
    /* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido.
*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N, i=0, x=0;
        System.out.println("Ingrese el valor de N: ");
        N = leer.nextInt();
        int[] numeros = new int[N];

        for (i=0; i <N; i++){
            numeros[i] = (int) Math.floor(Math.random()*(1-99+1)+99);
        }
        muestra_numeros(numeros, N);
        System.out.println("Ingrese el valor de N: ");
        x = leer.nextInt();
        busca_numero(numeros, x, N);
    }

    private static void busca_numero(int[] numeros, int x , int N) {
        int i = 0, encontro=0, pos=0;
        for (i=0; i <N; i++){
            if (numeros[i] == x ){
                if (encontro == 0) {
                    pos= i;
                }
                encontro++ ;
            }
        }
        if (encontro > 0) {
            System.out.println("El numero se encontró en la posición " + pos);
            System.out.println("El numero está " + encontro + " veces en el vector");
        }
    }

    private static void muestra_numeros(int[] numeros , int N) {
        int i=0;
        for (i=0; i <N; i++){
            System.out.println("numero: " + numeros[i]);
        }
    }
}
