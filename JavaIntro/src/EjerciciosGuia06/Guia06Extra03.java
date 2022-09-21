package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Extra03 {
    /* Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("ingrese una letra");
        letra = leer.next();
        if((letra.length()>1) || (letra.length()==0)){
            System.out.println("Debia ingresar solo 1 letra!");
        }else{
            if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
            || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
                System.out.println("es una vocal");
            }else{
                System.out.println("No es una vocal");
            }
        }
    }
}
