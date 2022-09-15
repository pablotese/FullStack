package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio17 {
    /* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N, i=0;
        System.out.println("Ingrese el valor de N: ");
        N = leer.nextInt();
        int[] numeros = new int[N];

        for (i=0; i <N; i++){
            numeros[i] = (int) Math.floor(Math.random()*(1-99999+1)+99999);
        }
        muestra_numeros(numeros, N);
        busca_numero(numeros, N);
    }

    private static void busca_numero(int[] numeros, int N) {
        int i = 0, undig=0, dosdig=0, tresdig=0, cuatrodig=0, cincodig=0;
        int longitud =0;
        String numeroAux="";
        for (i=0; i <N; i++){
            numeroAux = Integer.toString(numeros[i]);
            longitud = numeroAux.length();
            switch (longitud){
                case 1 :
                    undig ++ ;
                    break;
                case 2 :
                    dosdig ++ ;
                    break;
                case 3:
                    tresdig ++;
                    break;
                case 4:
                    cuatrodig ++;
                    break;
                case 5:
                    cincodig ++ ;
                    break;
            }
        }
        System.out.println("Hay " + undig + " numeros con 1 digito");
        System.out.println("Hay " + dosdig + " numeros con 2 digitos");
        System.out.println("Hay " + tresdig + " numeros con 3 digitos");
        System.out.println("Hay " + cuatrodig + " numeros con 4 digitos");
        System.out.println("Hay " + cincodig + " numeros con 5 digitos");
    }

    private static void muestra_numeros(int[] numeros , int N) {
        int i=0;
        for (i=0; i <N; i++){
            System.out.println("numero: " + numeros[i]);
        }
    }
}
