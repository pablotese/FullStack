package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio20 {
    /* Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i=0, j=0;
        Boolean ok = false;
        Boolean respuesta = true;
        int[][] matrix = new int[3][3];

        for (i=0; i <3; i++){
            for(j=0; j <3; j++){
                ok = false;
                while (!ok) {
                    System.out.println("Ingrese un numero de 1 a 9");
                    matrix[i][j] = leer.nextInt();
                    if(matrix[i][j] >= 1 && matrix[i][j] <= 9 ){
                        ok = true;
                    }
                }
            }
        }
        System.out.println("normal:");
        muestra_numeros(matrix);

        Boolean resp = esMagica(matrix);
        System.out.println("ES MAGICA ? : " + resp);
    }

    private static Boolean esMagica(int[][] matrix) {
        int i=0, j=0, sumfil1, sumfil2, sumfil3, sumcol1, sumcol2, sumcol3, sumdiag1, sumdiag2;
        Boolean rta = false;
        sumfil1 =  (matrix[0][0] + matrix[0][1] + matrix[0][2]);
        sumfil2 =  (matrix[1][0] + matrix[1][1] + matrix[1][2]);
        sumfil3 =  (matrix[2][0] + matrix[2][1] + matrix[2][2]);
        sumcol1 =  (matrix[0][0] + matrix[1][0] + matrix[2][0]);
        sumcol2 =  (matrix[0][1] + matrix[1][1] + matrix[2][1]);
        sumcol3 =  (matrix[0][2] + matrix[1][2] + matrix[2][2]);
        sumdiag1 = (matrix[0][0] + matrix[1][1] + matrix[2][2]);
        sumdiag2 = (matrix[0][2] + matrix[1][1] + matrix[2][0]);
        if ( sumfil1 == sumfil2 && sumfil2 == sumfil3 && sumfil1 == sumcol1 && sumcol1 == sumcol2 && sumcol2 == sumcol3
                && sumcol3 == sumdiag1 && sumdiag1 == sumdiag2) {
                    rta = true;
        }
        return rta;
    }

    private static void muestra_numeros(int[][] matrix) {
        int i=0, j=0;
        for (i=0; i <3; i++){
            for(j=0; j <3; j++){
                System.out.print( matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
