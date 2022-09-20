package EjerciciosGuia06;

public class Guia06Ejercicio19 {
    /* Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa)..
*/

    public static void main(String[] args) {
        int i=0, j=0;
        Boolean respuesta = true;
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
        respuesta = esAntiSimetrica(matrix);
        System.out.println("ES ANTISIMETRICA? : " + respuesta);
    }

    private static Boolean esAntiSimetrica(int[][] matrix) {
        int i=0, j=0;
        Boolean resp = true;
        for (i=0; i <4; i++){
            for(j=0; j <4; j++){
                if(matrix[i][j] != (-1*matrix[j][i])){
                    resp = false;
                }
            }
        }
        return resp;
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
