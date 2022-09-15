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
        double valor=0.0, convertido=0.0;
        String divisa="";

        System.out.println("Ingrese el valor de Euros a convertir ");
        valor = leer.nextDouble();
        System.out.println("Ingrese la moneda a la que quiere convertir (libras / pesos / yenes):");
        divisa = leer.next();
        convertir(valor, divisa);
    }

    private static void convertir(double valor, String divisa) {
        System.out.println("El cambio de divisas es: ");
        if (divisa.equalsIgnoreCase("libras")){
            System.out.println(valor * 0.86);
        }else if (divisa.equalsIgnoreCase("pesos")){
            System.out.println(valor * 1.28611);
        }else if (divisa.equalsIgnoreCase("yenes")){
            System.out.println(valor * 129.852);
        }else {
            System.out.println("La divisa ingresada es incorrecta");
        }
    }

}
