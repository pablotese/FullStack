package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio13 {
    /* Dibujar un cuadrado de N elementos por lado utilizando el carácter "*". Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cant = 0, i=0, j=0;

        System.out.println("Ingrese el valor de N: ");
        cant = leer.nextInt();

        for(i=1 ; i <=cant ; i++){
            for(j=1 ; j <=cant ; j++){
                if (i==1 || i==cant || j==1 || j==cant){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
