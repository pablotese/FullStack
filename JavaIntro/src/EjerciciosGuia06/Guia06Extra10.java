package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Extra10 {
    /* Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1=0, num2=0, resultado=0, adivina=0;

        num1 = (int) Math.floor(Math.random()*(1-9+1)+9);
        num2 = (int) Math.floor(Math.random()*(1-9+1)+9);
        System.out.println("num1:" + num1 + " num2:" + num2);

        System.out.println("Ingrese un numero:");
        adivina = leer.nextInt();

        resultado = num1 *  num2 ;

        while(resultado != adivina){
            System.out.println("intente nuevamente:");
            adivina = leer.nextInt();
        }
        System.out.println("logrado");
    }
}
