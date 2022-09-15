package EjerciciosGuia06;

public class Guia06Ejercicio19 {
    /* Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
*/

    public static void main(String[] args) {
        int i=0, j=0;
        int[][] matrix = new int[4][4];

        for (i=0; i <4; i++){
            for(j=0; j <4; j++){
                matrix[i][j] = (int) Math.floor(Math.random()*(1-9+1)+9);
            }
        }
        System.out.println("normal:");
        muestra_numeros(matrix);
        System.out.println("traspuesta:");
        muestra_traspuesta(matrix);
    }

    private static void muestra_traspuesta(int[][] matrix) {
        int i=0, j=0;
        for (i=0; i <4; i++){
            for(j=0; j <4; j++){
                System.out.print( matrix[j][i] + " ");
            }
            System.out.println("");
        }
    }

    private static void muestra_numeros(int[][] matrix) {
        int i=0, j=0;
        for (i=0; i <4; i++){
            for(j=0; j <4; j++){
                System.out.print( matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
