package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio06 {
    /* Crear un programa que dado un numero determine si es par o impar. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=0;

        System.out.println("Ingrese un numero entero: ");
        num = leer.nextInt();

        if (num%2 ==0){
            System.out.println("El Numero: " + num + " es PAR");
        }
        else{
            System.out.println("El Numero: " + num + " es IMPAR");
        }
    }
}
