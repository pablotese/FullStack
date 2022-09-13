package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio14 {
    /* Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
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
