package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio07 {
    /* Crear un programa que pida una frase y si esa frase es igual a 'eureka' el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;

        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        System.out.println("LA PRIMERA LETRA ES: " + frase.substring(1,2));
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
}
