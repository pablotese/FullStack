package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio21 {
    /* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] aux = new int[03][03];
        int []  pos = new int[02];
        int []  posOrig = new int[02];
        Boolean encontro = false;
        pos[0] = 0;
        pos[1] = 0;

        // cargo matrix de 10 x 10:
        int[][] M  = {
                { 01, 26, 36, 47, 05, 06, 72, 81, 95, 10},
                { 11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
                { 56, 78, 87, 90,  9, 90, 17, 12, 87, 67},
                { 41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
                { 32, 76, 79, 01, 36, 05, 67, 96, 12, 11},
                { 99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
                { 67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
                { 98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
                { 24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
                { 21, 68, 78, 98, 90, 67, 12, 41, 65, 12}
        };

        // cargo matrix de 3 x 3:
        int[][] P = {
                { 36, 05, 67},
                { 89, 90, 75},
                { 14, 22, 26}
        };

        while(!encontro || (pos[0]==99 && pos[1]==99)){
            armarMatrizAux(M, aux, pos, posOrig);
            mostrarMatrix3x3(aux);
            encontro = sosIguales(aux, P);
        }
        if(encontro){
            System.out.println("LA ENCONTRO :O");
            System.out.println("FILA:" + posOrig[0] + " COLUMNA:" + posOrig[1]);
        }else{
            System.out.println("No se encuentra en la matriz");
        }
    }

    private static void mostrarMatrix3x3(int[][] aux) {
        int i=0, j=0;
        for(i=0 ; i<3 ; i++){
            for(j=0 ; j<3 ; j++){
                System.out.print(aux[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void armarMatrizAux(int[][] m, int[][] aux, int [] pos, int[] posOrig) {
        posOrig[0] = pos[0];
        posOrig[1] = pos[1];
        int i=0, j=0, fil=0, col=0;
        for(i=pos[0] ; i<(pos[0]+3) ; i++){
            for(j=pos[1] ; j<(pos[1]+3) ; j++){
                aux[fil][col] = m[i][j];
                col++;
            }
            fil++;
            col=0;
        }
        if(pos[1]<7){
            pos[1]++;
        }else{
            if(pos[0]<7){
                pos[0]++;
                pos[1] = 0;
            }else{
                pos[0] = 99; // marca de que ya la recorrí toda
                pos[1] = 99; // una posicion invalida
            }
        }
    }

    private static Boolean sosIguales(int[][] aux, int[][] P) {
        int i=0, j=0;
        Boolean iguales = true;
        for(i=0 ; i<3 ; i++){
            for(j=0 ; j<3 ; j++){
                if (aux[i][j] != P[i][j]){
                    iguales = false;
                }
            }
        }
        return iguales;
    }
}
